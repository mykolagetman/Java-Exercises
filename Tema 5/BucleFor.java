public class BucleFor {
  public static void main(String args []) {
    int laVoluntad;
    
    System.out.print("Dime cunatos numeros quieres que te escriba: ");
    
    String s = System.console().readLine();
    
    laVoluntad = Integer.parseInt(s);
    
    for (int i=1; i <= laVoluntad; i++) {
      System.out.println(i);
    }
  }
}
