package MP02Programacion.UF4.ProjecteFigura;

public class Trapezi extends Figura {

    private double a;

    private double b;

    private double h;

    public Trapezi(String figura, int id, double a, double b, double h) {
        super(figura, id);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calcularArea() {
        double area = ((a * b) * h) / 2;
        return area;
    }
}
