public class E1 {
  public static void main(String args[]) {
    
    String numero;
    int primerNumero;
    int segundoNumero;
    
    System.out.println("El primer numero es: ");
    numero = System.console().readLine();
    primerNumero = Integer.parseInt( numero );
    
    System.out.println("El segundo numero es: ");
    numero = System.console().readLine();
    segundoNumero = Integer.parseInt( numero );
    
    int multiplicacion = primerNumero * segundoNumero;
    
    System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
    
  }
}
    
