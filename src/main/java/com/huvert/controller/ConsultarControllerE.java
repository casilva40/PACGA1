package com.huvert.controller;

import com.huvert.ejb.EquipoFacadeLocal;
import com.huvert.mode.Equipo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


@Named
@ViewScoped
@RequestScoped
public class ConsultarControllerE implements Serializable{
    
    @EJB
    private EquipoFacadeLocal equipoEJB;  
    private List<Equipo> equipos;
    
    
    
    private static List<Equipo> listae = new ArrayList();

    public List<Equipo> getListae() {
        return listae;
    }

    public void setListae(List<Equipo> lista) {
        this.listae = listae;
    }
    
    
    
    
    
    public EquipoFacadeLocal getEquipoEJB() {
        return equipoEJB;
    }

    public void setEquipoEJB(EquipoFacadeLocal equipoEJB) {
        this.equipoEJB = equipoEJB;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }
    
    
    @PostConstruct
    public void init(){
        equipos = equipoEJB.findAll();
    }
}
