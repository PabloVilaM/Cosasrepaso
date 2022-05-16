package com.pablo;

import java.util.ArrayList;



public class Metodos <T extends Publicacion> {
    
    public void amosar(ArrayList<T> lista){
        for (T elemento:lista){
            System.out.println(elemento);
        }
    }
    
    public void amosar2(ArrayList<? extends T> lista ){
        for (T elemento:lista)
            System.out.println(elemento);
    }
    
}
