package MP02Programacion.UF4.ProjecteFigura;

public class Rectangle extends Figura {

    private double a;
    private double b;

    public Rectangle(String figura, int id, double a, double b) {
        super(figura, id);
        this.a = a;
        this.b = b;
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

    @Override
    public double calcularArea() {
        double area = a * b;
        return area;
    }
}
