package com.huvert.controller;

import com.huvert.ejb.EquipoFacadeLocal;
import com.huvert.mode.Equipo;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class EquipoController implements Serializable{
    
    @EJB
    private EquipoFacadeLocal equipoEJB;
    private Equipo equipo;
    
    @PostConstruct
    public void init(){
        equipo = new Equipo();
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    public void registrar(){
        try{
            equipoEJB.create(equipo);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Equipo Registrado correctamente"));
        }catch(Exception e){
            //mensaje prime gwrol
        }
    }
    
    public void eliminar(Equipo eli){
        try{
            this.equipoEJB.remove(eli);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Registro eliminado correctamente"));
        }catch(Exception e){
            //mensaje
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error!"));
        }
        
    }
}

