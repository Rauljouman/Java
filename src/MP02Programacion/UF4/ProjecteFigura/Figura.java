package MP02Programacion.UF4.ProjecteFigura;
import java.util.Scanner;

public class Figura {
    private String figura;
    private int id;

    private double area;

    public Figura(String figura, int id) {
        this.id = id;
        this.figura = figura;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void mostrarMenu(){
        System.out.println("¿Qué figura geométrica desea crear?");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectángulo");
        System.out.println("4. Trapecio");
        System.out.println("5. Rombo");
        System.out.println("6. Paralelogramo");
        System.out.println("8. Fin Programa");
    }

    public void seguentFigura() {
        Scanner sc = new Scanner (System.in);
        boolean pasa = false;
        while(!pasa){
            mostrarMenu();
            int opcio = 0;
            if(sc.hasNextInt()){
                opcio=sc.nextInt();
                if (opcio >= 1 && opcio < 9) {
                    pasa = llegirDades(pasa, opcio,id);
                }
                else {
                    System.out.println("Ingresa un numero del 1 al 9");
                    sc.next();
                }
            }
            else{
                System.out.println("Error.");
                sc.next();
            }
        }
    }

    public boolean llegirDades(boolean pasa,int opcio, int id) {
        Scanner sc = new Scanner(System.in);
        if (opcio == 1) {
            System.out.println("Diga'm la base");
            double b = sc.nextInt();
            System.out.println("Diga'm la altura");
            double h = sc.nextInt();
            Triangle t = new Triangle("Triángulo", 1, b,h); //
            setArea(t.calcularArea());
            t.imprimirDades(area);
        }
        else if (opcio == 2) {
            System.out.println("Diga'm el costat 1");
            double costat1 = sc.nextInt();
            System.out.println("Diga'm el costat 2");
            double costat2 = sc.nextInt();
            Quadrat q = new Quadrat("Quadrat", 2,costat1,costat2);
            setArea(q.calcularArea());
            q.imprimirDades(area);
        }
        else if (opcio == 3) {
            System.out.println("Diga'm el costat 1");
            double a = sc.nextInt();
            System.out.println("Diga'm el costat 2");
            double b = sc.nextInt();
            Rectangle r = new Rectangle("Rectangle", 3, a, b);
            setArea(r.calcularArea());
            r.imprimirDades(area);
        }
        else if (opcio == 4) {
            System.out.println("Diga'm el costat 1");
            double a = sc.nextInt();
            System.out.println("Diga'm la base");
            double b = sc.nextInt();
            System.out.println("Diga'm l' altura");
            double h = sc.nextInt();
            Trapezi tr = new Trapezi("Trapezi", 4,a,b,h);
            setArea(tr.calcularArea());
            tr.imprimirDades(area);
        }
        else if (opcio == 5) {
            System.out.println("Diga'm la primera variable");
            double dM = sc.nextInt();
            System.out.println("Diga'm la segona variable");
            double dm = sc.nextInt();
            Rombe r = new Rombe("Rombe", 5, dM,dm);
            setArea(r.calcularArea());
            r.imprimirDades(area);
        }
        else if (opcio == 6) {
            System.out.println("Diga'm la base");
            double b = sc.nextInt();
            System.out.println("Diga'm l' altura");
            double h = sc.nextInt();
            Paralelogram p = new Paralelogram("Paralelogram", 6,h,b);
            setArea(p.calcularArea());
            p.imprimirDades(area);
        }
        else if (opcio == 7) {
            System.out.println("Diga'm el radi");
            double radi = sc.nextInt();
            Cercle c = new Cercle("Cercle", 7, radi);
            setArea(c.calcularArea());
            c.imprimirDades(area);
        }
        else if (opcio == 8){
            pasa = true;
            System.out.println("Fin del Programa");
        }
        return pasa;
    }

    public void imprimirDades(double area) {
        System.out.println("La teva figura escullida es " + figura);
        System.out.println("La id de la figura es " + id);
        System.out.println("L area es " + area);
    }


    public double calcularArea() {
        return area;
    }
}