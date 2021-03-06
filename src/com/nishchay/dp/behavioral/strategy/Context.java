package com.nishchay.dp.behavioral.strategy;

public class Context {

    private PaymentStrategy strategy;

    public Context(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void doPayment(int amount) {
        strategy.pay(amount);
    }

}