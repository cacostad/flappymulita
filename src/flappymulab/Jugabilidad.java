/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappymulab;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.Timer;


/**
 *
 * @author CRIS
 */
public class Jugabilidad implements KeyListener {
    
    
    // Estas variables las estamos utilizando para cambiar de posición (x,y) a la mula y recorrer el escenario
    private int x;
    private  int y;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private int x4;
    private int y4;
    private int px;
    private int py;
    private int p2x;
    private int p2y;
    private int score;
  
    
    // Esta variable de tipo tronco nos permite acceder a las funciones propias de cada tronco en el frame
    private Troncos tronco;
   
    // Estas tres variables estan en la funcion de saltar y nos permiten controlar el salto de la mula
    private int velocidad;
    private int supp;
    private int aux;
    
    // Esta variable de tipo rectangulo es un prqueño cuadrado que esta detras de la mula, y es la que interacciona con los troncos
    private Rectangle mula;
  
    // Estas variables pautan el principio y el final del juego 
    private boolean start;
    private boolean gameover;
    private int contador;

 
    
    public Jugabilidad(){
        
       // Inicializamos las variables
         
         this.score=0;
         this.x = 740-90;
         this.x2 = 908-90;
         this.y2 = 482-65;
         this.y=340-65;
         this.y2=482-65;
         this.x3=0;
         this.x4=146;
         this.y3=0;
         this.y4=123;
         this.px=0;
         this.py=0;
         this.p2x=1366;
         this.p2y=791;
        
        
        
        
        
        this.tronco=new Troncos();
        
        this.mula=new Rectangle(740,340,20,20);
        this.start=false;
        this.gameover=false;
        
        this.supp=0;
        this.aux=0;
        this.velocidad=10;
        this.contador=0;
        this.tronco.añadirtroncos(true);
           
        
    }
    
    
    // La funcion saltar nos permite controlar tanto el movimiento en Y del cuadrado y el movimeinto de la imagen que se ve en el juego
    public void saltar(){
    
        // Si gameover=true lo que hacemos es reiniciar todos las variables a su estado fundamental
    if(this.gameover==true){
        
        
        
  
        
        
      this.mula=new Rectangle(740,340,20,20);
      
      
             this.x=740-90;
               this.x2=908-90;
                this.y=340-65;
                this.y2=482-65;
               this.x3=0;
                this.x4=146;
      
       this.px=0;
         this.py=0;
         this.p2x=1366;
         this.p2y=791;
      
      
      this.aux=0;
    
   
    
    
    }if (this.start==false)
		{
			this.start = true;
		}
		else if (this.gameover==false)
		{
			if (this.aux > 0)
			{
				this.aux = 0;
			}

			this.aux -= 10;
		}
    
    
    
    }
    
    // La funcion movimiento nos permite dar movimeinto al escenario, a los troncos y a la imagen de la mula
    public void movimiento(){
      
        
    this.supp++;

		if (this.start==true)
		{
               
                    
                    this.px+=15;
                     this.p2x+=15;
                
                     puntuacion(this.p2x);
                    
                   
if (this.supp % 2 == 0 && this.aux < 15)
			{
				this.aux+= 2;
                                 
			}

			
this.tronco.velocidad_troncos(this.gameover,this.start);

			this.mula.y += this.aux;
                        this.y+=this.aux;
                            this.y2+=this.aux;
                        
			if ( this.mula.y < 0)
			{
				this.gameover = true;
			}

			if (this.mula.y + this.aux >= 700)
			{
				this.mula.y = 700- 120 - this.mula.height;
				this.gameover = true;
			}
                        
                     this.gameover =  this.tronco.interseccion(this.mula, this.gameover);
                        


			}
                
                            if(this.contador<=27){
                      this.x3+=146;
this.x4+=146;

                this.contador++;}else{if(this.contador>27){
              this.x3=0;
this.x4=146;
this.contador=0;
             
                
                }
            
                }
                
      
    }
    
  
// Esta variable de tipo tronco nos permite  dar la puntuación
  public int puntuacion(int recorrido){
      
      if(recorrido<=4433){
      this.score=0;
      }
      
      if(recorrido>=6281){
      this.score=30;
      }
      
      if(recorrido>=9713){
      this.score=40;
      }
  
      if(recorrido>=13011){
          this.score=50;
      }
      
      if(recorrido>=17318){
      this.score=60;
      }
      
      if(recorrido>=20767){
      this.score=70;
      }
      
       if(recorrido>=22345){
      this.score=80;
      }
      
      if(recorrido>=23567){
      this.score=90;
      }
       
      if(recorrido>=25404){
      this.score=100;
      }
  return this.score;
  }
    
    
  



    

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public boolean isGameover() {
        return gameover;
    }

    public void setGameover(boolean gameover) {
        this.gameover = gameover;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }

    public int getX4() {
        return x4;
    }

    public int getY4() {
        return y4;
    }

    public int getPx() {
        return px;
    }

    public int getPy() {
        return py;
    }

    public int getP2x() {
        return p2x;
    }

    public int getP2y() {
        return p2y;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        saltar();
    }


    
    
    
}
