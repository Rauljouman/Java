/*package MP02.UF2.PrediccioPersona;

import java.util.Scanner;

public class PruebaExam {

    Scanner sc = new Scanner (System.in);
    public static void main (String[] args) {
        PruebaExam programa = new PruebaExam();
        programa.inici();
    }

    public void inici(){
        mostrarMenu();
        llegirTamany();
    }

    public void mostrarMenu(){
        System.out.println("Hola, dime las notas y te dire la nota más alta");
    }

    public int llegirTamany(){
        System.out.println("Dime la cantidad de notas que agrego");
        boolean pasa = false;
        int tamanyArray = 0;
        while(!pasa) {
            if (sc.hasNextInt()) {
                tamanyArray = sc.nextInt();
                pasa = true;
            }
            else {
                System.out.println("Te has equivocado, dime un numero");
                sc.next();
            }
        }
        elementArray(tamanyArray);
        return tamanyArray;
    }

    public int[] elementArray(int tamanyArray){
        int[] arrayNota = new int[tamanyArray];
        System.out.println("Ahora dime las notas.");
        for (int i = 0; i < arrayNota.length; i++) {
            if (sc.hasNextInt()) {
                arrayNota[i] = sc.nextInt();
            }
            else {
                System.out.println("No es un numero, repite");
                sc.next();
                i--;
            }
        }
        trobarNotaMax(arrayNota);
        return arrayNota;
    }

    public int trobarNotaMax(int[] arrayNota){
        int notaMax = arrayNota[0];
        for (int i = 0; i < arrayNota.length; i++ ) {
            if (notaMax < arrayNota[i]) {
                notaMax = arrayNota[i];
            }
        }
        llegirNotaMax(notaMax);
        return notaMax;
    }

    public void llegirNotaMax (int notaMax) {
        System.out.println("La nota més alta es " + notaMax);
    }
}
*/