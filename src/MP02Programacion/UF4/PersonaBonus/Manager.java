package MP02Programacion.UF4.PersonaBonus;

public class Manager extends Employee {
    private int numTreballadors;
    private double salari;

    public Manager(String nom, double salari, String nomTreball) {
        super(nom, salari, nomTreball);
    }

    public void gestioProjecte() {
        System.out.println("Manager " + getNom() + " is managing a project" );
    }
    @Override
    public double calcularBonus() {
        return  salari * 0.10;
    }
    @Override
    public String generarReport() {
        String nota = "Good";
        return "Performance report for Manager " + getNom() + ": " + nota;
    }
}
