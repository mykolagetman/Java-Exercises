import java.util.*;
public class Ejercicio11A2019 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    double numero;
    //double numero1;
    //double numero2;
    
    System.out.print("Introduce un numero y te mostrare  el cuadrado y el cubo: ");
    numero = x.nextDouble();
    x.close();

    for (double i = numero; i < numero + 5; i++) {
      double numero1 = Math.pow(i, 2);
      double numero2 = Math.pow(i, 3);
      
      
      //System.out.printf("|Numero: %.2f |Cuadrado: %2.f |\n", i, numero1, numero2);
     }
    }
  }

