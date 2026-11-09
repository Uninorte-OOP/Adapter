/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.ecommerce.implementation;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author edangulo
 */
public class ShoppingCartTest {
    
    @Test
    public void emptyCartTotalIsZero() {
        // Given
        ShoppingCart cart = new ShoppingCart();
        
        // When
        double total = cart.getTotal();
        
        // Then
        assertEquals(0.0, total, 0.001);
    }

    @Test
    public void totalBelowLimitHasNoDiscount() {
        // Given
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(80000);
        cart.addItem(70000);
        
        // When
        double total = cart.getTotal();
        
        // Then
        assertEquals(150000.0, total, 0.001);
    }

    @Test
    public void totalExactlyAtLimitHasNoDiscount() {
        // Given
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(120000);
        cart.addItem(80000);
        
        // When
        double total = cart.getTotal();
        
        // Then
        assertEquals(200000.0, total, 0.001);
    }

    @Test
    public void totalJustAboveLimitHasDiscount() {
        // Given
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(200000);
        cart.addItem(10);
        
        // When
        double total = cart.getTotal();
        
        // Then
        assertEquals(180009.0, total, 0.001);
    }

    @Test
    public void totalAboveLimitHasTenPercentDiscount() {
        // Given
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(150000);
        cart.addItem(100000);
        
        // When
        double total = cart.getTotal();
        
        // Then
        assertEquals(225000.0, total, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addItemWithNegativePriceThrowsException() {
        // Given
        ShoppingCart cart = new ShoppingCart();
        
        // When
        cart.addItem(-5000);
        
        // Then: se espera IllegalArgumentException
    }
    
}
