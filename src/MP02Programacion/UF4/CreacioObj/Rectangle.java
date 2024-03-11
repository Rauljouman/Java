package MP02Programacion.UF4.CreacioObj;

public class Rectangle {
    private int base;
    private int alçada;
    private String color;

    public Rectangle() {

    }

    public Rectangle (String col) {
        color = col;
    }

    public Rectangle (int ba, int altura, String col) {
        base = ba;
        alçada = altura;
        color = col;
    }

    public Rectangle (int ba, int altura){
        base = ba;
        alçada = altura;
    }

    public void setColor(String color) {
        color = color;
    }
    public String getColor() {
        return color;
    }

}
