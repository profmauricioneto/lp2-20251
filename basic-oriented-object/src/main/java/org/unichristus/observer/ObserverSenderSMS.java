package org.unichristus.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverSenderSMS extends Observer {
    private List<String> phones;

    public ObserverSenderSMS(Subject subject) {
        phones = new ArrayList<>();
        subject.attach(this);
    }

    public void showPhones() {
        for (String phone: phones) {
            System.out.println(phone);
        }
    }

    public void addPhone(String phone) {
        this.phones.add(phone);
    }

    @Override
    public void update() {
        System.out.println("Enviando SMS para: ");
        showPhones();
    }
}
