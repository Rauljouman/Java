package Calculadora;

public class Operaciones {
    public double calcularOperaciones(String expresion) {
        // Remover espacios en blanco
        expresion = expresion.replaceAll("\\s", "");

        // Dividir la expresión en operandos y operadores
        String[] partes = expresion.split("(?<=[-+*/])|(?=[-+*/])");

        // Inicializar el resultado con el primer operando
        double resultado = Double.parseDouble(partes[0]);

        // Iterar sobre los operandos y operadores
        for (int i = 1; i < partes.length; i += 2) {
            String operador = partes[i];
            double operando = Double.parseDouble(partes[i + 1]);

            // Realizar la operación correspondiente
            switch (operador) {
                case "+":
                    resultado += operando;
                    break;
                case "-":
                    resultado -= operando;
                    break;
                case "*":
                    resultado *= operando;
                    break;
                case "/":
                    // Manejar división por cero
                    if (operando == 0) {
                        throw new ArithmeticException("División por cero");
                    }
                    resultado /= operando;
                    break;
                default:
                    throw new IllegalArgumentException("Operador no válido: " + operador);
            }
        }

        return resultado;
    }
}