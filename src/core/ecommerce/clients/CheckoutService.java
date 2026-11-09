/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.ecommerce.clients;

import core.ecommerce.implementation.PaymentProcessor;
import core.ecommerce.implementation.ShoppingCart;

/**
 *
 * @author edangulo
 */
public class CheckoutService {
    
    private final PaymentProcessor processor;

    public CheckoutService(PaymentProcessor processor) {
        this.processor = processor;
    }
    
    public void checkout(ShoppingCart cart) {
        if (cart.isEmpty()) {
            throw new IllegalStateException("Cart is empty");
        }
        processor.pay(cart.getTotal());
    }
    
}
