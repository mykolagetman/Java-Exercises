import java.util.Scanner;
public class Ejercicio23 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int baseImponible;
    String tipoIva;
    int tipoIvaNumero;
    String codigo;
    
    double precioConIva;
    
    System.out.print("Introduce la base imponible: ");
    baseImponible = x.nextInt();
    System.out.print("Introduce el tipo de IVA (general, reducido, superreducido): ");
    tipoIva = x.nextLine();
    System.out.print("Introduzca el codigo promocional (nopro, mitad, meno5, 5porc): ");
    codigo = x.nextLine();
    
    // general = 21%, reducido = 10%, superreducido = 4%
    // nopro = no se aplica promocion ; mitad = el precio se reduce a la mitad
    // meno5 = se descuentan 5 euros ; 5porc = se descuenta el 5%
    
     switch (tipoIva) {
       case "general":
       tipoIvaNumero = 21;
       break;
       case "reducido":
       tipoIvaNumero = 10:
       break;
       case "superreducido":
       tipoIvaNumero = 4;
       break;
       default:
       
       precioConIva = baseImponible * tipoIvaNumero / 100;
  
    
    
    System.out.printf("%-10s     %8.2f\n", "Base Imponible", + baseImponible);
  }
}

    
