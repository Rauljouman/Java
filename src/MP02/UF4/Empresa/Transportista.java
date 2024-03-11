package MP02.UF4.Empresa;

public class Transportista {
    private String nom ="";
    private String telefon = "";
    private int numLlicencia = 0;

    public Transportista() {

    }
    public Transportista(String nomTransportista, String telefonTransportista) {
        nom = nomTransportista;
        telefon = telefonTransportista;
    }
    public Transportista(String telefonTransportista, int numLlicenciaTransportista) {
        telefon = telefonTransportista;
        numLlicencia = numLlicenciaTransportista;
    }
    public Transportista(String nomTransportista, String telefonTransportista, int numLlicenciaTransportista) {
        nom = nomTransportista;
        telefon = telefonTransportista;
        numLlicencia = numLlicenciaTransportista;
    }

    public int getNumLlicencia() {
        return numLlicencia;
    }

    public void setNumLlicencia(int numLlicencia) {
        this.numLlicencia = numLlicencia;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void assignarEncarrec(Encarrec e) {

    }

    public void anularEncarrec(Encarrec e) {

    }

}
