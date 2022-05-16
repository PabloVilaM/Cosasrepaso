package com.pablo;


public class Periodico extends Publicacion{
    private int numPaxinas;

    public Periodico(int numPaxinas, String nome, float precio) {
        super(nome, precio);
        this.numPaxinas = numPaxinas;
    }

    public Periodico() {
    }

    
    public int getNumPaxinas() {
        return numPaxinas;
    }

    public void setNumPaxinas(int numPaxinas) {
        this.numPaxinas = numPaxinas;
    }

    @Override
    public String toString() {
        return "Periodico{" + "numPaxinas=" + numPaxinas + super.toString() + '}';
    }
    
}
