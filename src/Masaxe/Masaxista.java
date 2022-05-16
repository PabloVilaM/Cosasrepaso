package Masaxe;

import exemploherencia.SeleccionFutbol;


public class Masaxista extends SeleccionFutbol {

    private String titulacion;
    private int anosExperiencia;
    
    public Masaxista() {
    }

    public Masaxista(String titulacion, int anosExperiencia, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    @Override
    public String toString() {
        return "Masaxista{" + "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    void darMasaxe(){
        System.out.println("Nothing");
    }
    
    public void amosarModificador(){
        Masaxista m = new Masaxista();
        m.viaxar();
        
    }
    @Override
    public void viaxar(){
        System.out.println(" masaxista viaxa en avion");
    }
    
    public void metodo(){
      //  this.viaxar();
        super.viaxar();
    }
}
