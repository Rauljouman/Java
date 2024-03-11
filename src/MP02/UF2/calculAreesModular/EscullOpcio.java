package MP02.UF2.calculAreesModular;
import java.util.Scanner;
public class EscullOpcio {
    static Scanner sc = new Scanner (System.in);
    static double area = 0;
    public static double triaOpcio() {
        String figura = sc.nextLine();
        boolean fi = false;
        if (figura.equalsIgnoreCase("triangle")) {
            TriangleOperacio triangleCalcul = new TriangleOperacio();
            area = triangleCalcul.triangle();
        } else if (figura.equalsIgnoreCase("quadrat")) {
            QuadratOperacio quadratCalcul = new QuadratOperacio();
            area = quadratCalcul.quadrat();
        } else if (figura.equalsIgnoreCase("rectangle")) {
            RectangleOperacio rectangleCalcul = new RectangleOperacio();
            area = rectangleCalcul.rectangle();
        } else if (figura.equalsIgnoreCase("trapezi")) {
            TrapeziOperacio trapeziCalcul = new TrapeziOperacio();
            area = trapeziCalcul.trapezi();
        } else if (figura.equalsIgnoreCase("rombe")) {
            RombeOperacio rombeCalcul = new RombeOperacio();
            area = rombeCalcul.rombe();
        } else if (figura.equalsIgnoreCase("paralelogram")) {
            ParalelogramOperacio paralelogramOperacio = new ParalelogramOperacio();
            area = paralelogramOperacio.paralelogram();
        } else if (figura.equalsIgnoreCase("cercle")) {
            CercleOperacio cercleCalcul = new CercleOperacio();
            area = cercleCalcul.cercle();
        } else if (figura.equalsIgnoreCase("fi")) {
            System.out.println("Bye, bye!");
            fi = true;
        } else {
            System.out.println("Error, escull una figura!");
            area = -1;
        }
        return area;
    }
}
