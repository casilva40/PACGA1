/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huvert.ejb;

import com.huvert.mode.Pruebas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario 000
 */
@Local
public interface PruebasFacadeLocal {

    void create(Pruebas pruebas);

    void edit(Pruebas pruebas);

    void remove(Pruebas pruebas);

    Pruebas find(Object id);

    List<Pruebas> findAll();

    List<Pruebas> findRange(int[] range);

    int count();
    
}
