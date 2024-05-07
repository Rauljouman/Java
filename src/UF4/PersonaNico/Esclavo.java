package UF4.PersonaNico;

public class Esclavo {

    private String nombre;
    private String direc;
    private double salario;
    private String puesto;

    public Esclavo(String nombre, String direc, double salario, String puesto) {
        this.nombre = nombre;
        this.direc = direc;
        this.salario = salario;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double calcularBonus() {
        return 0;

    }

    public String generarReporte() {

        return "";
    }
    public void imprimirBonus(double bonus){
        System.out.println(puesto + " Bonus: " + bonus);
    }

    public void imprimirRep(String reporte){
        System.out.println("Performance report for " + nombre + ":" + reporte);
    }
}