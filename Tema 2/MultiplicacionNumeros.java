import java.util.Scanner;

public class MultiplicacionNumeros {
  public static void main(String[] args) {
  int numero1;
  int numero2;
  int resultado;
  
  Scanner escanerEntrada = new Scanner(System.in);
  
  
  
  System.out.println("Introduzca el primer multiplo");
  numero1 = Integer.parseInt(escanerEntrada.nextLine());
  
  
  System.out.println("Introduzca el segundo multiplo");
  numero2 = Integer.parseInt(escanerEntrada.nextLine());
  
  resultado = numero1 * numero2;
  
  System.out.printf("%d * %d\n = %d\n" ,numero1,numero2,resultado);
  
  }
}
