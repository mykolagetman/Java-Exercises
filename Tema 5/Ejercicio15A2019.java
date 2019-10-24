import java.util.Scanner;
public class Ejercicio15A2019 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int base;
    int exponente;
    int potencia = 1;
    
    System.out.print("Introduce la base: ");
    base = x.nextInt();
    
    System.out.print("Introduce el exponente: ");
    exponente = x.nextInt();
    
    for (int i = 1; i <= exponente; i++) {
      potencia = base * potencia;
      System.out.println(base + " ^ " + i + " = " + potencia);
    }
  }
}
