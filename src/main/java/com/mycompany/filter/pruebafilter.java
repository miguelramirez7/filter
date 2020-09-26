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
public class pruebafilter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*---2 formas ---*/
        
        /*---1°forma(defrente usando el filterManger)---*/
        FilterManager administradorFiltros = new FilterManager(new Target());
        
        Ifilter autenticacion = new AutenticacionFilter();
        Ifilter seguimiento = new SeguimientoFilter();
        
        administradorFiltros.addFilter(seguimiento);
        administradorFiltros.addFilter(autenticacion);
        
        administradorFiltros.filterRequest("HOME");
        /*---1°forma(USANDO CLIENTE)---*/
        FilterManager administradorFiltros2 = new FilterManager(new Target());
        
        Ifilter autenticacion2 = new AutenticacionFilter();
        Ifilter seguimiento2 = new SeguimientoFilter();
        
        Cliente cliente = new Cliente();
        cliente.setFilterManager(administradorFiltros2);
        cliente.sendRequest("HOME2");
    }
    
}
