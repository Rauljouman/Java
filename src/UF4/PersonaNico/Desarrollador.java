package UF4.PersonaNico;

public class Desarrollador extends Esclavo {
    private String lenguaje;

    public Desarrollador(String nombre, String direc, double salario, String puesto, String lenguaje) {
        super(nombre, direc, salario, puesto);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public void EscCodigo(){
        System.out.println("Developer " + getNombre() + " is writing code in  " + getLenguaje());

    }
    public double calcularBonus() {
        double bonus = getSalario() * 1.10;
        imprimirBonus(bonus);
        return bonus;
    }
    public String generarReporte(){
        String reporte = "good";
        imprimirRep(reporte);
        return reporte;
    }
}
