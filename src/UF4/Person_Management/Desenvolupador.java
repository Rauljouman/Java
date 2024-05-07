package UF4.Person_Management;

public class Desenvolupador extends Empleat {
    private String llenguatgeProgramacio;

    public Desenvolupador(String nom, double salari, String llocTreball, String llenguatgeProgramacio) {
        super(nom, salari, llocTreball); //S'elimina la variable direcció ja que no s'utlitza.
        this.llenguatgeProgramacio = llenguatgeProgramacio;
    }

    public String getLlenguatgeProgramacio() {
        return llenguatgeProgramacio;
    }

    public void setLlenguatgeProgramacio(String llenguatgeProgramacio) {
        this.llenguatgeProgramacio = llenguatgeProgramacio;
    }

    @Override
    public double calcularBonus() {
        return getSalari() * 0.10;
    }

    @Override
    public String generarReport() {
        return "Informe de rendiment per al desenvolupador " + getNom() + ": Bo";
    }

    public void escriureCodi() {
        System.out.println("El desenvolupador " + getNom() + " està escrivint codi en " + llenguatgeProgramacio + ".");    }
}
