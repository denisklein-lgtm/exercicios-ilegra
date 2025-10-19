package com.ilegra.jovenstalentos.coreengineering.a15;

public class Main {

    static void main() {
        NotificationHandler smsHandler = new SMSNotificationHandler(null);
        NotificationHandler emailHandler = new EmailNotificationHandler(smsHandler);
        NotificationHandler pushHandler = new PushNotificationHandler(emailHandler);

        var notifSms = new Request(RequestType.SMS, "Notificação via SMS");

        pushHandler.handleRequest(notifSms);
    }
}
