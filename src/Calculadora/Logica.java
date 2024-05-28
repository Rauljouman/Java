package Calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Logica implements ActionListener {
    private JTextField inputUsuari;
    private double primerNumero;
    private String operador;
    private boolean resultadoMostrado;

    public Logica(JTextField caja) {
        this.inputUsuari = caja;
        this.primerNumero = 0;
        this.operador = "";
        this.resultadoMostrado = false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String valor = e.getActionCommand();
        switch (valor) {
            case "OFF":
                System.exit(0);
                break;
            case "C":
                inputUsuari.setText("");
                primerNumero = 0;
                operador = "";
                resultadoMostrado = false;
                break;
            case "CE":
                String text = inputUsuari.getText();
                if (text.length() > 0) {
                    inputUsuari.setText(text.substring(0, text.length() - 1));
                }
                break;
            case "=":
                try {
                    if (!operador.isEmpty()) {
                        double segundoNumero = Double.parseDouble(inputUsuari.getText());
                        double resultado = calcular(primerNumero, segundoNumero, operador);
                        inputUsuari.setText(String.valueOf(resultado));
                        primerNumero = resultado;
                        resultadoMostrado = true;
                    }
                } catch (NumberFormatException ex) {
                    inputUsuari.setText("Error");
                }
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                if (!inputUsuari.getText().isEmpty()) {
                    primerNumero = Double.parseDouble(inputUsuari.getText());
                    inputUsuari.setText("");
                    operador = valor;
                    resultadoMostrado = false;
                }
                break;
            default:
                if (!resultadoMostrado) {
                    if (inputUsuari.getText().length() < 9) {
                        inputUsuari.setText(inputUsuari.getText() + valor);
                    }
                } else {
                    inputUsuari.setText(valor);
                    resultadoMostrado = false;
                }
                break;
        }
    }

    private double calcular(double num1, double num2, String operador) {
        switch (operador) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("División por cero");
                }
            default:
                throw new IllegalArgumentException("Operador no válido");
        }
    }
}
