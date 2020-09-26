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
public class Target {  //objetivo principal de la solicitud antes de hacer los filtros
    public void execute(String request){
        System.out.println("ejecutando request:"+request);
    }
}
