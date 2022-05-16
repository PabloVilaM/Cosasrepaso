package exemplogui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class EventClassAnonima {
    
    JFrame frame;
    JPanel panel;
    JButton bVerde, bAzul;
    
    public void crearEventos(){
        frame = new JFrame("Eventos");
        frame.setSize(800, 600);
        panel = new JPanel();
        panel.setSize(800, 600);
        bVerde = new JButton("Verde");
        bAzul = new JButton("Azul");
        
        //ponemos los componentes al panel.
        panel.add(bVerde);
        panel.add(bAzul);
        frame.add(panel);
        frame.setLocationRelativeTo(frame);
        //xestion de eventos
        bVerde.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                panel.setBackground(Color.green);
            }
        });
        bAzul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                panel.setBackground(Color.blue);
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
