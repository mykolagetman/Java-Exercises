import java.util.Scanner;
public class Ejercicio25T5 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int numero;
    int invertido;
    
    System.out.println("Dime un numero y te lo mostrare al reves.");
    
    System.out.print("Dime un numero: ");
    numero = x.nextInt();
    
    System.out.println("\nEl numero invertido es: ");
    
    while (numero > 0) {
      invertido = numero % 10;
      numero = numero / 10;
      System.out.print(invertido);
    }
  }
}
