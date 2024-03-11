package MP02Programacion.UF2.NotaMitjanaMaxMinFuncions;

import java.util.Scanner;
public class NotaMitajanaMaxMinFuncions {

    private double[] notes = new double[5];
    private double notaMax;
    private double notaMin;
    private double notaMitjana;

    public static void main  (String []args) {
        NotaMitajanaMaxMinFuncions programa = new NotaMitajanaMaxMinFuncions();
        programa.inici();
    }

    public void inici(){
        mostraMenu();
        llegirDades();
    }

    public void mostraMenu() {
        System.out.println("Hola, diga'm 5 notes para posar a l'array.");
        System.out.println("Amb aquestes notes calculare la nota màxima, mínima i la mitjana.");
    }

    public void llegirDades(){
        elementsArray(notes);
        notaMax = notes[0];
        notaMin = notes[0];
        notaMitjana = notes[0];
        calculaMax(notes);
        calculaMin(notes);
        calculaMitjana(notes);
        llegirResultat(notaMax, notaMin, notaMitjana);
    }

    public double[] elementsArray (double[] notes) {
        //Afegeix notes notes
        Scanner sc = new Scanner (System.in);
        boolean pasa = false;
        while (!pasa) {
            for (int i = 0; i < notes.length; i++) {
                if (sc.hasNextDouble()) {
                    notes[i] = sc.nextDouble();
                    pasa = true;
                } else {
                    System.out.println("No vàlid, repeteix un altre cop");
                    sc.next();
                    i--;
                }
            }
        }
        return notes;
    }

    public double calculaMax(double[] notes) {
        for (int i = 0; i < notes.length; i++) {
            if (notaMax < notes[i]) {
                notaMax = notes[i];
                System.out.println("Nova data guardada");
            }
        }
        return notaMax;
    }

    public double calculaMin(double[] notes) {
        for (int i = 0; i < notes.length; i++) {
            if (notaMin > notes[i]) {
                notaMin = notes[i];
                System.out.println("Nova data guardada");
            }
        }
        return notaMin;
    }

    public double calculaMitjana(double[] notes) {
        int numNotas = 0;
        for (int i = 0; i < notes.length; i++) {
            notaMitjana+= notes[i];
            numNotas++;
        }
        notaMitjana = notaMitjana / numNotas;
        return notaMitjana;
    }

    public void llegirResultat(double notaMax, double notaMin, double notaMitjana){
        System.out.println("La nota més alta es... " + notaMax);
        System.out.println("La nota més baixa ha sigut... " + notaMin);
        System.out.println("La nota mitjana ha sigut... " + notaMitjana);
    }

}
