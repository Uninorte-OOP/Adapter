/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.ecommerce.adapters;

import core.ecommerce.implementation.PaymentProcessor;
import org.paypal.gateways.PayPalGateway;

/**
 *
 * @author edangulo
 */
public class PayPalAdapter implements PaymentProcessor {
    
    private static final double TRM = 3237.83;
    private static final String ACCOUNT = "F00B8D5D92F177BD";
    
    private PayPalGateway gateway;

    public PayPalAdapter(PayPalGateway gateway) {
        this.gateway = gateway;
    }
    
    @Override
    public void pay(double amount) {
        double dollars = Math.ceil(amount / TRM * 100) / 100;
        gateway.charge(dollars, ACCOUNT);
    }
    
}
