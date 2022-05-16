package exemploherencia;


public class Futbolista extends SeleccionFutbol{
    private int dorsal;
    private String demarcación;

    public Futbolista() {
    }

    public Futbolista(int dorsal, String demarcación, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.dorsal = dorsal;
        this.demarcación = demarcación;
    }

    
    public void xogarPartido(){
        
    }
   
    public void entrenar(){
        
    }

    @Override
    public String toString() {
        return (super.toString() + "Futbolista{" + "dorsal=" + dorsal + ", demarcaci\u00f3n=" + demarcación + '}');
    }
}
