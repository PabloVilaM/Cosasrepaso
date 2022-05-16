package exemplogui;

import java.awt.Color;
import javax.swing.*;


public class Componentes {
    
    JFrame marco;
    JPanel panel;
    JLabel etiqueta;
    JTextField liñaTexto;
    JButton boton1;
    JButton boton2;
    
    public void crearCompoñentes(){
        //Instanciar todo
        marco = new JFrame("Runtime");
        panel = new JPanel();
        etiqueta = new JLabel("Etiqueta");
        liñaTexto = new JTextField();
        boton1 = new JButton("Boton1");
        boton2 = new JButton("Boton2");
        
        //Les damos caracteristicas a los componentes
        panel.setLayout(null);
        marco.setSize(650, 650);
        marco.setBackground(Color.BLUE);
        panel.setSize(650,650);
        //liñaTexto.setSize(150, 100);
        //boton1.setSize(75,50);
        boton1.setBackground(Color.red);
        boton2.setText("boton2");
        boton2.setToolTipText("Limpa o texto");
        //boton2.setSize(75,50);
        liñaTexto.setBounds(100, 100, 150, 100);
        boton2.setBounds(50, 300, 75, 50);
        boton1.setBounds(100, 200, 75, 50);
        

        
        //Engadimos compoñentes al panel
        panel.add(etiqueta);
        panel.add(liñaTexto);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);
        
        //Terminamoh
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
