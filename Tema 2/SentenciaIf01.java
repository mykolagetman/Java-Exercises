public class SentenciaIf01 {
  public static void main(String[] args) {
    System.out.print("¿Donde esta Malaga?");
    String respuesta = System.console().readLine();
    
    if (respuesta.equals("Espana")) {
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
      
    }
  }
}
