package Bridge.MessageType;

import Bridge.MessagingApp.MessagingApp;


public interface MessageType {
    public void setMessageApp(MessagingApp messagingApp);
    public void setContent(Media content);
    public String getMediaType();
    <MediaType> MediaType getContent();
    public void sendMessage();
}
