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


public class findeljuego2 extends JFrame implements MouseListener{
private String cadena;
private boolean valor;
private Board flappymula;
private JLabel imagen;
private ImageIcon icono;
private JButton boton;
private Jugabilidad jugabilidad;

    public findeljuego2(){
        
        
        
     this.valor=false;   
        
                
        boton=new JButton("Siguiente"); 

imagen=new JLabel();
icono=new ImageIcon(retornarcadena(this.valor));//direccion de la imagen (no tiene // porque se encuentra en la misma carpeta)



setLayout(null);
imagen.setBounds(0,0,1366,768);//posicion (x,y,ancho,largo)
boton.setBounds(200,400,150,35);// lo mismo

imagen.setIcon(icono);//se setea el icono entero del label (cambio) y se entrega el icono que contiene la imagen.
setSize(1366,768);//ancho y largo de la ventana o frame.
add(imagen);//se agregan los objetos al frame
add(boton);//se agrega el boton al frame o ventana.


      
       

    }

    public String retornarcadena(boolean gameover){
        
        int numero = (int) (Math.random() * 2) + 1;
 
    if(gameover==false){
        
        if(numero==1){
        
    this.cadena="ganaste1.png";
        } else{if(numero==2){
        
        this.cadena="ganaste2.png";
        }
        
        
        }  
    
    }
    return this.cadena;
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