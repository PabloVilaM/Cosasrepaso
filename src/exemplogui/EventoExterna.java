package exemplogui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class EventoExterna {
    
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
        bVerde.addActionListener(new EventInterna());// this porque o ActionPerformed esta na mesma clase.
        bAzul.addActionListener(new EventInterna());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private class EventInterna implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object obx = e.getSource();
            if (obx == bVerde){
                panel.setBackground(Color.green);
            }
            else if (obx == bAzul){
                panel.setBackground(Color.blue);
            }
        }
        
        
    }
}
