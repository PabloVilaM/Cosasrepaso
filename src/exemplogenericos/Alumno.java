package exemplogenericos;

public class Alumno {
    String nome;
    int edade;

    public Alumno(String nome, int edade) {
        this.nome = nome;
        this.edade = edade;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nome=" + nome + ", edade=" + edade + '}';
    }
    
    
}
