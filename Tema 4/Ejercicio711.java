import java.util.Scanner;
public class Ejercicio711 {
  public static void main (String args[]) {
    Scanner x = new Scanner(System.in);
    
    System.out.println("Vamos a calcular la media de 3 notas");
    
    System.out.print("Ingresa la primera nota: ");
    int nota1 = x.nextInt();
    
    System.out.print("Ingresa la segunda nota: ");
    int nota2 = x.nextInt();
    
    System.out.print("Ingresa la tercera nota: ");
    int nota3 = x.nextInt();
    
    int media = (nota1 + nota2 + nota3) / 3;
    
    System.out.println("La nota media de tus notas es: " + media );
    
    String boletin ="";
    
    switch (media) {
      case 1:
      boletin = "insuficiente";
      break;
      case 2:
      boletin = "insuficiente";
      break;
      case 3:
      boletin = "insuficiente";
      break;
      case 4:
      boletin = "insuficiente";
      break;
      case 5:
      boletin = "suficiente";
      break;
      case 6:
      boletin = "bien";
      break;
      case 7:
      boletin = "notable";
      break;
      case 8:
      boletin = "notable";
      break;
      case 9:
      boletin = "sobresaliente";
      break;
      case 10:
      boletin = "sobresaliente";
      break;
      default:
    }
    System.out.print("Tu nota del boletin es: " + boletin );
      
  }
}
