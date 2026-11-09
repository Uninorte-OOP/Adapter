/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.ecommerce.adapters;

import core.ecommerce.implementation.PaymentProcessor;
import org.stripe.gateways.StripeGateway;

/**
 *
 * @author edangulo
 */
public class StripeAdapter implements PaymentProcessor {
    
    private static final double TRM = 3237.83;
    private static final String CURRENCY = "COP";
    
    private StripeGateway gateway;

    public StripeAdapter(StripeGateway gateway) {
        this.gateway = gateway;
    }
    
    @Override
    public void pay(double amount) {
        int cents = (int) Math.ceil(amount / TRM * 100);
        gateway.makeCharge(cents, CURRENCY);
    }
    
}
