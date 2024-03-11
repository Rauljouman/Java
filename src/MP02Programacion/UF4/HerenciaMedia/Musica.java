package MP02Programacion.UF4.HerenciaMedia;

public class Musica extends Media {
    private String estil;
    private String artista;

    public Musica() {

    }

    public String getEstil() {
        return estil;
    }

    public void setEstil(String estil) {
        this.estil = estil;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void visualizerMusica() {
        System.out.println("L' artista es " + getArtista());
        System.out.println("L' estil es " + getEstil());
    }
}
