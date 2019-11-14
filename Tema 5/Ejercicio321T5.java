import java.util.Scanner;
public class Ejercicio321T5 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int numero;
    int digito = 0;
    int par = 0;
    int suma = 0;
    
    System.out.print("Introduce un numero entero positivo: ");
    numero = x.nextInt();
    
    do {
      digito = numero % 10;
      numero = numero / 10;
      
       if (digito % 2 == 0) {
        par++;
        System.out.print(digito + " ");
        suma = suma + digito;
      }
      
        } while (numero > 0);
        System.out.println(" ");
        System.out.println("Suma de los digitos pares: " +suma);
      
    }
  }
    
    
  
  
    
      
