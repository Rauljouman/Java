package MP02Programacion.UF3.ContadorParaules;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class ContadorParaules {

    public static void main(String[] args) {
        ContadorParaules programa = new ContadorParaules();
        programa.inici();
    }

    public void inici() {
        try {
            boolean llegir = true;
            File llegirParaules = new File("C:\\Users\\AngieRaul\\IdeaProjects\\Java\\src\\MP02Programacion\\UF3\\ContadorParaules\\entrada.txt");
            File numParaules = new File("C:\\Users\\AngieRaul\\IdeaProjects\\Java\\src\\MP02Programacion\\UF3\\ContadorParaules\\sortida.txt");

            Scanner lectorParaules = new Scanner(llegirParaules);
            PrintStream escriureNumParaules = new PrintStream(numParaules);


            if (numParaules.exists()) {
                System.out.println("El archivo de salida ya existe. Se sobrescribirá.");
            }

            int contarParaules = 0;
            while (lectorParaules.hasNext()) {
                String paraula = lectorParaules.next();
                contarParaules++;
            }

            escriureNumParaules.println("El numero de paraules que hi habia al arxiu es de " + contarParaules);
            lectorParaules.close();
            escriureNumParaules.close();

        } catch (Exception e) {
            System.out.println("Error al llegir o escriure en el arxiu. " + e);
        }
    }
}
