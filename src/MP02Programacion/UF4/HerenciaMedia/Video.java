package MP02Programacion.UF4.HerenciaMedia;

public class Video extends Media{
    private String director;
    private String idioma;

    public Video() {

    }
    public Video(String directorVideo, String idiomaVideo) {
        this.director= directorVideo;
        this.idioma = idiomaVideo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public void visualizerVideo() {
        System.out.println("El director es " + getDirector());
        System.out.println("L' idioma es " + getIdioma());
    }
}

