import java.util.Scanner;
public class Ejercicio24T5 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int filas = 0;
    int altura = 0;
    int espacios = filas - 1;
    int i = 0;
    
    System.out.println("Vaya introduciendo numeros y le hare una piramide de numeros.");
    
    System.out.print("Introduce el numero de filas: ");
    filas = x.nextInt();
    
    while (altura < filas){
      
      for(i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      
      for (i = 1; i <= (altura + 1); i++) {
        System.out.print(i);
      }
      
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      altura++;
      espacios--;
    }
  }
}
