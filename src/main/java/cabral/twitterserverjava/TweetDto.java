package cabral.twitterserverjava;

public class TweetDto {
    String user;
    String content;
    String timestamp;
    int likes;
    int retweets;
    int responses;

    public TweetDto(String user, String content, String timestamp, int likes, int retweets, int responses) {
        this.user = user;
        this.content = content;
        this.timestamp = timestamp;
        this.likes = likes;
        this.retweets = retweets;
        this.responses = responses;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getRetweets() {
        return retweets;
    }

    public void setRetweets(int retweets) {
        this.retweets = retweets;
    }

    public int getResponses() {
        return responses;
    }

    public void setResponses(int responses) {
        this.responses = responses;
    }
}
