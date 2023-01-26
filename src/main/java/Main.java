import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.util.List;

public class Main {
    private static final String IP = "https://raw.githubusercontent.com/netology-code/jd-homeworks/master/http/task1/cats";

    public static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {
        var httpClient = HttpClients.createDefault();
        var httpGet = new HttpGet(IP);
        try (var response = httpClient.execute(httpGet)
        ) {
            var infoID = mapper.readValue(response.getEntity().getContent(), new TypeReference<List<InfoID>>() {
            });
            infoID.stream().filter(value -> value.getUpVotes() > 0).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        httpClient.close();
    }
}
