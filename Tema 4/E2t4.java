import java.util.Scanner;
  public class E2t4 {
    public static void main(String args[]) {
      Scanner x = new Scanner(System.in);
      
      System.out.print("Dime una hora del dia desde las 6 de la manana hasta las 5 de la manana: ");
      int dia = x.nextInt();
      
      if (( dia >= 6 ) && ( dia <= 12 )) {
        System.out.print("Buenos dias");
      }
      if (( dia >= 13 ) && ( dia <= 20 )) {
        System.out.print("Buenas tardes");
      }
      if (( dia >= 21 ) && ( dia <= 24)) {
        System.out.print("Buenas noches");
      }
      if (( dia >= 0 ) && ( dia <= 5)) {
        System.out.print("Buenas noches");
      }
    }
  }
