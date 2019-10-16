import java.util.Scanner;
public class Ejercicio7B2019 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int combinacion;
    int intento = 4;
    
    System.out.println("Este es un control para abrir la caja fuerte");
    
    do {
    System.out.print("Introduce la combinacion de 4 cifras para abrirla: ");
    combinacion = x.nextInt();
    
    if (combinacion == 3456) {
      System.out.println("Esa es la combinacion.");
      intento = -1;
    } else {
      System.out.println("Esa no es la combinacion te quedan " + intento + " intentos");
      intento--;
    }
      
      } while (intento > 0);
      if (intento == 0) {
        System.out.println("No tienes mas intentos");
      }
    }
  }



  
