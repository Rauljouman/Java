package MP02Programacion.UF4.HerenciaMedia;

public class Ogg extends Musica{
    private int versio;

    public Ogg() {

    }
    public Ogg(int versioOgg) {
        this.versio = versioOgg;
    }

    public int getVersio() {
        return versio;
    }

    public void setVersio(int versio) {
        this.versio = versio;
    }

    public void visualizerOgg() {
        System.out.println("La versio es " + getVersio());
    }
}
