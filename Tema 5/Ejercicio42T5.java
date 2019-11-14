import java.util.Scanner;
public class Ejercicio42T5 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int numero;
    int primo = 0;
    
    
    System.out.println("Pido un numero y te muestro 5 mas.");
    
    System.out.print("Introduce un numero: ");
    numero = x.nextInt();
    
    for (int i = numero; i < numero + 5; i++) {
      for(int j = 1; j <= numero; j++) {
        
        if (numero % j == 0) {
          primo++;
        }
      }
      
      if (primo == 2) {
        System.out.println(i + " es primo");
      } else {
        System.out.println(i + " no es primo");
      }
    }
  }
}
