package MP02.UF4.CreacioObj;

public class Triangle {
    private int costat1;
    private int costat2;
    private int costat3;
    String color = "";

    public Triangle(){

    }
    public Triangle (int cost1, int cost2, int cost3,String col) {
        costat1 = cost1;
        costat2 = cost2;
        costat3 = cost3;
        color = col;
    }
}
