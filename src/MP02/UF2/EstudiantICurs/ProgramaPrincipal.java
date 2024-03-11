package MP02.UF2.EstudiantICurs;
import java.util.Scanner;
public class ProgramaPrincipal {
    Scanner sc = new Scanner(System.in);
    boolean fi = false;
    public String nom = "";
    public static void main (String[] args) {
        ProgramaPrincipal programa = new ProgramaPrincipal();
        programa.inici();

    }
    public void inici(){
        while (!fi){
            mostraMenu();
            escullOpcio();
        }
    }

    public void mostraMenu(){
        System.out.println("Hola, diga'm quina opció vols!!");
        System.out.println("[Calcular] Calcular el total d'hores segons els credits");
        System.out.println("[Fi] Finalitzar el programa");
    }

    public String escullOpcio(){
        String opcio = sc.nextLine();
        if (opcio.equalsIgnoreCase("Calcular")){
            Estudiant InfoEstudiant =  new Estudiant();
            InfoEstudiant.estudiantInici(nom);
            Curs CalculCurs = new Curs();
            CalculCurs.cursInici(nom);
        }
        else if (opcio.equalsIgnoreCase("Fi")) {
            System.out.println("D'acord, bye bye!!");
            fi = true;
        }
        else {
            System.out.println("Escriu una opció vàlida. Proba de nou.");
        }
        return opcio;
    }




}

