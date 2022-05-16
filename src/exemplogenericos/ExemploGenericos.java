package exemplogenericos;
import com.pablo.Metodos;
import com.pablo.Periodico;
import com.pablo.Publicacion;
import com.pablo.Revista;
import java.util.ArrayList;

public class ExemploGenericos {

    public static void main(String[] args) {
        /*
        ClaseXenerica<String>obx = new ClaseXenerica<>("a");
        
        System.out.println(obx);
        Alumno alumno = new Alumno("Brais",25);
        ClaseXenerica<Alumno>obx2 = new ClaseXenerica<>(alumno);
        System.out.println(obx2.toString());*/
        /*
        ClaseXenerica <Integer> obx = new ClaseXenerica<>();
        obx.setDato(8);
        System.out.println(obx.toString());*/
        Metodos obx = new Metodos();
        ArrayList<Revista> lista = new ArrayList<>();
        lista.add(new Revista("tematica","aaa",5f));
        lista.add(new Revista("cociña","bbb",5f));
        lista.add(new Revista("ciencia","ccc",5f));
        obx.amosar(lista);
        ArrayList<Periodico> lista2 = new ArrayList<>();
        lista2.add(new Periodico(20,"a",5f));
        lista2.add(new Periodico(20,"b",5f));
        obx.amosar(lista2);
        ArrayList<Publicacion> lista3 = new ArrayList<>();
        lista3.add(new Publicacion("a",5f));
        lista3.add(new Publicacion("b",10f));
        obx.amosar(lista3);
        ArrayList<Integer> listaEnteiros = new ArrayList();
        listaEnteiros.add(1);
        listaEnteiros.add(2);
        listaEnteiros.add(3);
        obx.amosar(listaEnteiros);
        
    }
    
}
