import java.util.Scanner;
public class Ejercicio23T5 {
  public static void main(String args[]) {
    
    Scanner x = new Scanner(System.in);
    
    int numero;
    int contador = 0;
    int suma = 0;
    int media;
    
    do {
      System.out.print("Introduce un numero: ");
      numero = x.nextInt();
      contador++;
      suma = suma + numero;
      
      }while (suma <= 1000);
      media = suma / contador;
      
      System.out.println("El suma de todos los numeros es " + suma);
      System.out.println("La media de los numeros es " + media);
      System.out.println("Has introducido un total de " + contador + " numeros");
        
          
        }
      }
    
  
          
      
      
      
