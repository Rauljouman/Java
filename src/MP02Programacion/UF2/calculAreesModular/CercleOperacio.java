package MP02Programacion.UF2.calculAreesModular;

import java.util.Scanner;

public class CercleOperacio {
    public double area = 0;

    public double cercle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quin es el radi del cercle?");
        double r = sc.nextDouble();
        //funció matemàtica que eleva a 2 el radi
        //Math.PI = nombre pi (3.14159....)
        area = Math.pow(r, 2) * Math.PI;
        return area;
    }
}
