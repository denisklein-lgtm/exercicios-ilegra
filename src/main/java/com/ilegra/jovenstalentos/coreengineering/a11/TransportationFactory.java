package com.ilegra.jovenstalentos.coreengineering.a11;

public class TransportationFactory {

    public static enum TransportationType {
        CAR,
        AIRPLANE
    }

    public static Transportation createTransportation(TransportationType type) {
        return switch (type) {
            case AIRPLANE -> new Airplane();
            case CAR -> new Car();
            default -> throw new IllegalArgumentException();
        };
    }
}
