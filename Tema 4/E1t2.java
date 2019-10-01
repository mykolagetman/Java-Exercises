import java.util.Scanner;
public class E1t2 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    System.out.print("Elige un dia de la semana: ");
    String dia = x.nextLine();
    
    String asignatura="";
    
    switch (dia) {
      case "lunes":
       asignatura = "EED";
       break;
      case "martes":
       asignatura = "Fol";
       break;
      case "miercoles":
       asignatura = "Programacion";
       break;
      case "jueves":
       asignatura = "LM";
       break;
      case "viernes":
       asignatura = "Base de datos";
       break;
       default:
     }
         
         System.out.println("A primera hora del " + dia + " toca " + asignatura );
       }
     }
   
     

