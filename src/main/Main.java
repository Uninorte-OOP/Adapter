/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.base.adapter.Adapter;
import core.base.adapter.Target;
import core.base.clients.Client;
import core.base.implementation.Adaptee;

/**
 *
 * @author edangulo
 */
public class Main {
    
    public static void main(String[] args) {
        Adaptee implementation = new Adaptee();
        
        Target adapter = new Adapter(implementation);
        
        Client client = new Client();
        client.sendRequest(adapter);
    }
    
}
