public class E2 {
  public static void main(String args []) {
    
    String cantidad;
    double euros;
    
    System.out.print("Que cantidad de euros quieres convertir a pesetas: ");
    cantidad = System.console().readLine();
    euros = Double.parseDouble( cantidad );
    
    double pesetas = (euros * 166.386);
    
    System.out.print(euros + " euros a pesetas son " + pesetas + " pesetas ");
    
  }
}
    
    
