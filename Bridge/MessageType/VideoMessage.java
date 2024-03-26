package Bridge.MessageType;

import Bridge.MessagingApp.MessagingApp;

public class VideoMessage implements MessageType {
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
        return "Video";
    }

    @Override
    public <MediaType> MediaType getContent() {
        return (MediaType) this.content.getContent();
    }

    @Override
    public void sendMessage() {
        this.messagingApp.sendMessage(this.content);
        System.out.println("Video Sent");

    }
}
