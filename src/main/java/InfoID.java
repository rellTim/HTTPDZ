import com.fasterxml.jackson.annotation.JsonProperty;

public class InfoID {
    private final String id;
    private final String text;
    private final String cat;
    private final String user;
    private final int upVotes;

    public InfoID(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("cat") String cat,
            @JsonProperty("user") String user,
            @JsonProperty("upVotes") int upVotes
    ) {
        this.id = id;
        this.text = text;
        this.cat = cat;
        this.user = user;
        this.upVotes = upVotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getCat() {
        return cat;
    }

    public String getUser() {
        return user;
    }

    public int getUpVotes() {
        return upVotes;
    }

    @Override
    public String toString() {
        return  " id - " + id +
                " text - " + text +
                " cat - " + cat +
                " user - " + user +
                " upVotes - " + upVotes;
    }
}
