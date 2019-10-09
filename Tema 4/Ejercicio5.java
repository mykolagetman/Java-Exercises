import java.util.Scanner;
public class Ejercicio5 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    
    System.out.println("Introduce el valor de a: ");
    int a = x.nextInt();
    System.out.println("Ahora introduce el valor de b: ");
    int b = x.nextInt();
    
    int operacion = -b/a;
    
    
    if (( a == 0 ) || ( b == 0 )) {
      System.out.print("No hay solucion");
    } else {
      System.out.print("x = " + operacion );
    }
      
    
  }
}
