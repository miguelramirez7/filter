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
public class FilterManager {
    //se usa el filter manager para realizar todos los filtros y para agregar todos los filtros
    FilterChain listaFiltros;

    public FilterManager(Target target) {
        this.listaFiltros = new FilterChain();
        listaFiltros.setTarget(target);
    }
    
    public void addFilter(Ifilter filtro){
        listaFiltros.addFilter(filtro);
    }
    
    public void filterRequest(String request){ //filtrar solicitud osea hara posible que ejecute por todos los filtros
        listaFiltros.execute(request);
    }
}
