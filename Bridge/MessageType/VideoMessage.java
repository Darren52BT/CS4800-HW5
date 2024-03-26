package Bridge.MessageType;

import Bridge.MessagingApp.MessagingApp;

public class VideoMessage implements MessageType {
    @Override
    public void setMessageApp(MessagingApp messagingApp) {
        
    }

    @Override
    public void setContent(Media content) {

    }

    @Override
    public String getMediaType() {
        return null;
    }

    @Override
    public <MediaType> MediaType getContent() {
        return null;
    }

    @Override
    public void sendMessage() {

    }
}
