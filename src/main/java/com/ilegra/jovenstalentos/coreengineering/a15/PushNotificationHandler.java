package com.ilegra.jovenstalentos.coreengineering.a15;

public class PushNotificationHandler extends NotificationHandler {

    private static final RequestType REQUEST_TYPE = RequestType.PUSH;

    public PushNotificationHandler(NotificationHandler next) {
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
