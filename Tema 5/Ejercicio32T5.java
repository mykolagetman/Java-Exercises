import java.util.Scanner;
public class Ejercicio32T5 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    long suma = 0;
    long digito = 0;
    long numero = 0;
    long i = 0;
    
    System.out.print("Introduce un numero: ");
    numero = x.nextInt();
    
    for (i = 1; i < numero; i = i * 10){
      }
      
    i = i / 10;
    
    do {
      digito = numero / i;
      
      if ((digito % 2) == 0){
      System.out.print(digito +" ");
      suma = suma + digito;
       }
       
      numero = numero -(digito * i);
      i = i / 10;
      
    } while (i > 0);
    System.out.println("");
    System.out.println("la suma de estos numeros es: "+suma);
	}
}
    
