package MP02Programacion.UF2.calculAreesModular;

import java.util.Scanner;

public class calculAreesMod {

    public Scanner sc = new Scanner(System.in);
    private boolean fi = false;
    private double area = 0;

    public static void main(String[] args) {
        calculAreesMod programa = new calculAreesMod();
        programa.inici();
    }

    public void inici() {
        while (!fi) {
            mostrarMenu();
            EscullOpcio opcioFigura = new EscullOpcio();
            area = opcioFigura.triaOpcio();
            if (area != -1) {
                veureResultat(area);
            }
        }
    }

    public void mostrarMenu() {
        System.out.println("De quina figura vols calcular l'area?");
        System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.");
        System.out.println("Per acabar el programa: FI");
    }

    public void veureResultat(double area) {
        System.out.println("L area de tu figura " + " es " + area);
    }
}