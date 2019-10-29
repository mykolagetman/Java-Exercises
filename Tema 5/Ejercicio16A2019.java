import java.util.Scanner;
public class Ejercicio16A2019 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int numero;
    int suma;
    
    System.out.print("Introduce un numero y te sumare 100 numeros: ");
    numero = x.nextInt();
    
    for (int i = 1; i <= 100; i++) {
      suma = numero + i;
      System.out.println("El resultado es " + suma);
    }
  }
}

