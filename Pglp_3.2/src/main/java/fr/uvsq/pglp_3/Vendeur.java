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
public class Vendeur extends Employe{
    private double commission = 0;
    @Override
    public double calculSalaire() {
        
        return super.calculSalaire() + commission;
    }
    
}
