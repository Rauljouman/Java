package UF2.EstudiantICurs;

import java.util.Scanner;

public class Curs {
    Scanner sc = new Scanner(System.in);
    private int credits;
    public void cursInici(String nom){
        menuCurs();
        obtenirHores();
        mostrarInformacio(nom, credits);
    }
    public void menuCurs() {
        System.out.println("Amb els credits, et calcularem el total d'hores que faràs");
    }

    public int obtenirHores(){
        System.out.println("Quants credits has de fer?");
        boolean fi = false;
        while (!fi) {
            if (sc.hasNextInt()) {
                credits = sc.nextInt();
                fi = true;
            }
            else {
                System.out.println("Error, introdueix un numero");
                sc.nextLine();
            }
        }
        return credits;
    }
    public void mostrarInformacio(String nom, int credits) {
        System.out.println("Et comento " + nom + ", tens " + credits + ", per lo tant hauràs de fer un total de " + credits*15 + " hores.");
    }
}