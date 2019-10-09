import java.util.Scanner;
public class Ejercicio7 {
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
    
    if ( media < 5 ) {
      System.out.print("Tu nota de boletin es insuficiente");
    }
    if ( media == 5 ) {
      System.out.print("Tienes un suficiente en el boletin");
    }
    if ( media == 6 ) {
      System.out.print("Tienes un bien en el boletin");
    }
    if (( media >= 7 ) && ( media <= 8 )) {
      System.out.print("Tienes un notable en el boletin");
    }
    if (( media >= 9 ) && ( media <= 10 )) {
      System.out.print("Tienes un sobresaliente en el boletin");
    }
  }
}
