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
public class Client {
    
    private PaymentProcessor processor;

    public void setProcessor(PaymentProcessor processor) {
        this.processor = processor;
    }
    
    public void requestPayment(double amount) {
        processor.pay(amount);
    }
    
}
