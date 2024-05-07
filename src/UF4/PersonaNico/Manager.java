package UF4.PersonaNico;

public class Manager extends Esclavo {

    private int numTrabajo;

    public Manager(String nombre, String direc, double salario, String puesto, int numTrabajo) {
        super(nombre, direc, salario, puesto);
        this.numTrabajo = numTrabajo;
    }

    public int getNumTrabajo() {
        return numTrabajo;
    }

    public void setNumTrabajo(int numTrabajo) {
        this.numTrabajo = numTrabajo;
    }

    public void gestionProyecto(){

        System.out.println("Manager " + getNombre()+ " is managing a project" );
    }

    @Override
    public double calcularBonus() {
        double bonus = getSalario() * 0.15;
        imprimirBonus(bonus);
        return bonus;
    }
    @Override
    public String generarReporte(){
        String reporte = "PERFECT";
        imprimirRep(reporte);
        return reporte;
    }
}
