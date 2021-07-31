package com.huvert.mode;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "equipo")
public class Equipo implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idequipo;
    
    @Column(name="serial")
    private String serial;
    
    @Column(name="marca")
    private String marca;
    
    @Column(name="tiposs")
    private String tiposs;
    
    @Column(name="nucleo")
    private String nucleo;
    
    @Column(name="memoria")
    private String memoria;
    
    @Column(name="capmem")
    private int capmem;
    
    @Column(name="disco_duro")
    private String disco_duro;
    
    @Column(name="capdisco")
    private int capdisco;
    
    @Column(name="teclado")
    private String teclado;
    
    @Column(name="mouse")
    private String mouse;
    
    @Column(name="pantalla")
    private String pantalla;
    
    @Column(name="conding")
    private String conding;
    
    public int getIdequipo() {
        return idequipo;
    }

    public void setIdequipo(int idequipo) {
        this.idequipo = idequipo;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTiposs() {
        return tiposs;
    }

    public void setTiposs(String tiposs) {
        this.tiposs = tiposs;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getNucleo() {
        return nucleo;
    }

    public void setNucleo(String nucleo) {
        this.nucleo = nucleo;
    }

    public int getCapmem() {
        return capmem;
    }

    public void setCapmem(int capmem) {
        this.capmem = capmem;
    }

    public String getDisco_duro() {
        return disco_duro;
    }

    public void setDisco_duro(String disco_duro) {
        this.disco_duro = disco_duro;
    }

    public int getCapdisco() {
        return capdisco;
    }

    public void setCapdisco(int capdisco) {
        this.capdisco = capdisco;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getConding() {
        return conding;
    }

    public void setConding(String conding) {
        this.conding = conding;
    }
    
    
    

    

    
    
   
    
    
   

    

    
    
}
