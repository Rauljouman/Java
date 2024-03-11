package MP02.UF4.Empresa;

public class Sucursal {

    private String nom;
    private String adreca;
    private String telefon;
    private String email;


    public Sucursal() {

    }

    public Sucursal(String nomSucursal, String telefonSucursal){
        nom = nomSucursal;
        telefon = telefonSucursal;
    }

    public Sucursal(String nomSucursal, String telefonSucursal, String adrecaSucursal) {
        nom = nomSucursal;
        telefon = telefonSucursal;
        adreca = adrecaSucursal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void descansa(Transportista t) {

    }

    public void treballa(Client c){

    }

    public void altaClient(Client c)  {

    }

    public void baixaClient(Client c) {

    }

    public void altaEncarrec(Client c, Transportista t, Encarrec e) {

    }

    public void anulament(Encarrec e) {

    }



}
