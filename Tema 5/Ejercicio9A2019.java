import java.util.Scanner;
public class Ejercicio9A2019 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int numero = 0;
    int numeroIntroducido = 0;
    int suma = 0;
    int media = 0;
    //int i = -1;
    
    
    while (numeroIntroducido >= 0){
      System.out.print("Introduce un numero y te dire la media: ");
      numeroIntroducido = x.nextInt();
      numero++;
      suma += numeroIntroducido;
      media = (suma - numeroIntroducido) / (numero - 1);
      
    } 
    System.out.println("La media de estos numeros es " + media);
  }
}
