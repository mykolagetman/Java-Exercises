public class E5 {
  public static void main (String args []) {
    
    double base;
    double altura;
    double area;
    String numero;
    
    System.out.print("Introduce cuanto mide la base: ");
    numero = System.console().readLine();
    base = Double.parseDouble( numero );
    
    System.out.print("Introduce cuanto mide la altura: ");
    numero = System.console().readLine();
    altura = Double.parseDouble( numero );
    
    area = base * altura / 2;
    
    System.out.print("El area del triangulo es: " + area);
    
  }
}
    
    
    
    
    
