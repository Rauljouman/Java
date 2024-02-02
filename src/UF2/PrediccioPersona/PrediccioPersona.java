package UF2.PrediccioPersona;

import java.util.Scanner;
    public class PrediccioPersona {

        private Scanner sc = new Scanner(System.in);
        private String mesNaixement = "";

        public static void main(String[] args) {
            PrediccioPersona programa = new PrediccioPersona();
            programa.inici();
        }

        public void inici() {
            preguntaYResposta();
            triaNom();
            triaEdat(mesNaixement);
        }

        public void preguntaYResposta() {
            //Mostra missatge per escullir mes i amb la resposta
            System.out.print("Escriu el mes en què vas nèixer.");
            System.out.print("\n");
            System.out.print("Gener\tFebrer\tMarc\n");
            System.out.print("Abril\tMaig\tJuny\n");
            System.out.print("Juliol\tAgost\tSetembre\n");
            System.out.print("Octubre\tNovembre\tDesembre");
            System.out.print("\n\n");
            mesNaixement = sc.nextLine();
            seleccioEquip(mesNaixement);
            seleccioLlenguante(mesNaixement);
        }

        public String triaNom() {
            //Escull Nom
            String nomEscullit = " ";
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
            return nomEscullit;
        }

        public int triaEdat(String mesNaixement){
            //Escull anys
            System.out.print("\n");
            System.out.print("Per acabar, quants anys tens?\n");
            int edat = 0;
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
            seleccioNumSort(edat, mesNaixement);
            return edat;
        }

        public String seleccioEquip(String mesNaixement){
            String equipFutbol = "";
            if (mesNaixement.equalsIgnoreCase("Gener")) {
                equipFutbol = "Bayern de Munich";
            }
            else if (mesNaixement.equalsIgnoreCase("Febrer")){
                equipFutbol = "Atlético de Madrid";
            }
            else if (mesNaixement.equalsIgnoreCase("marc")){
                equipFutbol = "Chelsea";
            }
            else if (mesNaixement.equalsIgnoreCase("Abril")){
                equipFutbol = "Manchester city";
            }
            else if (mesNaixement.equalsIgnoreCase("Maig")){
                equipFutbol = "Liverpool";
            }
            else if (mesNaixement.equalsIgnoreCase("Juny")){
                equipFutbol = "Real Madrid";
            }
            else if (mesNaixement.equalsIgnoreCase("Juliol")){
                equipFutbol = "BVB";
            }
            else if (mesNaixement.equalsIgnoreCase("Agost")){
                equipFutbol = "FCB";

            }
            else if (mesNaixement.equalsIgnoreCase("Setembre")){
                equipFutbol = "Juve";
            }
            else if (mesNaixement.equalsIgnoreCase("Octubre")){
                equipFutbol = "PSG";

            }
            else if (mesNaixement.equalsIgnoreCase("Novembre")){
                equipFutbol = "Sevilla CF";
            }
            else if (mesNaixement.equalsIgnoreCase("Desembre")){
                equipFutbol = "Manchester United";
            }
            else {
                equipFutbol = "no tinc equip de fútbol perquè m'he equivocat escrivint el meu mes d'aniversari";
            }
            return equipFutbol;
        }

        public String seleccioLlenguante(String mesNaixement) {
            String llenguatgeProgramacio = "";
            if (mesNaixement.equalsIgnoreCase("Gener")) {
                llenguatgeProgramacio = "C++";
            } else if (mesNaixement.equalsIgnoreCase("Febrer")) {
                llenguatgeProgramacio = "Python";
            } else if (mesNaixement.equalsIgnoreCase("marc")) {
                llenguatgeProgramacio = "JavaScript";
            } else if (mesNaixement.equalsIgnoreCase("Abril")) {
                llenguatgeProgramacio = "Node.js";
            } else if (mesNaixement.equalsIgnoreCase("Maig")) {
                llenguatgeProgramacio = "React";
            } else if (mesNaixement.equalsIgnoreCase("Juny")) {
                llenguatgeProgramacio = "C#";
            } else if (mesNaixement.equalsIgnoreCase("Juliol")) {
                llenguatgeProgramacio = "Swift";
            } else if (mesNaixement.equalsIgnoreCase("Agost")) {
                llenguatgeProgramacio = "Java";
            } else if (mesNaixement.equalsIgnoreCase("Setembre")) {
                llenguatgeProgramacio = "PHP";
            } else if (mesNaixement.equalsIgnoreCase("Octubre")) {
                llenguatgeProgramacio = "R";
            } else if (mesNaixement.equalsIgnoreCase("Novembre")) {
                llenguatgeProgramacio = "Go";
            } else if (mesNaixement.equalsIgnoreCase("Desembre")) {
                llenguatgeProgramacio = "Ruby";
            } else {
                llenguatgeProgramacio = "no tinc llenguatge de programació preferit perquè m'he equivocat escrivint el meu mes d'aniversari";
                System.out.print("No he entès el que m'has dit!!!!!!!!!!!!\n\n");
            }
            return llenguatgeProgramacio;
        }

        public double seleccioNumSort(int edat, String mesNaixement) {
            double numSort = 0;
            if (mesNaixement.equalsIgnoreCase("Gener")) {
                numSort = edat * 3/2;
            }
            else if (mesNaixement.equalsIgnoreCase("Febrer")){
                numSort = edat - 4;
            }
            else if (mesNaixement.equalsIgnoreCase("marc")){
                numSort = edat / 2;
            }
            else if (mesNaixement.equalsIgnoreCase("Abril")){
                numSort = edat % 4;
            }
            else if (mesNaixement.equalsIgnoreCase("Maig")){
                numSort = edat * 3/6;
            }
            else if (mesNaixement.equalsIgnoreCase("Juny")){
                numSort = edat + edat;
            }
            else if (mesNaixement.equalsIgnoreCase("Juliol")){
                numSort = edat * edat / 5;
            }
            else if (mesNaixement.equalsIgnoreCase("Agost")){
                numSort = edat * 1/2 * edat;
            }
            else if (mesNaixement.equalsIgnoreCase("Setembre")){
                numSort = edat / edat;
            }
            else if (mesNaixement.equalsIgnoreCase("Octubre")){
                numSort = edat * 4 / 3;
            }
            else if (mesNaixement.equalsIgnoreCase("Novembre")){
                numSort = edat % 2 + 23;
            }
            else if (mesNaixement.equalsIgnoreCase("Desembre")){
                numSort = (edat + edat) / 2;
            }
            else {
                numSort = 0;
                System.out.print("No he entès el que m'has dit!!!!!!!!!!!!\n\n");
            }
            return numSort;
        }

        public void mostraMissatgeFinal(String nomEscullit, double numSort, String equipFutbol, String llenguatgeProgramacio) {
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
