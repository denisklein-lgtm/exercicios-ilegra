package com.ilegra.jovenstalentos.coreengineering.a15;

public class SMSNotificationHandler extends NotificationHandler {

    private static final RequestType REQUEST_TYPE = RequestType.SMS;

    public SMSNotificationHandler(NotificationHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if(REQUEST_TYPE.equals(request.type())) {
            System.out.println("Request type %s is being executed".formatted(request.type()));
            System.out.println("Message received: %s".formatted(request.message()));
        } else {
            dispatchToNext(request);
        }
    }
}
