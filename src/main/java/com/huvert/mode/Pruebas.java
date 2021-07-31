package com.huvert.mode;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pruebas")
public class Pruebas implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpruebas;
    
    @Column(name="pruebascol")
    private String pruebascol;

    public int getIdpruebas() {
        return idpruebas;
    }

    public void setIdpruebas(int idpruebas) {
        this.idpruebas = idpruebas;
    }

    public String getPruebascol() {
        return pruebascol;
    }

    public void setPruebascol(String pruebascol) {
        this.pruebascol = pruebascol;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.idpruebas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pruebas other = (Pruebas) obj;
        if (this.idpruebas != other.idpruebas) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pruebas{" + "idpruebas=" + idpruebas + ", pruebascol=" + pruebascol + '}';
    }    
    
}
