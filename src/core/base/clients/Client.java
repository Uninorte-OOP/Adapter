/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.base.clients;

import core.base.adapter.Target;

/**
 *
 * @author edangulo
 */
public class Client {
    
    public void sendRequest(Target target) {
        target.request();
    }
    
}
