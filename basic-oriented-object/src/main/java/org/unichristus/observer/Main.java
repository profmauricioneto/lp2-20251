package org.unichristus.observer;

public class Main {
    public static void main(String[] args) {
        Subject observado = new Subject();

        ObserverSenderEmail email1 = new ObserverSenderEmail(observado);
        ObserverSenderEmail email2 = new ObserverSenderEmail(observado);
        ObserverSenderSMS sms1 = new ObserverSenderSMS(observado);
        ObserverSenderSMS sms2 = new ObserverSenderSMS(observado);
        email1.addEmail("email1@gmail.com");
        email2.addEmail("email2@gmail.com");
        sms1.addPhone("085 1122334455");
        sms2.addPhone("085 5544332211");

        for (int i = 0; i < 3; i++) {
            if (observado.isEven(i)) {
                observado.notifyAllAttached();
            }
        }
        Math.random();

    }
}
