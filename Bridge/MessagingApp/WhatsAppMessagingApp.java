package Bridge.MessagingApp;

import Bridge.MessageType.Media;

public class WhatsAppMessagingApp implements MessagingApp {

    @Override
    public void sendMessage(Media media) {
        System.out.println("Whatsapp: " + media.getContent());
    }
}
