package MP02Programacion.UF4.ProjecteFigura;

public class Rombe extends Figura {

    private double dM;
    private double dm;

    public Rombe (String figura, int id, double dM, double dm){
        super(figura, id);
        this.dm = dm;
        this.dM = dM;
    }
    public double getdM() {
        return dM;
    }

    public void setdM(double dM) {
        this.dM = dM;
    }

    public double getDm() {
        return dm;
    }

    public void setDm(double dm) {
        this.dm = dm;
    }

    @Override
    public double calcularArea() {
        double area = (dM * dm) / 2;
        return area;
    }
}
