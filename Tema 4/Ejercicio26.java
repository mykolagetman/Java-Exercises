import java.util.Scanner;
public class Ejercicio26 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int entrada;
    String dia;
    String tarjeta;
    double precioEntrada = 8;
    double descuento = 0; 
    double total = 0;
    double totalPagar = 0;
    
    System.out.print("Introduce el numero de entradas: ");
    entrada = x.nextInt();
    x.nextLine();
    System.out.print("Introduce el dia de la semana: ");
    dia = x.nextLine();
    System.out.print("Tiene la tarjeta Yelmo? (si/no): ");
    tarjeta = x.nextLine();
    
    if (dia.equals("miercoles")) {
      precioEntrada = 5;
    }
    
    if ((entrada == 2) && dia.equals("jueves")) {
      precioEntrada = 11;
    }
    
    if (tarjeta.equals("si")) {
      descuento = total * 10 / 100;
    }

    total = entrada * precioEntrada;
    totalPagar = total - descuento;
    
    switch (tarjeta) {
      case "si":
      System.out.println("Aqui estan sus entradas, gracias");
      System.out.printf("Numero de entradas %16.2s \n", entrada);
      System.out.printf("Precio por cada entrada %14.2f$ \n", precioEntrada);
      //System.out.printf("Precio total sin descuento %14.2f$ \n", total);
      System.out.printf("Descuento %28.2f$ \n", descuento);
      System.out.printf("Precio total con descuento %12.2f$ \n", totalPagar);
      break;
      
      case "no":
      System.out.println("Aqui estan sus entradas, gracias");
      System.out.printf("Numero de entradas %16.2s \n", entrada);
      System.out.printf("Precio por cada entrada %14.2f$ \n", precioEntrada);
      System.out.printf("Precio total sin descuento %12.2f$ \n", total);
    }
      
  }
}
      
    
    
