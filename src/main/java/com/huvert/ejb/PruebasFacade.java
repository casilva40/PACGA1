package com.huvert.ejb;

import com.huvert.mode.Pruebas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PruebasFacade extends AbstractFacade<Pruebas> implements PruebasFacadeLocal {

    @PersistenceContext(unitName = "PrimePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PruebasFacade() {
        super(Pruebas.class);
    }
    
}
