package exemploherencia;

public class Entrenador extends SeleccionFutbol {
    
    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(String idFederacion, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "idFederacion=" + idFederacion + '}';
    }
    
    public void dirixirPartido(){
        System.out.println("O entrenador dirixe");
    }
    
    public void dirixirAdestramento(){
        System.out.println("O entrenador adestra");
    }
}
