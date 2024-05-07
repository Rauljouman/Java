package MP02Programacion.UF4.PersonaBonus;

public class Employee {
    private String nom;
    private String direccio;
    private double salari;
    private String nomTreball;


    public Employee(String nom, double salari, String nomTreball) {
        this.nom = nom;
        this.salari = salari;
        this.nomTreball = nomTreball;
    }

    // Get and Set
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalari() {
        return salari;
    }

    public void setSalari(double salari) {
        this.salari = salari;
    }

    public String getNomTreball() {
        return nomTreball;
    }

    public void setNomTreball(String nomTreball) {
        this.nomTreball = nomTreball;
    }

    public double calcularBonus() {
        return 0;
    }
    public String generarReport() {
        return null;
    }
}
