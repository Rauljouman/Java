package MP02Programacion.UF4.HerenciaSimple;

public class Animal {

    private static int id;

    public int getId() {
        id++;
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void sound() {
        System.out.println("By default it is mute");
    }
}

