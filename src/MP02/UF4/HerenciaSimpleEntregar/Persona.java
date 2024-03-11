package MP02.UF4.HerenciaSimpleEntregar;

public class Persona {
    private static int id;

    private int edat;

    private String nom;

    private String cognom;

    private String adreca;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }
    public void visualizarPersona() {
        System.out.println("Alumne numero " + getId());
        System.out.println("El nom es " + getNom());
        System.out.println("El cognom es " + getCognom());
        System.out.println("L' edat es " + getEdat());
        System.out.println("L' adreça es " + getAdreca());
    }
}
