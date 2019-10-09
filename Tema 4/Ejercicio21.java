import java.util.Scanner;
public class Ejercicio21 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int nota1;
    int nota2;
    int media;
    String notaRecuperacion;
    
    System.out.print("Que has sacado en el primer examen?: ");
    nota1 = x.nextInt();
    System.out.print("Ahora en el segundo examen: ");
    nota2 = x.nextInt();
    x.nextLine();
    
    media = (nota1 + nota2) / 2;
    
    if (media >= 5) {
      System.out.println("Tu nota media es: " + media );
    } else {
      System.out.println("Tienes que hacer el examen de recuperacion.");
      
      System.out.print("Que has sacado en la recuperacion (apto / no apto)?: ");
      notaRecuperacion = x.nextLine();
      
      if (notaRecuperacion.equals("apto")) {
        System.out.println("Bien, tu nota media es 5");
      } else {
        System.out.println("Mal, mantienes tu nota media de: " + media );
      
     }
    }
  }
}
    
