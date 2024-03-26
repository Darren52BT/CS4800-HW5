package Bridge;

import Bridge.MessageType.*;
import Bridge.MessagingApp.FacebookMessagingApp;
import Bridge.MessagingApp.MessagingApp;
import Bridge.MessagingApp.TelegramMessagingApp;
import Bridge.MessagingApp.WhatsAppMessagingApp;

class Driver {
    public static void main(String[] args) {
        MessagingApp facebook = new FacebookMessagingApp();
        MessagingApp whatsapp = new WhatsAppMessagingApp();
        MessagingApp telegram = new TelegramMessagingApp();

        MessageType video = new VideoMessage();
        video.setContent(new Media("very cool video"));
        MessageType image = new ImageMessage();
        image.setContent(new Media("very cool image"));
        MessageType text = new TextMessage();
        text.setContent(new Media("very cool text"));


        MessagingApp[] messagingApps = {facebook, whatsapp, telegram};
        MessageType[] messages = {video, image, text};

        for (MessagingApp app : messagingApps) {
            for (MessageType message : messages) {
                message.setMessageApp(app);
                message.sendMessage();
            }
        }
    }

}
