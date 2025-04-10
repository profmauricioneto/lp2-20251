package org.unichristus.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverSenderEmail extends Observer {
    private List<String> emails;

    public ObserverSenderEmail(Subject subject) {
        emails = new ArrayList<>();
        subject.attach(this);
    }

    public void showEmails() {
        for (String email: emails) {
            System.out.println(email);
        }
    }

    public void addEmail(String email) {
        this.emails.add(email);
    }

    @Override
    public void update() {
        System.out.println("Enviando emails para: ");
        showEmails();
    }
}
