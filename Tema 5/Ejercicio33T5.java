import java.util.Scanner;
public class Ejercicio33T5 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int altura;
    
    System.out.print("Dime la altura de la U:");
    altura = x.nextInt();
    
    int lar = (altura/2)+1;
    for(int i=1;i<altura;i++){
      System.out.print("*");
      
      for (int j=1;j<=lar;j++){
        System.out.print(" ");
      }
      System.out.println("*");
    }
    System.out.print(" ");
      for (int j=1;j<=lar;j++){
        System.out.print("*");
      }
      System.out.println(" ");
 }
}
