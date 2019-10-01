import java.util.Scanner;
public class E4t4 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    System.out.print("Introduce las horas que trabaja a la semana: ");
    int horas = x.nextInt();
    
    int salarioSemanal;
    
    if (horas <= 40) {
      salarioSemanal = horas * 12;
    } else {
      salarioSemanal = (40 * 12) + ((horas - 40) * 16);
    }
    System.out.println("A la semana cobra " + salarioSemanal);
      

  
  }
}
