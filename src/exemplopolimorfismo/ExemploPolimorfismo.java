package exemplopolimorfismo;

import com.pablo.subclases.Empregado;
import com.pablo.subclases.Tenista;

public class ExemploPolimorfismo {

    public static void main(String[] args) {
        Persoa p = new Persoa("per",20);
        Empregado em = new Empregado("emp", 30, 1500f);
        Tenista te = new Tenista(18,"ten",5);
        
        amosar(p);
        amosar(em);
        amosar(te);
    }
    
    public static void amosar(Object ob){
        
        System.out.println(ob);
    }
}
