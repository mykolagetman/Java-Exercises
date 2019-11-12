import java.util.Scanner;
public class Ejercicio30T5 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    int dia1, dia2;
    int hora,hora1, hora2;
    String nombreDia1 = "";
    String nombreDia2 = "";
    int horasTranscurridas = 0;
    boolean distintos = false;
    
    
    System.out.println("Introduce la primera hora.");
    System.out.print("Dia(1-7): ");
    dia1 = x.nextInt();
    System.out.print("Hora: ");
    hora1 = x.nextInt();
    
    System.out.println("Introduce la segunda hora.");
    System.out.print("Dia(1-7): ");
    dia2 = x.nextInt();
    System.out.print("Hora: ");
    hora2 = x.nextInt();
    
     switch(dia1){
      case 1:
   nombreDia1 = "Lunes";
      case 2:
   nombreDia1 = "Martes";
      case 3:
   nombreDia1 = "Miercoles";
      case 4:
   nombreDia1 = "Jueves";
      case 5:
   nombreDia1 = "Viernes";
      case 6:
   nombreDia1 = "Sabado";
      case 7:
   nombreDia1 = "Domingo";
    }
    
    switch(dia2){
      case 1:
   nombreDia2 = "Lunes";
      case 2:
   nombreDia2 = "Martes";
      case 3:
   nombreDia2 = "Miercoles";
      case 4:
   nombreDia2 = "Jueves";
      case 5:
   nombreDia2 = "Viernes";
      case 6:
   nombreDia2 = "Sabado";
      case 7:
   nombreDia2 = "Domingo";
    } 
    
    hora = hora1;
    
    while(distintos == false){
      if(hora == 24){
  dia1++;
  hora = 1;
      }
      if(dia1 == dia2 && hora == hora2){
  distintos = true;
      }
      hora++;
      horasTranscurridas++;
    
    
    System.out.println("Entre las " + hora1 + ":00 del " + nombreDia1 + " y las " + hora2 + ":00 del " + nombreDia2 + " han transcurrido " + horasTranscurridas + " horas.");
   }
 }
  
}

 
