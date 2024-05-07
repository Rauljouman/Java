package MP02Programacion.UF3.GenerarFitxerNotes;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class GenerarNotasFitxer {

    public static final String llegir_FI = "fi";

    public static void main(String[] args) {
        GenerarNotasFitxer programa = new GenerarNotasFitxer();
        programa.inici();
    }

    public void inici() {
        try {
            boolean llegir = true;
            File notasAño = new File("C:\\Users\\AngieRaul\\IdeaProjects\\Java\\src\\MP02Programacion\\UF3\\GenerarFitxerNotes\\NotasAño.txt");
            File notasMedia = new File("C:\\Users\\AngieRaul\\IdeaProjects\\Java\\src\\MP02Programacion\\UF3\\GenerarFitxerNotes\\NotasMedia.txt");
            Scanner lectorNotaAño = new Scanner(notasAño);
            PrintStream lecturaNotaMedia = new PrintStream(notasMedia);
            while (llegir) {
                String nom = lectorNotaAño.next();
                if (llegir_FI.equals(nom)) {
                    llegir = false;
                } else {
                    String cognom = lectorNotaAño.next();
                    double mitjana = llegirNotes(lectorNotaAño);
                    lecturaNotaMedia.println("Estudiant: " + nom + " " + cognom + " - Nota mitjana " + mitjana);
                }
            }
        }
        catch(Exception e){
            System.out.println("Exception " + e);
        }
    }

    public double llegirNotes(Scanner lector) {
        double res = 0;
        int contador = 0;
        try {
            while (true) {
                double nota = lector.nextDouble();
                if (nota == -1) {
                    break;
                }
                res += nota;
                contador++;
            }
            if (contador != 0) {
                res /= contador;
            }
        } catch (Exception e) {
            System.out.println("Error llegint notes: " + e);
        }
        return res;
    }
}
