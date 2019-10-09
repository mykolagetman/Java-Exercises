import java.util.Scanner;
public class E11t4 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    System.out.print("Dime una hora: ");
    double hora = x.nextDouble();
    
    System.out.print("Dime los minutos: ");
    double minutos = x.nextDouble();
    
        
    double tiempo = (24 - hora) * 3200 + (60 - minutos) * 60;
    
    System.out.println("Quedan " + tiempo + " segundos para la media noche.");
    
  }
}
