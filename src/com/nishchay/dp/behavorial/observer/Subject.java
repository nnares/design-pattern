package com.nishchay.dp.behavorial.observer;

import com.nishchay.dp.behavorial.observer.Observable;
import com.nishchay.dp.behavorial.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Observable {

    private List<Observer> users =  new ArrayList<>();

    private final String prodName; // immutable
    private String status; // mutable- lead state change

    public Subject(String name) {
        super();
        this.prodName = name;
        this.status = "unknown";
    }

    public String getProdName() {
        return prodName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObserver();
    }

    @Override
    public void register(Observer observer) {
        users.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        users.remove(observer);
    }

    @Override
    public void notifyObserver() {
        // notify all the observer
        for (Observer user : users) {
            user.sendNotification();
        }
    }
}
