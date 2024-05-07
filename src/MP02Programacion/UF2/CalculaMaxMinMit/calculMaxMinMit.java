package MP02Programacion.UF2.CalculaMaxMinMit;

import java.util.Scanner;

public class calculMaxMinMit {

    public static void main (String[] args) {
        calculMaxMinMit programa = new calculMaxMinMit();
        programa.inici();
    }

    public void inici() {
        mostrarMenu();
        llegirDades();
    }

    public void mostrarMenu() {
        System.out.println("Soc un programa per calcular la nota mitjana, maxima i minima");
    }

    public void llegirDades() {
        Scanner sc = new Scanner(System.in);
        boolean fi = false;
        int tamany = 0;
        while (!fi) {
            System.out.println("Diga'm el tamany de l' array");
            if (sc.hasNextInt()) {
                tamany = sc.nextInt();
                fi = true;
            }
            else {
                System.out.println("Error, prova de nou");
                sc.next();
            }
        }
        int[] array = new int[tamany];
        System.out.println("Ara, diguem les notes");
        for (int i = 0; i < tamany; i++) {
            if (sc.hasNextInt()) {
                array[i] = sc.nextInt();
                System.out.println("S'ha agregat el " + array[i]);
            }
            else {
                System.out.println("Error, prova de nou");
                sc.next();
                i--;
            }
        }
        double mitjana = calculaMitjana(array);
        int notaMax = calculMax(array);
        int notaMin = calculMin(array);
        visualizer(mitjana, notaMax, notaMin);
    }

    public double calculaMitjana(int[] array){
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma/array.length;
    }

    public int calculMax(int[] array){
        int notaMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (notaMax < array[i]) {
                notaMax = array[i];
            }
        }
        return notaMax;
    }

    public int calculMin(int[] array){
        int notaMin = array[0];
        for (int i = 0; i < array.length; i++) {
            if (notaMin > array[i]) {
                notaMin = array[i];
            }
        }
        return notaMin;
    }

    public void visualizer(double mitjana, int notaMax, int notaMin) {
        System.out.println("La nota mitjana es " + mitjana);
        System.out.println("La nota més alta es " + notaMax);
        System.out.println("La nota més baixa es " + notaMin);
    }
}