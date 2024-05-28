package Calculadora;

import javax.swing.*;
import java.awt.*;


public class Ventana extends JFrame {
    JPanel panel;
    JTextField caja;

    public Ventana() {
        this.setSize(385, 465);
        this.setMinimumSize(new Dimension(350, 350));
        setTitle("Calculadora");
        setLocationRelativeTo(null);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        panel();
        Logica logicaBotones = new Logica(caja);
        Botones Botones = new Botones(panel, logicaBotones, caja);
    }

    private void panel() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        this.getContentPane().add(panel);
        //Caja de los numeros.
        caja = new JTextField();
        caja.setBounds(50, 20, 280, 40);
        caja.setHorizontalAlignment(JTextField.RIGHT);
        caja.setEditable(false);
        caja.setBackground(Color.white);
        Font font = new Font("Arial", Font.BOLD, 20);
        caja.setFont(font);
        panel.add(caja);
    }
}

