/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.ecommerce.implementation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edangulo
 */
public class ShoppingCart {
    
    private final List<Double> prices;
    
    public ShoppingCart() {
        this.prices = new ArrayList<>();
    }
    
    public void addItem(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        prices.add(price);
    }
    
    public boolean isEmpty() {
        return prices.isEmpty();
    }
    
    public double getTotal() {
        double total = 0;
        for (double price : this.prices) {
            total += price;
        }
        if (total > 200_000) {
            total *= 0.9;
        }
        return total;
    }
    
}
