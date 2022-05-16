package com.pablo;


public class Revista extends Publicacion {
    private String temática;


    public Revista(String temática) {
        this.temática = temática;
    }

    public Revista(String temática, String nome, float precio) {
        super(nome, precio);
        this.temática = temática;
    }

    public Revista() {
    }

    
    @Override
    public String toString() {
        return "Revista{" + "tem\u00e1tica=" + temática + super.toString() + '}';
    }
    
    
}
