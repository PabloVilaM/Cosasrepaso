package exemploherencia;

import Masaxe.Masaxista;


public class Exemploherdanza {

    public static void main(String[] args) {
       /* Futbolista futbol = new Futbolista();
        System.out.println(futbol);*/
        
        Entrenador en = new Entrenador("4123",1,"entrenador","aa",45);
        en.concentrarse();
        en.dirixirPartido();
        
        //Visibilidade dos metodos.
        
        Masaxista ma = new Masaxista();
        // ma.darMasaxe() no puedo porque no tengo acceso (esta private)
        //ma.darMasaxe() es visible porque esta default (sin acceso)
        
        ma.metodo();
    }  
    
}
