import java.util.Scanner;
public class PrediccioPersonaMarina {

    private Scanner sc = new Scanner (System.in);
    private String nomEscullit = " ";
    private int edat = 0; //Arreglar

    public static void main (String [] args) {
        PrediccioPersonaMarina programa = new PrediccioPersonaMarina();
        programa.inici();
    }

    public void inici() {
        mostraPregunta1();
        opcioMes();
    }

    public void mostraPregunta1(){
        //Mostra missatge per escullir mes
        System.out.print("Escriu el mes en què vas nèixer.");
        System.out.print("\n");
        System.out.print("Gener\tFebrer\tMarc\n");
        System.out.print("Abril\tMaig\tJuny\n");
        System.out.print("Juliol\tAgost\tSetembre\n");
        System.out.print("Octubre\tNovembre\tDesembre");
        System.out.print("\n\n");
    }

    public void triaNom(){
        //Escull Nom
        boolean correcte = false;
        System.out.print("Com et dius?\n");
        while (!correcte) {
            if (!sc.hasNextDouble()){
                nomEscullit = sc.nextLine();
                correcte = true;
            }
            else {
                System.out.println("No es un nom, prova un altre cop!");
                sc.nextLine();
            }
        }
    }

    public void triaAnys() {
        //Escull anys
        System.out.print("\n");
        System.out.print("Per acabar, quants anys tens?\n");
        boolean correcte = false;
        while (!correcte) {
            if (sc.hasNextInt()){
                edat = sc.nextInt();
                correcte = true;
            }
            else {
                System.out.println("No m'has posat un edat!");
                sc.nextLine();
            }
        }
    }

    public void opcioMes() {
        //Escull el mes i calcula les variables
        double numSort = 0;
        String equipFutbol = "";
        String llenguatgeProgramacio = "";
        String mesNaixement =  sc.nextLine();
        triaNom();
        triaAnys();
        if (mesNaixement.equalsIgnoreCase("Gener")) {
            numSort = edat * 3/2;
            equipFutbol = "Bayern de Munich";
            llenguatgeProgramacio = "C++";
        }
        else if (mesNaixement.equalsIgnoreCase("Febrer")){
            numSort = edat - 4;
            equipFutbol = "Atlético de Madrid";
            llenguatgeProgramacio = "Python";
        }
        else if (mesNaixement.equalsIgnoreCase("marc")){
            numSort = edat / 2;
            equipFutbol = "Chelsea";
            llenguatgeProgramacio = "JavaScript";
        }
        else if (mesNaixement.equalsIgnoreCase("Abril")){
            numSort = edat % 4;
            equipFutbol = "Manchester city";
            llenguatgeProgramacio = "Node.js";
        }
        else if (mesNaixement.equalsIgnoreCase("Maig")){
            numSort = edat * 3/6;
            equipFutbol = "Liverpool";
            llenguatgeProgramacio = "React";
        }
        else if (mesNaixement.equalsIgnoreCase("Juny")){
            numSort = edat + edat;
            equipFutbol = "Real Madrid";
            llenguatgeProgramacio = "C#";
        }
        else if (mesNaixement.equalsIgnoreCase("Juliol")){
            numSort = edat * edat / 5;
            equipFutbol = "BVB";
            llenguatgeProgramacio = "Swift";
        }
        else if (mesNaixement.equalsIgnoreCase("Agost")){
            numSort = edat * 1/2 * edat;
            equipFutbol = "FCB";
            llenguatgeProgramacio = "Java";
        }
        else if (mesNaixement.equalsIgnoreCase("Setembre")){
            numSort = edat / edat;
            equipFutbol = "Juve";
            llenguatgeProgramacio = "PHP";
        }
        else if (mesNaixement.equalsIgnoreCase("Octubre")){
            numSort = edat * 4 / 3;
            equipFutbol = "PSG";
            llenguatgeProgramacio = "R";
        }
        else if (mesNaixement.equalsIgnoreCase("Novembre")){
            numSort = edat % 2 + 23;
            equipFutbol = "Sevilla CF";
            llenguatgeProgramacio = "Go";
        }
        else if (mesNaixement.equalsIgnoreCase("Desembre")){
            numSort = (edat + edat) / 2;
            equipFutbol = "Manchester United";
            llenguatgeProgramacio = "Ruby";
        }
        else {
            numSort = 0;
            equipFutbol = "no tinc equip de fútbol perquè m'he equivocat escrivint el meu mes d'aniversari";
            llenguatgeProgramacio = "no tinc llenguatge de programació preferit perquè m'he equivocat escrivint el meu mes d'aniversari";
            System.out.print("No he entès el que m'has dit!!!!!!!!!!!!\n\n");
        }
        mostraMissatgeFinal(numSort, equipFutbol, llenguatgeProgramacio);
    }
    public void mostraMissatgeFinal(double numSort, String equipFutbol, String llenguatgeProgramacio) {
        //Missatge final amb les variables
        System.out.print("------------------------------------------------\n");

        System.out.print("Un plaer conèixer-te " + nomEscullit + ". Amb les dades que m'has donat, mira què he arribat a saber de tu... \n");
        System.out.print("\n\n");

        System.out.print(">>> El teu número de la sort és el " + numSort + "!");
        System.out.print("\n\n");

        System.out.print(">>> El teu equip de fútbol preferit, encara que no ho diguis en veu alta, és el " + equipFutbol + ".");
        System.out.print("\n\n");

        System.out.print(">>> El teu llenguatge de programació més estimat serà " + llenguatgeProgramacio + "!");
        System.out.print("\n\n");

        System.out.print("Torna quan vulguis!\n");
        System.out.print("------------------------------------------------\n\n\n");

    }
}
