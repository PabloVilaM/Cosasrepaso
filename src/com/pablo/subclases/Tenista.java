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
public class Tenista extends Persoa {
    private int partidosXogador;

    public Tenista() {
    }

    public Tenista(int partidoXogador, String nome, int edade) {
        super(nome, edade);
        this.partidosXogador = partidoXogador;
    }
    
    
    
    @Override
    public String toString() {
        return super.toString()  +  "Tenista{" + "partidosXogador=" + partidosXogador + '}';
    }

    public int getPartidosXogador() {
        return partidosXogador;
    }
    
    
}
