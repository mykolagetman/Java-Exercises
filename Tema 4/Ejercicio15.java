import java.util.Scanner;
public class Ejercicio15 {
  public static void main(String args[]) {
  Scanner x = new Scanner(System.in);
  
  String caracter;
  String vertice;
  
  System.out.print("Introduce un caracter(letra, numero, simbolo): ");
  caracter = x.nextLine();
  System.out.print("Introduce el vertice de la piramide(arriba, abajo, izquierda, derecha): ");
  vertice = x.nextLine();
  
  System.out.println("Has introducido un " + caracter);
  System.out.println("El vertice esta hacia " + vertice);
  System.out.println("Esta es la piramide");
  
  if (vertice.equals("arriba")) {
    System.out.println("  " + caracter);
    System.out.println(" " + caracter + caracter + caracter);
    System.out.println("" + caracter + caracter + caracter + caracter + caracter);
  }
  
  if (vertice.equals("abajo")) {
    System.out.println("" + caracter + caracter + caracter + caracter + caracter);
    System.out.println(" " + caracter + caracter + caracter);
    System.out.println("  " + caracter);
  }
  
  if (vertice.equals("derecha")) {
    System.out.println("  " + caracter);
    System.out.println("" + caracter + caracter + caracter + caracter + caracter);
    System.out.println(" " + caracter + caracter + caracter);
  }
  
  if (vertice.equals("izquierda")) {
    
  }
 }
}
  
 
  
