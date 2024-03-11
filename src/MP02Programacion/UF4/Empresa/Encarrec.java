package MP02Programacion.UF4.Empresa;

public class Encarrec {
    private int dia = 0;
    private int mes = 0;
    private int hora = 0;
    private int minuts = 0;

    public Encarrec() {
    }

    public Encarrec(int diaEncarrec) {
        dia= diaEncarrec;
    }

    public Encarrec(int mesEncarrec, int horaEncarrec) {
        mes= mesEncarrec;
        hora = horaEncarrec;
    }

    public Encarrec(int mesEncarrec, int horaEncarrec,int minutsEncarrec) {
        mes= mesEncarrec;
        hora = horaEncarrec;
        minuts = minutsEncarrec;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuts() {
        return minuts;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void afegirProducte(Peticio p) {

    }

    public void eliminarProducte(Peticio p) {

    }
}
