package MP02.UF2.calculAreesModular;

public class TrapeziOperacio {
    public double area = 0;

    public double trapezi() {
        double a = 35.0;
        double b = 16.0;
        double h = 5.0;
        area = ((a * b) * h) / 2;
        return area;
    }
}
