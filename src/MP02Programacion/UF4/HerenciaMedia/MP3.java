package MP02Programacion.UF4.HerenciaMedia;

public class MP3 extends Musica{
    private int mode;
    public MP3() {

    }

    public MP3(int modeMusica) {
        this.mode = modeMusica;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }
    public void visualizerMP3() {
        System.out.println("El mode es " + getMode());
    }
}
