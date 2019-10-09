import java.util.Scanner;
public class Ejercicio6 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    System.out.println("Vamos a calcular el tiempo que tardara en caer un objeto desde una altura h");
    
    System.out.print("Indicame la altura: ");
    double altura = x.nextDouble();
    double g = 9.81;
    double numero = Math.sqrt(2 * altura/g);
    
    System.out.print("t = " + numero );
    }
  }

