public class E4 {
  public static void main(String args []) {
    
    String numero;
    int primerNumero;
    int segundoNumero;
    
    System.out.print("El primer numero es: ");
    numero = System.console().readLine();
    primerNumero = Integer.parseInt( numero );
    
    System.out.print("El segundo numero es: ");
    numero = System.console().readLine();
    segundoNumero = Integer.parseInt( numero );
    
    double suma = primerNumero + segundoNumero;
    System.out.println("La suma de los numeros es: " + suma);
    
    double resta = primerNumero - segundoNumero;
    System.out.println("La resta de los numeros es: " + resta);
    
    double multiplicacion = primerNumero * segundoNumero;
    System.out.println("La multiplicacin de los numeros es: " + multiplicacion);
    
    double division = primerNumero / segundoNumero;
    System.out.println("La division de los numeros es: " + division);
    
  }
}
    
