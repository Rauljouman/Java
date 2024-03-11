
package MP02.UF2.calculAreesModular;

import java.util.Scanner;

public class calculAreesModular {

    private Scanner sc = new Scanner(System.in);
    private boolean fi = false;
    private double area = 0;

    public static void main(String[] args) {
        calculAreesModular programa = new calculAreesModular();
        programa.inici();
    }

    public void inici() {
        while (!fi) {
            mostrarMenu();
            EscullOpcio TriaOpcio = new EscullOpcio();
            EscullOpcio.triaOpcio();
        }
    }

    public void mostrarMenu() {
        System.out.println("De quina figura vols calcular l'area?");
        System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.");
        System.out.println("Per acabar el programa: FI");
    }
}
/*
    public void triaOpcio() {
        String figura = sc.nextLine();
        if (figura.equalsIgnoreCase("triangle")) {
            area = triangle();
        } else if (figura.equalsIgnoreCase("quadrat")) {
            quadrat();
        } else if (figura.equalsIgnoreCase("rectangle")) {
            rectangle();
        } else if (figura.equalsIgnoreCase("trapezi")) {
            trapezi();
        } else if (figura.equalsIgnoreCase("rombe")) {
            rombe();
        } else if (figura.equalsIgnoreCase("paralelogram")) {
            paralelogram();
        } else if (figura.equalsIgnoreCase("cercle")) {
            cercle();
        } else if (figura.equalsIgnoreCase("fi")) {
            System.out.println("Bye, bye!");
            fi = true;
        } else {
            System.out.println("Error, escull una figura!");
        }
        veureResultat();
    }
/*

    public void veureResultat() {
        System.out.println("L area de tu figura " + " es " + area);
    }
    /*
    //cas en que la figura = "triangle"
    public double triangle() {
        double b = 23.0;
        double h = 8.0;
        area = (b * h) / 2;
        return area;
    }

    //cas en que la figura = "quadrat"
    public double quadrat() {
        double r = 37.0;
        //funció matemàtica que eleva a 2 el radi
        area = Math.pow(r, 2);
        return area;
    }

    //cas en que la figura = "rectangle"
    public double rectangle() {
        double a = 68.0;
        double b = 39.0;
        area = a * b;
        return area;
    }

    //cas en que la figura = "trapezi"
    public double trapezi() {
        double a = 35.0;
        double b = 16.0;
        double h = 5.0;
        area = ((a * b) * h) / 2;
        return area;
    }

    //cas en que la figura = "rombe"
    public double rombe() {
        double dM = 75.0;
        double dm = 30.0;
        area = (dM * dm) / 2;
        return area;
    }

    //cas en que la figura = "paralelogram"
    public double paralelogram() {
        double b = 45.0;
        double h = 13.0;
        area = b * h;
        return area;
    }

    //cas en que la figura = "cercle"
    public double cercle() {
        Scanner s = new Scanner(System.in);
        System.out.println("Quin es el radi del cercle?");
        double r = s.nextDouble();
        //funció matemàtica que eleva a 2 el radi
        //Math.PI = nombre pi (3.14159....)
        area = Math.pow(r, 2) * Math.PI;
        return area;
    }

}
*/
