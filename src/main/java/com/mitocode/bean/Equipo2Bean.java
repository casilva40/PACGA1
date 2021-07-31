
package com.mitocode.bean;

import com.mitocode.model.equipo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;

@ManagedBean
@RequestScoped

public class Equipo2Bean {
    
    private static List<equipo> list = new ArrayList();
  
    public List<equipo> getList() {
        return list;
    }

    public void setList(List<equipo> list) {
        this.list = list;
    }
    
    public void listar (){
        
        equipo per = new equipo();
            per.setidequipo(0001);
            per.setserial("sdfgrfdr");
             list.add(per);
             
              per = new equipo();
            per.setidequipo(0001);
            per.setserial("xxxds");
             list.add(per);
             
            per.getMarca();
            per.getTipo();
            per.getNucleo();
            per.getMemoria();
            per.getCampem();
            per.getDisco_duro();
            per.getCapdisco();
            per.getTeclado();
            per.getMouse();
            per.getPantalla();
            per.getConding();
            
            
        }
    }
    

