import java.util.Scanner;
public class Ejercicio41T5 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int numero;
    //int aux;
    int digito = 0;
    int par = 0;
    int impar = 0;
    
    System.out.print("Introduce un numero entero: ");
    numero = x.nextInt();
    x.nextLine();
    
    //aux = numero;
    
    while(numero > 0) {
      digito = numero % 10;
      numero = numero / 10;
      
      if (digito % 2 == 0) {
        par++;
      } else {
        impar++;
      }
    }
    System.out.println("El " + numero + " contiene " + par + " digitos pares y " + impar + " digitos impares");
  }
}
