/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappymulab;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class findeljuego extends JFrame implements MouseListener{

    private Board flappymula;
    private JLabel imagen;
    private ImageIcon icono;
    private JButton boton;
    
    public findeljuego(){
        
        boton=new JButton("soy un boton"); 

imagen=new JLabel();
icono=new ImageIcon("perdiste1.png");//direccion de la imagen (no tiene // porque se encuentra en la misma carpeta)



setLayout(null);
imagen.setBounds(0,0,1366,768);//posicion (x,y,ancho,largo)
boton.setBounds(50,50,150,35);// lo mismo

imagen.setIcon(icono);//se setea el icono entero del label (cambio) y se entrega el icono que contiene la imagen.
setSize(1366,768);//ancho y largo de la ventana o frame.
add(imagen);//se agregan los objetos al frame
add(boton);//se agrega el boton al frame o ventana.


setVisible(true);//se deja visible la ventana
      
       

    }

    
      
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
