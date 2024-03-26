package Bridge.MessagingApp;

import Bridge.MessageType.Media;

public class FacebookMessagingApp implements MessagingApp {
    @Override
    public void sendMessage(Media media) {
        System.out.println("Facebook: " + media.getContent());

    }
}
