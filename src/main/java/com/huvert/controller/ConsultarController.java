package com.huvert.controller;

import com.huvert.ejb.UsuarioFacadeLocal;
import com.huvert.mode.Usuario;
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
public class ConsultarController implements Serializable{
    
    @EJB
    private UsuarioFacadeLocal usuarioEJB;
    private List<Usuario> usuarios;       
    
    
    private static List<Usuario> lista = new ArrayList();

    public List<Usuario> getLista() {
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }
    
    
    
    
    
    public UsuarioFacadeLocal getUsuarioEJB() {
        return usuarioEJB;
    }

    public void setUsuarioEJB(UsuarioFacadeLocal usuarioEJB) {
        this.usuarioEJB = usuarioEJB;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }   
    
    
    @PostConstruct
    public void init(){
        usuarios =  usuarioEJB.findAll();
    }
}
