import java.util.Scanner;
public class Ejercicio25 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int altura;
    int anchura;
    String escudo;
    int bandera;
    double precioBandera;
    double precioEscudo;
    double gastosEnvio = 3.25;
    double total;
    
    System.out.print("Introduzca la altura de la bandera en cm: ");
    altura = x.nextInt();
    x.nextLine();
    System.out.print("Ahora introduce la anchura: ");
    anchura = x.nextInt();
    x.nextLine();
    System.out.print("Quiere el escudo bordado?(si/no): ");
    escudo = x.nextLine();
    
    bandera = anchura * altura;
    precioBandera = 0.01 * bandera;
    
    if (escudo.equals("si")) {
      precioEscudo = 2.50;
    } else {
      precioEscudo = 0.00;
    } 
    
    total = precioBandera + precioEscudo + gastosEnvio;
    
    switch (escudo) {
      case "si":
      System.out.println("Aqui tiene el desglose de su compra.");
      System.out.printf("Bandera de %3d cm2: %14.2f$ \n", bandera, precioBandera);
      System.out.printf("Con escudo: %22.2f$ \n", precioEscudo);
      System.out.printf("Gastos de envio: %17.2f$ \n", gastosEnvio);
      System.out.printf("Total: %27.2f$ \n", total);
      break;
      
      case "no":
      System.out.println("Aqui tiene el desglose de su compra.");
      System.out.printf("Bandera de %3d cm2: %14.2f$ \n", bandera, precioBandera);
      System.out.printf("Sin escudo: %22.2f$ \n", precioEscudo);
      System.out.printf("Gastos de envio: %17.2f$ \n", gastosEnvio);
      System.out.printf("Total: %27.2f$ \n", total);
      break;
      default:
    }
  }
}
      
      
