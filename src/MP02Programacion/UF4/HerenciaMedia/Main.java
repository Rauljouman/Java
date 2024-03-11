package MP02Programacion.UF4.HerenciaMedia;

public class Main {
    public static void main (String[] args) {
        Media m1 = new Media("ProjectsDisc", 3);
        m1.visualizerMedia();
        Media m2 = new Media();
        m2.setNom("Ultimatum");
        m2.setDurada(6);
        m2.visualizerMedia();
        Musica mu1 = new Musica();
        mu1.setEstil("Trap");
        mu1.setArtista("Bad Bunny");
        mu1.visualizerMusica();
        Video v1 = new Video("James Cameron", "angles");
        v1.visualizerVideo();
        MP3 mp1 = new MP3(4);
        mp1.visualizerMP3();
        Ogg o1 = new Ogg(2);
        o1.visualizerOgg();
    }
}
