package Bridge.MessagingApp;

import Bridge.MessageType.Media;

public class TelegramMessagingApp extends MessagingApp {
    @Override
    public void sendMessage(Media media) {
        System.out.println("Telegram: " + media.getContent());

    }
}
