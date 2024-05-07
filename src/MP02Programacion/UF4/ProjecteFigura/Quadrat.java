package MP02Programacion.UF4.ProjecteFigura;

public class Quadrat extends Figura {

    private double costat1;
    private double costat2;

    public Quadrat(String figura, int id,double costat1, double costat2) {
        super(figura, id);
        this.costat1 = costat1;
        this.costat2 = costat2;
    }

    public double getCostat1() {
        return costat1;
    }

    public void setCostat1(double costat1) {
        this.costat1 = costat1;
    }

    public double getCostat2() {
        return costat2;
    }

    public void setCostat2(double costat2) {
        this.costat2 = costat2;
    }

    @Override
    public double calcularArea() {
        double area = 0;
        costat1 = 6.0;
        costat2 = 9.4;
        area = costat1 * costat2;
        return area;
    }
}
