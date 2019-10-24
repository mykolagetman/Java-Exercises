import java.util.Scanner;
public class Ejercicio12T5A2019 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int numero;
    int i = 0;
    int positivo = 0;
    int negativo = 0;
    
    System.out.println("Introduce 10 numeros y te dire cuales sn negativos y positivos: ");
        
        while (i < 10) {
          System.out.print("Introduce un numero: ");
          numero = x.nextInt();
          i++;
          
          if (numero >= 0) {
            positivo++;
            
          } else {
            negativo++;
          }
        }
          
          System.out.println("Has introducido " + positivo + " numeros positivos y " + negativo + " numeros negativos");
          
    }
  }

    
    
