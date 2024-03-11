package MP02Programacion.UF4.HerenciaMedia;

public class Media {
    private String nom;

    private int durada;

    public Media(){

    }
    public Media(String nomMedia, int duradaMedia){
        this.durada = duradaMedia;
        this.nom = nomMedia;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDurada() {
        return durada;
    }

    public void setDurada(int durada) {
        this.durada = durada;
    }

    public void visualizerMedia() {
        System.out.println("El nom es " + getNom());
        System.out.println("La durada es de " + getDurada());
    }
}
