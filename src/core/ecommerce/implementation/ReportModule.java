/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.ecommerce.implementation;

/**
 *
 * @author edangulo
 */
public class ReportModule implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("This is a payment made in the report module for " + amount + " COP");
    }
    
}
