package com.huvert.controller;

import com.huvert.ejb.UsuarioFacadeLocal;
import com.huvert.mode.Persona;
import com.huvert.mode.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class UsuarioController implements Serializable{
    
    @EJB
    private UsuarioFacadeLocal usuarioEJB;
    
    private Usuario usuario;
    private Persona persona;
    
    @PostConstruct
    public void init(){
        usuario = new Usuario();
        persona = new Persona();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public void registrar(){
       try{
           this.usuario.setCodigo(persona);
           usuarioEJB.create(usuario);
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Registro Exitoso"));
           //mensaje
       }catch(Exception e){
           //mensaje
           FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error!"));
       } 
        
    }
    
    public void eliminar(Usuario eli){
        try{
            this.usuarioEJB.remove(eli);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Registro eliminado correctamente"));
        }catch(Exception e){
            //mensaje
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error!"));
        }
        
    }
}