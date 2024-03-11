package MP02.UF4.HerenciaSimple;

public class Animal {

    private static int id;

    public Animal(){

    }


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
