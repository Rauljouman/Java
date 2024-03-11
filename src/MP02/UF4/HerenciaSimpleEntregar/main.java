package MP02.UF4.HerenciaSimpleEntregar;

public class main {

    public static void main (String[] args) {
        Estudiant e1 = new Estudiant();
        e1.setNom("Raul");
        e1.setCognom("Ip");
        e1.setEdat(25);
        e1.setAdreca("Travessera de Collblanc");
        e1.setCurs("1 Primaria");
        e1.setAssignatures("Matemàtiques");
        e1.setEscola("CEIP Pau Romeva");
        e1.setNotes(8);
        e1.visualizarPersona();
        e1.visualizarEstudiant();
    }
}
