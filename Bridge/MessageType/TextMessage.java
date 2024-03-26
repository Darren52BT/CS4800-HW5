package Bridge.MessageType;

import Bridge.MessagingApp.MessagingApp;

public class TextMessage implements MessageType {
    private MessagingApp messagingApp;
    private Media content;

    @Override
    public void setMessageApp(MessagingApp messagingApp) {
        this.messagingApp = messagingApp;
    }

    @Override
    public void setContent(Media content) {
        this.content = content;
    }

    @Override
    public String getMediaType() {
        return this.content.getType();
    }

    @Override
    public <MediaType> MediaType getContent() {
       return (MediaType) this.content.getContent();
    }

    @Override
    public void sendMessage() {
        this.messagingApp.sendMessage(this.content);
    }
}
