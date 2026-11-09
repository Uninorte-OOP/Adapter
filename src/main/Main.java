/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.ecommerce.adapters.PayPalAdapter;
import core.ecommerce.adapters.StripeAdapter;
import core.ecommerce.clients.Client;
import core.ecommerce.implementation.CheckoutModule;
import core.ecommerce.implementation.ReportModule;
import core.ecommerce.implementation.ShoppingCartModule;
import org.paypal.gateways.PayPalGateway;
import org.stripe.gateways.StripeGateway;

/**
 *
 * @author edangulo
 */
public class Main {
    
    public static void main(String[] args) {
        // Adaptee objects
        StripeGateway stripe = new StripeGateway();
        PayPalGateway paypal = new PayPalGateway();
        
        // System modules
        CheckoutModule checkout = new CheckoutModule();
        ReportModule report = new ReportModule();
        ShoppingCartModule shoppingCart = new ShoppingCartModule();
        
        // Adapters
        StripeAdapter stripeAdapter = new StripeAdapter(stripe);
        PayPalAdapter payPalAdapter = new PayPalAdapter(paypal);
        
        // Client object
        Client client = new Client();
        
        // Make payments
        client.setProcessor(report);
        client.requestPayment(50_000.00);
        
        client.setProcessor(stripeAdapter);
        client.requestPayment(37_900.00);
        
        client.setProcessor(shoppingCart);
        client.requestPayment(329_500.00);
        
        client.setProcessor(checkout);
        client.requestPayment(19_900.00);
        
        client.setProcessor(payPalAdapter);
        client.requestPayment(41_800.00);
    }
    
}
