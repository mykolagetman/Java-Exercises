import java.util.Scanner;
public class Ejercicio13 {
  public static void main(String args[]){
    Scanner x = new Scanner(System.in);
    
    System.out.println("Ordenacion de numeros enteros.");
    
    System.out.print("Introduce el primer numero: ");
    int numero1 = x.nextInt();
    
    System.out.print("Introduce el segundo numero: ");
    int numero2 = x.nextInt();
    
    System.out.print("Introduce el tercer numero: ");
    int numero3 = x.nextInt();
    
    if ( numero1 < numero2 ) {
      numero1 += numero2; numero2 = numero1 - numero2; numero1 -= numero2;
    }
    if ( numero1 < numero2 ) {
        numero1 += numero3;  numero3 = numero1 - numero3;  numero1 -= numero3;
      }
      if ( numero2 < numero3 ) {
        numero2 += numero3;  numero3 = numero2 - numero3;  numero2 -= numero3;
      }
      System.out.printf("La orddenacion de los numeros es: " + numero3 + numero2 + numero1);
    }
  }
