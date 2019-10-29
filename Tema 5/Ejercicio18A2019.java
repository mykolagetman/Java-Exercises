import java.util.Scanner;
public class Ejercicio18A2019 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int numero1;
    int numero2;
    int suma7 = 1;
    
    do {
    System.out.print("Introduce el primer numero: ");
    numero1 = x.nextInt();
    
    System.out.print("Introduce el segundo numero: ");
    numero2 = x.nextInt();
    x.nextLine();
    
    if (numero1 == numero2) {
      System.out.print("Error, los numeros no pueden ser iguales.");
    }
  } while (numero1 == numero2);
    
    
    if (numero1 > numero2) {
      System.out.println("Los numeros entre " + numero2 + " y " + numero1 + " son: " + suma7);
      for (int i = numero1; i < numero1; i +=7) {
        System.out.println(i);
      }
      } else {
        System.out.println("Los numeros entre " + numero1 + " y " + numero2 + " son: " + suma7);
      for (int i = numero2; i < numero2; i +=7) {
        System.out.println(i);
      }
    }
  }
}
