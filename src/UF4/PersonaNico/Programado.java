
package UF4.PersonaNico;

public class Programado extends Esclavo {

    public Programado(String nombre, String direc, double salario, String puesto) {
        super(nombre, direc, salario, puesto);

    }

    public void debug() {

        System.out.println("Programmer " + getNombre() + " is debugging code in C++"  );
    }
    @Override
    public double calcularBonus() {
        double bonus = getSalario() * 0.12;
        imprimirBonus(bonus);
        return bonus;
    }
    @Override
    public String generarReporte(){
        String reporte = "excelent";
        imprimirRep(reporte);
        return reporte;
    }
}


