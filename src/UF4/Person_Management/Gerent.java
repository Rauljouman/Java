package UF4.Person_Management;
public class Gerent extends Empleat {
    private int nombreTreballadors;

    public Gerent(String nom, double salari, String llocTreball, int nombreTreballadors) {
        super(nom, salari, llocTreball); //S'elimina la variable direcció ja que no s'utlitza.
        this.nombreTreballadors = nombreTreballadors;
    }

    @Override
    public double calcularBonus() {
        return getSalari() * 0.15;
    }

    @Override
    public String generarReport() {
        return "Informe de rendiment per al gerent " + getNom() + ": Excel·lent";
    }

    public void manageProject() {
        System.out.println("El gerent " + getNom() + " està organitzant un projecte.");
    }
}
