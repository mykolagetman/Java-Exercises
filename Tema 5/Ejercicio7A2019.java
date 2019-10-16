import java.util.Scanner;
public class Ejercicio7A2019 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int combinacion;
    int intento;
    
    System.out.println("Este es un control para abrir la caja fuerte");
    
    for (int i = 1; i < 5; i++) {
    System.out.print("Introduce la combinacion de 4 cifras para abrirla: ");
    combinacion = x.nextInt();
    
    intento = 4 - i;
    
    if (combinacion == 3456) {
      i = 5;
      System.out.println("Esa es la combinacion.");
    } else {
      System.out.println("Esa no es la combinacion te quedan " + intento + " intentos");
    }
      
      if (intento == 0) {
        System.out.println("No tienes mas intentos");
      }
    }
  }
}
     
        
