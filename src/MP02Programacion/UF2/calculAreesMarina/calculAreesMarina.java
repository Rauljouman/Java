package MP02Programacion.UF2.calculAreesMarina;

import java.util.Scanner;

public class calculAreesMarina {

    private Scanner sc = new Scanner(System.in);
    private boolean fi = false;

    public static void main(String[] args) {
        calculAreesMarina programa = new calculAreesMarina();
        programa.inici();
    }

    public void inici() {
        double area = 0;
        while (!fi) {
            mostrarMenu();
            area = triaOpcio();
            if (area != -2) {
                veureResultat(area);
            }
        }
    }

    public void mostrarMenu() {
        System.out.println("De quina figura vols calcular l'area?");
        System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.");
        System.out.println("Per acabar el programa: FI");
    }

    public double triaOpcio() {
        double area = 0;
        String figura = sc.nextLine();
        if (figura.equalsIgnoreCase("triangle")) {
            area = triangle();
        } else if (figura.equalsIgnoreCase("quadrat")) {
           area = quadrat();
        } else if (figura.equalsIgnoreCase("rectangle")) {
            area = rectangle();
        } else if (figura.equalsIgnoreCase("trapezi")) {
            area = trapezi();
        } else if (figura.equalsIgnoreCase("rombe")) {
            area = rombe();
        } else if (figura.equalsIgnoreCase("paralelogram")) {
            area = paralelogram();
        } else if (figura.equalsIgnoreCase("cercle")) {
            area = cercle();
        } else if (figura.equalsIgnoreCase("fi")) {
            System.out.println("Bye, bye!");
            fi = true;
        } else {
            System.out.println("Error, escull una figura!");
            area = -2;
        }
        return area;
    }


    public void veureResultat(double area) {
        System.out.println("L area de tu figura " + " es " + area);
    }

    //cas en que la figura = "triangle"
    public double triangle() {
        double area = 0;
        double b = 23.0;
        double h = 8.0;
        area = (b * h) / 2;
        return area;
    }

    public double quadrat() {
        double area = 0;
        double r = 37.0;
        area = Math.pow(r, 2);
        return area;
    }

    public double rectangle() {
        double area = 0;
        double a = 68.0;
        double b = 39.0;
        area = a * b;
        return area;
    }

    public double trapezi() {
        double area = 0;
        double a = 35.0;
        double b = 16.0;
        double h = 5.0;
        area = ((a * b) * h) / 2;
        return area;
    }

    public double rombe() {
        double area = 0;
        double dM = 75.0;
        double dm = 30.0;
        area = (dM * dm) / 2;
        return area;
    }

    public double paralelogram() {
        double area = 0;
        double b = 45.0;
        double h = 13.0;
        area = b * h;
        return area;
    }

    public double cercle() {
        double area = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Quin es el radi del cercle?");
        double r = s.nextDouble();
        //funció matemàtica que eleva a 2 el radi
        //Math.PI = nombre pi (3.14159....)
        area = Math.pow(r, 2) * Math.PI;
        return area;
    }

}
