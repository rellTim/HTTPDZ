import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.List;

public class Main {
    private static final String IP = "https://raw.githubusercontent.com/netology-code/jd-homeworks/master/http/task1/cats";

    public static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {
        var httpGet = new HttpGet(IP);
        try (var httpClient = HttpClients.createDefault()
        ) {
            var response = httpClient.execute(httpGet);
           // var entity = response.getEntity();
           // System.out.println(EntityUtils.toString(entity));
            var infoID = mapper.readValue(response.getEntity().getContent(), new TypeReference<List<InfoID>>() {
            });
            infoID.stream().filter(value -> value.getUpVotes() > 0).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
