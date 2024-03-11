package MP02Programacion.UF4.CreacioObj;

public class MainRectangle {
    public static void main (String[] args) {
        Rectangle r0 = new Rectangle();
        Rectangle r1 = new Rectangle("azul");
        Rectangle r2 = new Rectangle(5,3,"verde");
        Rectangle r3 = new Rectangle (3, 5);
        r3.setColor("azul");

        Quadrat q0 = new Quadrat(3, "vermell");
        Quadrat q1 = new Quadrat();
        q0.setColor("vermell");
        System.out.println(q1);

        Triangle t0 = new Triangle();
        Triangle t1 = new Triangle(4,4,3,"verd");

        Cercle c0 = new Cercle(2.5, "blau");
        Cercle c1 = new Cercle(3.2);
        c1.setColor("amarillo");
    }
}
