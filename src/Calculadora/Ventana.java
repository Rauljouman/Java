package Calculadora;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    JPanel panel;
    JTextField caja;

    public Ventana() {
        this.setMinimumSize(new Dimension(385, 465));
        setTitle("Calculadora");
        setLocationRelativeTo(null);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        panel();
        Logica logicaBotones = new Logica(caja);
        Botones botones = new Botones(panel, logicaBotones, caja);
    }

    private void panel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        panel.setBackground(new Color(135, 206, 235));
        // Caja de los numeros.
        caja = new JTextField();
        caja.setBounds(50, 20, 280, 40);
        caja.setHorizontalAlignment(JTextField.RIGHT);
        caja.setEditable(false); // No deixar utilitzar el teclat
        caja.setBackground(Color.white);
        caja.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        Font font = new Font("Arial", Font.BOLD, 20);
        caja.setFont(font);
        panel.add(caja);
    }
}