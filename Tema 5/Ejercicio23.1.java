public class Ejercicio23.1 {
  public static void main(String args[]) {
    
    int numeroIntroducido;
    int suma = 0;
    int numeroDeElementos = 0;
    
    
    System.out.println("Introduce numeros: ");
    System.out.println("Esto terminara cuando el programa supero el numero \10000.");
    
    do {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      suma += numeroIntroducido;
      numeroDeElementos++;
    }while (suma <= 10000);
    
    System.out.println("Un total de " + numeroDeElementos + "numeros");
    System.out.println("La suma total es " + suma + ".");
    System.out.println("La media es " + suma / numerodeElementos + ".");
    
  }
}
    
    
