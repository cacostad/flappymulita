/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappymulab;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;

import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author CRIS
 */
public class Board extends JPanel implements ActionListener {
  // cuando el jugador gane o pierda abrimos un nuevo Jframe 
   private findeljuego siguiente;
   
   // Esta variable es el controlador del juego
    public Jugabilidad jugabilidad;
    private Timer timer;
    
    
    public Board (){
        
    this.jugabilidad=new Jugabilidad();
    this.timer = new Timer(20,this);
   this.siguiente=new findeljuego();
   setFocusable(true);
    addKeyListener(new Teclado());
    timer.start();
    
    }
    
    // aqui pintamos todo lo visual sobre un jpanel que añadimos en el main a un JFrame
    @Override
	public void paintComponent(Graphics g)
	{
            
            
		super.paintComponent(g);
   
        Image img= loadImage("troncocolor.png");
        g.drawImage(img, 0, 0, 1366, 791, this.jugabilidad.getPx(), this.jugabilidad.getPy(), this.jugabilidad.getP2x(), this.jugabilidad.getP2y(), this);
       
        Image trop= loadImage("mulacolor.png");
        g.drawImage(trop, this.jugabilidad.getX(),  this.jugabilidad.getY(), this.jugabilidad.getX2() , this.jugabilidad.getY2(),this.jugabilidad.getX3() , this.jugabilidad.getY3(), this.jugabilidad.getX4(), this.jugabilidad.getY4(), this);
        
        Image lop= loadImage("Frentecolor.png");
        g.drawImage(lop, 0, 0, 1366, 791, this.jugabilidad.getPx(), this.jugabilidad.getPy(), this.jugabilidad.getP2x(), this.jugabilidad.getP2y(), this);
  
        Image pop= loadImage("perdiste1.png");
       
    
        g.setFont(new Font("Arial", 1, 100));

		if (!this.jugabilidad.isStart())
		{
		       g.setColor(Color.white);
                       g.drawString("Toca una tecla", 75, 700 / 2 - 50);
		}
                
                
                 if(this.jugabilidad.isStart()==true){
                    
                    String score;
                    score= Integer.toString(this.jugabilidad.getScore());
                    g.setColor(Color.green);
                    g.setFont(new Font("Arial",1,70));
		    g.drawString("Puntuacion: "+score,50,80);
                   
                    
                
                }
                 
                if (this.jugabilidad.isGameover())
		{
                    this.timer.stop();
                    
                    this.siguiente.setVisible(true);
                     
                   
           
                        
		}
                
                if(this.jugabilidad.getP2x()==25404){
                
                    this.timer.stop();
                    
                    this.siguiente.setVisible(true);
                
                
                }
               
                
		
	}
        
        // Esta función carga las imagenes
      public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }

      // Estas funciones dan movimiento al juego
         @Override
    public void actionPerformed(ActionEvent e) {
        
this.jugabilidad.movimiento();
repaint();

    }

   private class Teclado extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            
        }
        
        @Override
         public void keyReleased(KeyEvent e){
            jugabilidad.keyReleased(e);
        }
        
    }
    
    
}
