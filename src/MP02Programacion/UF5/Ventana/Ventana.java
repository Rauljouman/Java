package MP02Programacion.UF5.Ventana;

import java.awt.*;
import javax.swing.*;


    public class Ventana extends JFrame {
        JPanel panel;

        public Ventana() {
            this.setSize(400, 400);
            setTitle("2 botones");
            setLocationRelativeTo(null);
            iniciarComponents();
            buttonComponents();
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        // Inicialitza els components
        public void iniciarComponents() {
            panel = new JPanel();
            panel.setLayout(null);
            this.getContentPane().add(panel);
        }

        // Afegeix els botons al panel
        private void buttonComponents() {
            // Crea el primer botó
            JButton boton1 = new JButton();
            boton1.setText("Click");
            boton1.setBounds(80, 100, 100, 40);
            boton1.setForeground(Color.blue);
            boton1.setFont(new Font("cooper black",3,20));
            panel.add(boton1);

            // Crea el segon botó
            JButton boton2 = new JButton();
            boton2.setBounds(80, 200, 100, 40);
            ImageIcon imatge = new ImageIcon("src/MP02Programacion/UF5/Ventana/manoClick.png");
            Image img = imatge.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH);
            boton2.setIcon(new ImageIcon(img));
            panel.add(boton2);
        }
    }

