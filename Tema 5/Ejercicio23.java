public class Ejercicio23 {
  public static void main(String args[]) {
    
    int contador = 0;
    int numero = 0;
    int suma = 0;
    int media = 0;
    
    System.out.println("Escribe una serie de numeros.");
    System.out.println("Esto terminara cuando supere el numero 10000.");
    
    do{
      System.out.println("Ahora,dime numeros: ");
      numero = Integer.parseInt(System.console().readLine());
      suma = suma+numero;
      contador++;
    }while (suma<=10000);
    media = suma/contador;
    System.out.println("has introducido "+contador+" numeros.");
    System.out.println("la suma de estos numeros es " +suma);
    System.out.println("y la media de estos numeros es "+media);
  }
}
