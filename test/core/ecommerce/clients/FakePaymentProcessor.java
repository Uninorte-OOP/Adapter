/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.ecommerce.clients;

import core.ecommerce.implementation.PaymentProcessor;

/**
 *
 * @author edangulo
 */
public class FakePaymentProcessor implements PaymentProcessor {
    
    private int payments = 0;
    private double lastAmount = 0;

    @Override
    public void pay(double amount) {
        payments++;
        lastAmount = amount;
    }

    public int getPayments() {
        return payments;
    }
    
    public double getLastAmount() {
        return lastAmount;
    }
    
}
