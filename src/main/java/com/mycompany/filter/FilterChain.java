/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.filter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class FilterChain {
        //necesitamos lista de filtros y el target(objetivo)
    private List<Ifilter> filtros = new ArrayList<>();
    private Target target;

    public void addFilter(Ifilter filtro){ //metodo para agregarlos filtros
        filtros.add(filtro);
    }
    
    public void execute(String request){   //ejecutar los filtrosde la solicitud y luego el objetivo final
        for (Ifilter filtro : filtros) {
            filtro.execute(request);
        }
        target.execute(request);
    }
    
    public void setTarget(Target target){   // asianmos el target (objetivo finaldela  solicitud)
        this.target=target;
    }
}
