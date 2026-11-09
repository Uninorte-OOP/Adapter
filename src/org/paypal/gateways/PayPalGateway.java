/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.paypal.gateways;

/**
 *
 * @author edangulo
 */
public class PayPalGateway {
    
    public void charge(double dollars, String account) {
        // SDK logic to make a charge using Stripe's API
        System.out.println("Paying " + dollars + " dollars to account " + account);
    }
    
}
