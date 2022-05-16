/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablo.subclases;

import exemplopolimorfismo.Persoa;

/**
 *
 * @author dam1
 */
public class Empregado extends Persoa{
    private float soldo;
    
    public Empregado(){
        
    }
    public Empregado(String nome, int edade, float soldo){
        super(nome, edade);
        this.soldo = soldo;
    }

    public float getSoldo() {
        return soldo;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + " Empregado{" + "soldo=" + soldo + '}';
    }
    
}

