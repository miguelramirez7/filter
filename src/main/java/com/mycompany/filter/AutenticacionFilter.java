/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.filter;

/**
 *
 * @author User
 */
public class AutenticacionFilter implements Ifilter{

    @Override
    public void execute(String request) {
        System.out.println("autenticando con request:"+request);
    }
    
}
