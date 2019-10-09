import java.util.Scanner;
public class E12t4 {
  public static void main(String args[]){
    Scanner x = new Scanner(System.in);
    
    String pregunta1;
    int puntuacion = 0;
    
    System.out.println("Cuestionario de 10 preguntas, tienes 3 opciones");
    
    System.out.println("Que lenguaje de programacion utilizamos en Programacion?");
    System.out.println("a) Java");
    System.out.println("b) Phyton");
    System.out.println("c) C++");
    pregunta1 = x.nextLine();
    
    
    if (pregunta1.equals("a")) {
       System.out.println("Correcto, has conseguido 1 punto");
       puntuacion++;
     } else {
       System.out.println("Incorrecto");
     }
     
     System.out.println("Que utilizamos en Lenguaje de Marcas");
     System.out.println("a) Java");
     System.out.println("b) HTML");
     System.out.println("c) JavaScript");
     String pregunta2 = x.nextLine();
     
     if (pregunta2.equals("b")) {
       System.out.println("Correcto, has conseguido otro punto");
        puntuacion++;
     } else {
       System.out.println("Incorrecto");
     }
     
     System.out.println("Que maquina virtual utilizamos en progrmacion?");
     System.out.println("a) Accenture");
     System.out.println("b) Dekra");
     System.out.println("c) Virtual box");
     String pregunta3 = x.nextLine();
     
     if (pregunta3.equals("c")) {
       System.out.println("Correcto, tienes otro punto");
       puntuacion++;
     } else {
       System.out.println("Incorrecto");
     }
     System.out.print("Has conseguido un total de: " + puntuacion + " puntos");
     
   }
 }
