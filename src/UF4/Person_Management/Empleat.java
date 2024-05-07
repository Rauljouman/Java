package UF4.Person_Management;

public class Empleat {
    private String Nom;
    private String Direccio;
    private double Salari;
    private String llocTreball;
    public  Empleat(String nom, double salari, String llocTreball) {
        this.Nom = nom;
        //this.Direccio = direccio;    Elimino la variable perque no s'utlitza.
        this.Salari = salari;
        this.llocTreball = llocTreball;
    }

    public String getNom() {
        return Nom;
    }

    /* public String getDireccio() {
        return Direccio;                                  S'elimna el get direcció ja que no s'utlitza.
    } */

    public double getSalari() {
        return Salari;
    }

    public String getLlocTreball() {
        return llocTreball;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    /* public void setDireccio(String direccio) {
        Direccio = direccio;                                    S'elimna el set direcció ja que no s'utlitza.
    } */

    public void setSalari(double salari) {
        Salari = salari;
    }

    public void setLlocTreball(String llocTreball) {
        this.llocTreball = llocTreball;
    }

    public double calcularBonus(){
        return 0;
    }

    public String generarReport() {
        return null;
    }
}

