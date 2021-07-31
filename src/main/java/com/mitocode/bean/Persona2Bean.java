package com.mitocode.bean;

import com.huvert.mode.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Persona2Bean {
    
    private static List<Persona> lista = new ArrayList();

    public List<Persona> getLista() {
        return lista;
    }

    public void setLista(List<Persona> lista) {
        this.lista = lista;
    }
    
    /*public void listar(){
        
        Personap per = new Personap();
        per.setNombre("Mitocode");
        per.setEdad(77);
        lista.add(per);
        
        per = new Personap();
        per.setNombre("Code");
        per.setEdad(23);
        lista.add(per);
    }*/
    
}
