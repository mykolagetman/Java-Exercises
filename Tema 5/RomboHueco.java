import java.util.Scanner;
public class RomboHueco {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int altura, blancosAntes, blancosEnmedio;
    
    System.out.println("Dibujo rombos huecos.");
    System.out.print("Dime la altura del rombo(impar mayor o igual a 3): ");
    
    do {
      altura = x.nextInt();
      if (!((altura % 2 == 1) &&  (altura >= 3))) {
        System.out.print("Incorrecto");
      }
    } while (!((altura % 2 == 1) &&  (altura >= 3)));
    
    //parte superior
    blancosAntes = altura / 2;
    blancosEnmedio = 0;
    for (int i = 0; i <(altura / 2 + 1); i++) {
      // blancos previos
      for (int j = 0; j < blancosAntes; j++) {
        System.out.print(".");
      }
      //pinto caracter
      System.out.print("*");
      
      blancosAntes--;
      blancosEnmedio = blancosEnmedio + 2;
    }
  }
}
    
