package com.huvert.controller;

import com.huvert.ejb.PruebasFacadeLocal;
import com.huvert.mode.Pruebas;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


@Named
@ViewScoped

public class PruebasController implements Serializable{
    
    @EJB
    private PruebasFacadeLocal pruebasEJB;
    private Pruebas pruebas;
    
    @PostConstruct
    public void init(){
        pruebas = new Pruebas();
    }

    public Pruebas getPruebas() {
        return pruebas;
    }

    public void setPruebas(Pruebas pruebas) {
        this.pruebas = pruebas;
    }
    
    public void registrar(){
        try{
            pruebasEJB.create(pruebas);
        }catch(Exception e){
            //mensaje prime gwrol
        }
    }
    
}
