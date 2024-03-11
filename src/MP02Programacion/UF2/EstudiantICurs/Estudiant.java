package MP02Programacion.UF2.EstudiantICurs;
import java.util.Scanner;
public class Estudiant {
    Scanner sc = new Scanner (System.in);
    int edat = 0;
    String nom = "";
    public void estudiantInici(String nom) {
        dadesEstudiant();
        mostraInformacio(nom, edat);
        majorEdat(edat);
        SaludaEstudiant(nom);
    }

    public String dadesEstudiant() {
        boolean pasa = false;
        while (!pasa) {
            System.out.println("Quin es el nom del alumne?");
            if (!sc.hasNextDouble()) {
                nom = sc.nextLine();
                System.out.println("Quina es la edat de l' alumne?");
                if (sc.hasNextInt()) {
                    System.out.println("Quina es la edat de l' alumne?");
                    edat = sc.nextInt();
                    if (edat > 0) {
                        pasa = true;
                    } else {
                        System.out.println("L'edat ha de ser positiu");
                        sc.nextLine();
                    }
                }
                else {
                    System.out.println("Error de l'edat");
                    sc.nextLine();
                }
            }
            else {
                System.out.println("Error, prova de nou");
                sc.nextLine();
            }
        }
        return nom;
    }

    public String mostraInformacio(String nom, int edat) {
        System.out.println("El teu nom es " + nom + ".");
        System.out.println("I la teva edat es " + edat + ".");
        return nom;
    }

    public int majorEdat(int edat) {
        if (edat >= 18) {
            System.out.println("Ets major de edat");
        }
        else {
            System.out.println("Encara no ets major de edat");
        }
        return edat;
    }

    public String SaludaEstudiant(String nom) {
        System.out.println("Bones " + nom + "!!");
        return nom;
    }
}