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
public class Cliente {
    
    FilterManager administradorFiltros;
    
    public void setFilterManager(FilterManager administradorFiltros){
        this.administradorFiltros = administradorFiltros;
    }
    public void sendRequest(String request){
        administradorFiltros.filterRequest(request);
    }
}
