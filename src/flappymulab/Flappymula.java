/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappymulab;

import javax.swing.JFrame;

/**
 *
 * @author CRIS
 */
public class Flappymula extends JFrame {
    
    // Aqui esta el maín del juego Flappymula
      private void initUI(){
        add(new Board());
        setSize(28350,791);
        setTitle("la Trocha");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
      
       public Flappymula(){
        initUI();
    }
       
       public static void main(String[] args) {
        // TODO code application logic here
        Flappymula board = new Flappymula();
        board.setVisible(true);
    }
    
}
