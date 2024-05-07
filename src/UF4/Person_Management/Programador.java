package UF4.Person_Management;
public class Programador extends Empleat {

    private String llenguatgeProgramacio;

    public Programador(String nom, double salari, String llocTreball, String llenguatgeProgramacio) {
        super(nom, salari, llocTreball); //S'elimina la variable direcció ja que no s'utlitza.
        this.llenguatgeProgramacio = llenguatgeProgramacio;
    }

    public void debugCode() {
        System.out.println("El programador " + getNom() + " està depurant el codi en " + llenguatgeProgramacio + ".");
    }

    @Override
    public String generarReport(){
        return "Informe de rendiment per al programador " + getNom() + ": Excel·lent";
    }

    @Override
    public double calcularBonus(){
        return getSalari() * 0.12;
    }

}
