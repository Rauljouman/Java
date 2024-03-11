package MP02.UF4.HerenciaSimpleEntregar;

public class Estudiant extends Persona {
    private String curs;

    private String assignatures;

    private String escola;

    private int notes;

    public Estudiant() {
    }

    public String getCurs(){
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public String getAssignatures() {
        return assignatures;
    }

    public void setAssignatures(String assignatures) {
        this.assignatures = assignatures;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public int getNotes() {
        return notes;
    }

    public void setNotes(int notes) {
        this.notes = notes;
    }

    public void visualizarEstudiant() {
        System.out.println("El curs es " + getCurs());
        System.out.println("L' assignatura " + getAssignatures());
        System.out.println("L' escola " + getEscola());
        System.out.println("La nota es " + getNotes());
    }
}
