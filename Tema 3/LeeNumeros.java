import java.util.Scanner;

public class LeeNumeros {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Mi nombre: ");
    String nombre = s.nextLine();
    
    System.out.print("Mi edad: ");
    int edad = Integer.parseInt(s.nextLine());
    
    System.out.println("Tu nombre es " +nombre+ " y tu edad es " +edad);
    
  }
}
    
    
    
    
