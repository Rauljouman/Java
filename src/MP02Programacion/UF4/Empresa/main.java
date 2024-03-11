package MP02Programacion.UF4.Empresa;

public class main {

    public static void main (String[] args) {
        //Instancies Sucursal
        Sucursal s = new Sucursal();
        Sucursal s1 = new Sucursal("Sucursal1", "651552271");
        Sucursal s2 = new Sucursal("Sucursal2", "651552272", "C/ Miraflores, 53");
        //Instancies Transportista
        Transportista t = new Transportista();
        Transportista t1 = new Transportista("Guada", "34553425");
        Transportista t2 = new Transportista("543566", 345);
        Transportista t3 = new Transportista("Toti", "651552200", 33953);
        //Instancies Encarrec
        Encarrec e = new Encarrec();
        Encarrec e1 = new Encarrec(3);
        Encarrec e2 = new Encarrec(5, 4);
        Encarrec e3 = new Encarrec(7, 3, 1);
        //Instancies Client
        Client c = new Client();
        Client c1 = new Client("Alberto", "C/ ardigon");
        Client c2 = new Client ("Romero", "54345543", "raul@gmail.com");
        //Instancies Peticio
        Peticio p = new Peticio ();
        Peticio p1 = new Peticio(53423);
        TipusProducte producte = new TipusProducte();
        TipusProducte producte1 = new TipusProducte("Palo", "4534", 4343, 423);
        TipusProducte producte2 = new TipusProducte("5D34F",3 ,435);
    }

}
