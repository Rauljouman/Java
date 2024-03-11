import java.util.Scanner;
public class Main {
    Scanner sc = new Scanner(System.in);
    private int[] arrayTemperatura = new int[365];
    boolean fi = false;
    public static void main(String[] args) {
        Main programa = new Main();
        programa.inici();
    }

    public void inici() {
        while (!fi) {
            mostraMenu();
            escullOpcio();
        }
    }

    public void mostraMenu() {
        System.out.println("\nBenvingut al registre de temperatures");
        System .out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
        System.out.println("[RT] Registrar temperatures setmanals.");
        System.out.println("[MJ] Consultar temperatura mitjana.");
        System.out.println("[DF] Consultar diferència màxima.");
        System.out.println("[FI] Sortir.");
        System.out.print("Opció: ");
    }

    public void escullOpcio() {
        Scanner lector = new Scanner(System.in);
        String opcio = lector.nextLine();
        if (opcio.equalsIgnoreCase("RT")) {
            registreTemperaturesSetmanals();
        }
        else if (opcio.equalsIgnoreCase("FI")) {
            //S’ha esborrat el m tode finalitzarExecuci  i s’ha posat el seu codi directament.
            fi = true;
        }
        else {
            System.out.println("Opció incorrecta!\n");
        }
    }

    public void registreTemperaturesSetmanals() {
        int numLlegides = 0;
        while (numLlegides < 7) {
            if (sc.hasNextFloat()) {
                arrayTemperatura[numLlegides] = sc.nextInt();
                numLlegides++;
            } else {
                sc.next();
            }
        }
    }

}