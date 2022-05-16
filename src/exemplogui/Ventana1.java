package exemplogui;

import javax.swing.JFrame;



public class Ventana1 {
    
    JFrame marco;
    
    public void crearVentana(){
        //Instanciamos la ventana
        marco = new JFrame("ExceptionHunter");
        //Le damos caracteristicas
        marco.setVisible(true); //se hace visible la ventana
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cierra la aplicacion al darle a la x.
        //marco.setBounds(0, 0, 1920, 1080); //Lo centramos y le ponemos el size.
        marco.setLocationRelativeTo(marco); //Lo centramos
        marco.setSize(1920, 1080);
    }
}
