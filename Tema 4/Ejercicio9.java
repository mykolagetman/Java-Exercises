import java.util.Scanner;
public class Ejercicio9 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    System.out.println("Vamos a resolver una ecuacion de segundo grado");
    
    System.out.println("Introduce el valor de a: ");
    int a = x.nextInt();
    System.out.println("Ahora introduce el valor de b: ");
    int b = x.nextInt();
    System.out.println("Introdcue el valor de x: ");
    int c = x.nextInt();
    
    int operacion = (a * c) / b;
    
    
    if (( a == 0 ) || ( b == 0 )) {
      System.out.print("No hay solucion");
    } else {
      System.out.print("El resultado es:  " + operacion );
    }
      
    
  }
}
