import java.util.Scanner;
public class Ejercicio21T5 {
  public static void main(String args[]){
    Scanner x = new Scanner(System.in);
    
    int numero;
    int contador = 0;
    
    do {
      System.out.print("Introduce un numero: ");
      numero = x.nextInt();
      contador++;
      } while (numero > 0);
       
       if (numero < 0) {
         contador--;
         System.out.println("Has introducido un numero negativo.");
         System.out.print("Has introducido " + contador + " numeros positivos");
       }
      
      }
    }
  

