package com.ilegra.jovenstalentos.coreengineering.a11;

import static com.ilegra.jovenstalentos.coreengineering.a11.TransportationFactory.TransportationType.AIRPLANE;
import static com.ilegra.jovenstalentos.coreengineering.a11.TransportationFactory.TransportationType.CAR;

public class Main {

    static void main() {
        Transportation t1 = TransportationFactory.createTransportation(CAR);
        Transportation t2 = TransportationFactory.createTransportation(AIRPLANE);

        t1.start();
        t1.stop();

        t2.start();
        t2.stop();
    }
}
