import java.util.Scanner;
public class Ejercicio8A2019 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int numero;
    
    System.out.print("Introduce un numero y te mostrare su tabla de multiplicar: ");
    numero = x.nextInt();
    
    for (int i = 1; i < 11; i++) {
      System.out.println(numero * i);
    }
  }
}
    
    
      
