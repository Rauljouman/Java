package MP02Programacion.UF4.PersonaBonus;

public class main {
    public static void main(String[] args) {
        Programmer p = new Programmer("Elvio Lento", 2300, "Programmer");
        Developer d = new Developer("Eldro Gado", 3400, "Manager");
        Manager m = new Manager("Mario Neta", 4000, "Developer");

        System.out.println("Manager's Bonus: $" + m.calcularBonus());
        System.out.println("Developer's Bonus: $" + d.calcularBonus());
        System.out.println("Programmer's Bonus: $" + p.calcularBonus());

        System.out.println(m.generarReport());
        System.out.println(d.generarReport());
        System.out.println(p.generarReport());

        m.gestioProjecte();
        d.escribirCodigo();
        p.debug();
    }
}