/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andri
 */
public class SalaireTotal {
    private final List<Employe> employeList;
    
    public SalaireTotal(){
        employeList = new ArrayList<>();        
    }
    
    public double getSommeSalaires(){
        double som = 0;
        for (Employe e : employeList){
            som += e.calculSalaire();
        }
        return som;
    }
    
}
