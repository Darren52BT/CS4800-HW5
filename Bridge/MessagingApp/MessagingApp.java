package Bridge.MessagingApp;

import Bridge.MessageType.Media;

public abstract interface MessagingApp {

    public abstract void sendMessage(Media media);
}
