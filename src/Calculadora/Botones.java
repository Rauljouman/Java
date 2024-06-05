package Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;


public class Botones extends JFrame {
   JTextField caja;
   public Botones(JPanel panel, ActionListener listener, JTextField caja) {
      this.caja = caja;
      int[] posX = {50, 120, 190, 260, 50, 120, 190, 260, 50, 120, 190, 260, 50, 120, 190, 260, 50, 120, 190, 260};
      int[] posY = {70, 70, 70, 70, 140, 140, 140, 140, 210, 210, 210, 210, 280, 280, 280, 280, 350, 350, 350, 350};
      String[] numeros = {"OFF", "C", "CE", "/", "7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+", "0", "00", ".", "="};

      for (int i = 0; i < numeros.length; i++) {
         crearBotones(posX[i], posY[i], numeros[i], panel, listener);
      }
   }

   private void crearBotones(int x, int y, String numero, JPanel panel, ActionListener listener) {
      JButton boton = new JButton(numero);
      boton.setBounds(x, y, 60, 60);
      boton.addActionListener(listener);
      boton.setActionCommand(numero); // Conexió boto amb interacció
      boton.setBackground(Color.white);
      boton.setBorder(new LineBorder(Color.GRAY));
      panel.add(boton);
   }
}