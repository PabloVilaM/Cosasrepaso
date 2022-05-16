package exemplogenericos;



public class ClaseXenerica <T> {
    T dato;

    public ClaseXenerica(T dato) {
        this.dato = dato;
    }

    public ClaseXenerica() {
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "ClaseXenerica{" + "dato=" + dato + '}';
    }
    
    
    
}
