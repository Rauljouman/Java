package MP02Programacion.UF5.Button;

import java.awt.*;
import javax.swing.*;
public class Ventana extends JFrame {
    JPanel panel;

    public Ventana() {
        this.setSize(500, 500); // Tamaño
        setTitle("Primer boton"); // Titulo
        setMinimumSize(new Dimension(200, 200)); // Tamaño minimo de la ventana
        setLocationRelativeTo(null); // Lo pone en el centro la ventana
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Cierra ventana y acaba el programa.
    }

    private void iniciarComponentes() {
        panel();
        etiqueta();
        boton();
        dropdown();
    }

    private void panel() {
        panel = new JPanel(); // Crear un panel
        panel.setLayout(null); // Desactivar el diseño (layout)
        this.getContentPane().add(panel); // Agregar panel a la ventana
    }

    private void etiqueta(){
        JLabel etiqueta1 = new JLabel("Programming language: Selected: Java");
        etiqueta1.setBounds(50,50,250,60);
        panel.add(etiqueta1);
    }

    private void boton(){
        JButton boton1 = new JButton();
        boton1.setText("Show");
        boton1.setBounds(300,90,80,50);
        panel.add(boton1);
    }

    private void dropdown() {
        String[] languages = {"Java", "C", "C++", "C#", "PHP"};
        JComboBox<String> dropdown = new JComboBox<>(languages);
        dropdown.setBounds(50, 100, 100, 30);
        panel.add(dropdown);
    }

}