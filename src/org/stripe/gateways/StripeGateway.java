/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.stripe.gateways;

/**
 *
 * @author edangulo
 */
public class StripeGateway {
    
    public void makeCharge(int amountInCents, String currency) {
        // SDK logic to make a charge using Stripe's API
        System.out.println("Charging " + amountInCents + " cents in " + currency);
    }
    
}
