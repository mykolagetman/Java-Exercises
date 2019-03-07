public class E3 {
  public static void main(String args[]) {
    
    String cantidad;
    double pesetas;
    
    System.out.print("Que cantidad de pesetas a euros quieres convertir: ");
    cantidad = System.console().readLine();
    pesetas = Double.parseDouble( cantidad );
    
    double euros = pesetas / 166.386;
    
    System.out.print(pesetas + " pesetas son tantos " + euros + " euros ");
    
  }
}
