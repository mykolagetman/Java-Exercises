public class Ejercicio19 {
  public static void main (String args []) {
    int altura;
    String simbolo;
    
    System.out.print("Dame la altura de la piramide: ");
    altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Escribe el caracter al que la dibuje: ");
    simbolo = System.console().readLine();
    
    //bucle para pintar cada linea
    int contadorEspacios = altura - 1;
    int contadorSimbolos = 1;
    for (int i=1; i<=altura; i++) {
      
    //bucle para pintar los espacios en blanco
    for(int j=1; j<=(altura - i); j++) {
      System.out.print(" ");
    }
        //Bucle para pintar los caracteres de la piramide
        for (int j=1; j<=contadorSimbolos; j++) {
        System.out.print(simbolo);
    }
        
        System.out.println(" ");
        contadorEspacios--;
        contadorSimbolos+=2;
        
    }
  }
}
