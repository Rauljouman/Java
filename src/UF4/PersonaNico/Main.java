package UF4.PersonaNico;

public class Main {
    public static void main(String[] args){
        Programado p = new Programado("David", "Porto", 72000, "Programador");
        Manager m = new Manager("Rocio", "Sant Marti", 75000, "Manager", 10);
        Suicida s = new Suicida("Valentina", "Buenos Aires", 80000, "Desarrollador", "C#");
        p.calcularBonus();
        m.calcularBonus();
        s.calcularBonus();
        p.generarReporte();
        m.generarReporte();
        s.generarReporte();
        p.debug();
        m.gestionProyecto();
        s.EscCodigo();
    }
}
