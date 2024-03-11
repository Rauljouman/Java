package MP02Programacion.UF4.Empresa;

public class TipusProducte {

private String nom = "";

private String codiIdentificador = "";

private int preu = 0;

private int estoc = 0;

private boolean aLaVenda = false;

    public TipusProducte() {
    }

    public TipusProducte(String nomTipusProducte, String codiIdentificadorTipusProducte, int preuTipusProducte, int estocTipusProducte) {
        this.nom = nom;
        this.codiIdentificador = codiIdentificador;
        this.preu = preu;
        this.estoc = estoc;
    }

    public TipusProducte (String codiIdentificadorTipusProducte, int preuTipusProducte, int estocTipusProducte) {
        this.codiIdentificador = codiIdentificador;
        this.preu = preu;
        this.estoc = estoc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodiIdentificador() {
        return codiIdentificador;
    }

    public void setCodiIdentificador(String codiIdentificador) {
        this.codiIdentificador = codiIdentificador;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public int getEstoc() {
        return estoc;
    }

    public void setEstoc(int estoc) {
        this.estoc = estoc;
    }
}