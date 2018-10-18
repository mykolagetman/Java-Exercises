import java.util.Scanner; 

public class Ejercicio7T5a {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int numInt = 0;
    
    for (int i = 1; i < 5; i++) {
      System.out.print("Por favor, introduzca la combinacion para abrir la caja fuerte: ");
      int combinacion = Integer.parseInt( s.nextLine() );
      
      numInt = 4-i;
      
      if ( combinacion == 9898 ){
        i=5;
        System.out.println("La combinación es correcta, la caja se ha abierto");
      } else {
        
        System.out.println("La combinación es incorrecta, el número de intento que queda es: " + numInt);  
      }
    }
    
    if ( numInt == 0) {
      System.out.println("No tienes mas intentos");
    }
    
    
  }
}
