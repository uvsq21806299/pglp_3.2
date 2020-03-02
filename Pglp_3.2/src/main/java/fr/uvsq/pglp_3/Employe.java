/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_3;

/**
 *
 * @author andri
 */
public class Employe implements CalculSalaire{
    private int anciennete;
    
    @Override
    public double calculSalaire() {
        return 1500 + 20 * anciennete;
    }
    
}
