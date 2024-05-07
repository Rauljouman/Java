package MP02Programacion.UF4.PersonaBonus;

public class Developer extends Employee {

    public Developer(String nom, double salari, String nomTreball) {
        super(nom, salari, nomTreball);
    }

    public void escribirCodigo() {
        String language = "Java";
        System.out.println("Developer " + getNom() + "is writing code in "+ language);
    }
    public double calcularBonus() {
        return getSalari() * 0.10;
    }
    @Override
    public String generarReport() {
        String nota = "Good";
        return "Performance report for Developer " + getNom() + ": " + nota;
    }
}
