package MP02Programacion.UF4.PersonaBonus;

public class Programmer extends Employee {
    public Programmer(String nom, double salari, String nomTreball) {
        super(nom, salari, nomTreball);
    }

    public void debug(String nom) {
        System.out.println("Programmer " + nom + " is debugging code in Java");
    }

    public void debug() {
        String language = "Java";
        System.out.println(getNomTreball() + getNom() + " is debugging code in " + language);
    }

    @Override
    public double calcularBonus() {
        return getSalari() * 0.12;
    }

    @Override
    public String generarReport() {
        String nota = "Excellent";
        return "Performance report for Programmer " + getNom() + ": Excellent";
    }
}
