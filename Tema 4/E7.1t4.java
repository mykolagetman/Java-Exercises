import java.util.Scanner;
public class E7.1t4 {
  public static void main (String args[]) {
    Scanner x = new Scanner(System.in);
    
    System.out.println("Vamos a calcular la media de 3 notas");
    
    System.out.print("Ingresa la primera nota: ");
    double nota1 = x.nextDouble();
    
    System.out.print("Ingresa la segunda nota: ");
    double nota2 = x.nextDouble();
    
    System.out.print("Ingresa la tercera nota: ");
    double nota3 = x.nextDouble();
    
    double media = (nota1 + nota2 + nota3) / 3;
    
    System.out.println("La nota media de tus notas es: " + media );
    
    String boletin ="";
    
    switch (media) {
      case 1:
      boletin = insuficiente;
      break;
      case 2:
      boletin = insuficiente;
      break;
      case 3:
      boletin = insuficiente;
      break;
      case 4:
      boletin = insuficiente;
      break;
      case 5:
      boletin = suficiente;
      break;
      case 6:
      boletin = bien;
      break;
      case 7:
      boletin = notable;
      break;
      case 8:
      boletin = notable;
      break;
      case 9:
      boletin = sobresaliente;
      break;
      case 10:
      boletin = sobresaliente;
      break;
      default:
    }
    System.out.print("Tu nota del boletin es: " + boletin );
      
  }
}
