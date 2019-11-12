import java.util.Scanner;
public class Ejercicio21T5 {
  public static void main(String args[]){
    Scanner x = new Scanner(System.in);
    
    int numero = 0;
    int contador = 0;
    int mayorPar = 0;
    int contadorImpares = 0;
    int sumaImpares = 0;
    double media = 0;
    
    do {
      System.out.print("Introduce un numero: ");
      numero = x.nextInt();
      x.nextLine();
      contador++;
      } while (numero > 0);
      
      media = sumaImpares / contadorImpares;
      
       
       if (numero < 0) {
         System.out.println("Has introducido un numero negativo.");
         System.out.println("Has introducido " + contador + " numeros positivos");
       }
       else if (numero % 2 == 0 && numero > mayorPar) {
         mayorPar = numero;
         contador++;
         System.out.println("El mayor de los pares es " + mayorPar);
       } else {
         sumaImpares += numero;
         contadorImpares++;
         contador++;
         System.out.println("La media de los impares es " + media);
       }
     
       
         
       
       
       //media = sumaImpares / contadorImpares;
       //System.out.println("Has introducido " + contador + " numeros positivos");
       //System.out.println("La media de los impares es " + media);
       //System.out.println("El mayor de los pares es " + mayorPar);
      }
      }
    
    
  

