import java.util.Scanner;
public class Ejercicio3 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    System.out.print("Escribe un numero del 1 al 7: ");
    int numero = x.nextInt();
    
    String dia = "";
    
    switch (numero) {
      case 1:
      dia = "lunes";
      break;
      case 2:
      dia = "martes";
      break;
      case 3:
      dia = "miercoles";
      break;
      case 4:
      dia = "jueves";
      break;
      case 5:
      dia = "viernes";
      break;
      case 6:
      dia = "sabado";
      break;
      case 7:
      dia = "domingo";
      break;
      default:
    }
    System.out.println("Has elegido " + dia );
  }
}
      
