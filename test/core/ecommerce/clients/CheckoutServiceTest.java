/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.ecommerce.clients;

import core.ecommerce.implementation.ShoppingCart;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author edangulo
 */
public class CheckoutServiceTest {
    
    @Test
    public void checkoutChargesCartTotal() {
        // Given
        FakePaymentProcessor fake = new FakePaymentProcessor();
        CheckoutService service = new CheckoutService(fake);
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(150000);
        cart.addItem(100000);
        
        // When
        service.checkout(cart);
        
        // Then
        assertEquals(1, fake.getPayments());
        assertEquals(225000.0, fake.getLastAmount(), 0.001);
    }

    @Test
    public void checkoutWithEmptyCartThrowsAndDoesNotCharge() {
        // Given
        FakePaymentProcessor fake = new FakePaymentProcessor();
        CheckoutService service = new CheckoutService(fake);
        ShoppingCart emptyCart = new ShoppingCart();
        
        // When
        try {
            service.checkout(emptyCart);
            fail("Se esperaba IllegalStateException");
        } catch (IllegalStateException e) {
            // Then
            assertEquals(0, fake.getPayments());
        }
    }
    
}
