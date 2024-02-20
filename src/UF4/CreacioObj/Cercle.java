package UF4.CreacioObj;

public class Cercle {
    private double radi;
    String color;

    public Cercle (double rad, String col){
        radi = rad;
        color = col;
    }
    public Cercle(double rad){
        radi = rad;
    }
    public String setColor(String color) {
        return color;
    }
    public String getColor() {
        return color;
    }
}
