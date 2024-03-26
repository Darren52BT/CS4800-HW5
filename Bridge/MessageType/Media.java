package Bridge.MessageType;

public class Media {
    private String content;
    private String type;

    public Media(String content, String type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
