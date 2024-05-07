package UF4.Person_Management;

public class Main {
    public static void main(String[] args) {
        Gerent manager = new Gerent("Avril Aroldo", 80000.0, "Manager", 5);
        Desenvolupador developer = new Desenvolupador("Iver Dipali", 72000.0, "Desenvolupador", "Java");
        Programador programmer = new Programador("Yaron Gabriel",  76000.0, "Programador", "Python");

        System.out.println("Manager's Bonus: $" + manager.calcularBonus());
        System.out.println("Developer's Bonus: $" + developer.calcularBonus());
        System.out.println("Programmer's Bonus: $" + programmer.calcularBonus());

        System.out.println(manager.generarReport());
        System.out.println(developer.generarReport());
        System.out.println(programmer.generarReport());

        manager.manageProject();
        developer.escriureCodi();
        programmer.debugCode();
    }
}
