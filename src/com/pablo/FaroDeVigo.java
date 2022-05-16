package com.pablo;


public class FaroDeVigo extends Periodico {
    
    String seccion;

    public FaroDeVigo(String seccion, int numPaxinas, String nome, float precio) {
        super(numPaxinas, nome, precio);
        this.seccion = seccion;
    }

    public FaroDeVigo() {
    }

    @Override
    public String toString() {
        return "FaroDeVigo{" + "seccion=" + seccion + super.toString() + '}';
    }
 
    
}
