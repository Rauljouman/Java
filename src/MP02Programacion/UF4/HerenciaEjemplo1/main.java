package MP02Programacion.UF4.HerenciaEjemplo1;

public class main {
   public static void main (String[] args) {
      Arona a1 = new Arona();
      a1.setKm(180);
      a1.setColor("Vermell");
      a1.setModel("Panda");
      a1.visualizer();
      Arona a2 = new Arona();
      a2.setKm(160);
      a2.setModel("Ibiza");
      a2.setColor("Negre");
      a2.visualizer();
      Arona a3 = new Arona (160, "Blanco");
      Seat s1 = new Seat ("Ibiza FR");
}
}
