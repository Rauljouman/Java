package UF2.RegistreNotes;

public class RegistreNotesMod {
    public static void main(String[] args) {
        RegistreNotesMod programa = new RegistreNotesMod();
        programa.inici();
    }
    public void inici() {
        double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
        CalculsArraysReals calcular = new CalculsArraysReals();
        double max = calcular.calcularMaxim(notes);
        double min = calcular.calcularMinim(notes);
        double mitjana = calcular.calcularMitjana(notes);
        System.out.println("La nota màxima és " + max + ".");
        System.out.println("La nota mínima és " + min + ".");
        System.out.println("La mitjana de les notes és " + mitjana + ".");
    }
}
