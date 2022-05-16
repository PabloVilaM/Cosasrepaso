package exemplogui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;


public class distribucionCompoñentes {
    
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2, boton3, boton4, boton5;
    
    /*public void hacerFlowLayout(){
        marco = new JFrame( "FlowLayout");
        panel = new JPanel();
        boton1 = new JButton( " boton1 ");
        boton2 = new JButton(" boton2 ");
        boton3 = new JButton(" boton3 ");
        boton4 = new JButton(" boton4 ");
        boton5 = new JButton(" boton5 ");
        
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT, 50, 20));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
        
    }*/
    
    public void compoñentes(String tipo){
        marco = new JFrame(tipo);
        panel = new JPanel();
        boton1 = new JButton( " boton1 ");
        boton2 = new JButton(" boton2 ");
        boton3 = new JButton(" boton3 ");
        boton4 = new JButton(" boton4 ");
        boton5 = new JButton(" boton5 ");
    }
    
    public void pecharVentana(){
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
    public void layout2(){
        this.compoñentes("FlowLayout");
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT, 50, 20));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        pecharVentana();
    }
    
    public void layout3(){
        this.compoñentes("BoxLayout");
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
         panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        pecharVentana();
    }
    
    public void layout4(){
        this.compoñentes("BorderLayout");
        panel.setLayout(new BorderLayout());
        panel.add(boton1, BorderLayout.NORTH);
        panel.add(boton2, BorderLayout.SOUTH);
        panel.add(boton3, BorderLayout.WEST);
        panel.add(boton5, BorderLayout.CENTER);
        marco.add(panel);
        pecharVentana();
    }
    
    public void layout5(){
        this.compoñentes("GridLayout");
        panel.setLayout(new GridLayout(1,3));
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        pecharVentana();
        
    }
}
