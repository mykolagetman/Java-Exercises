public class ForEach {
  public static void main(String args[]) {
    
    double[] nota = new double[4];
    
    System.out.println("Necesito la nota de cada uno de tus examenes.");
    
    for (int i=0; i<4; i++) {
      System.out.print("La nota del examen numero" + (i+1) +": ");
      nota[i] = Double.parseDouble(System.console().readLine());
    }
    
    System.out.println("Tus notas son: ");
    
    double suma = 0;
    
    for (double n:nota) { 
      System.out.print(n+" ");
      suma +=n;
    }
    System.out.println("\nLa media es" +suma/4);
  }
}
