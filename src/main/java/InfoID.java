import com.fasterxml.jackson.annotation.JsonProperty;

public class InfoID {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final int upvotes;

    public InfoID(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String cat,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") int upVotes
    ) {
        this.id = id;
        this.text = text;
        this.type = cat;
        this.user = user;
        this.upvotes = upVotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getCat() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public int getUpVotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return  " \nid - " + id
                 + " \ntext - " + text
                 + " \ncat - " + type
                 + " \nuser - " + user
                 + " \nupVotes - " + upvotes;
    }
}
