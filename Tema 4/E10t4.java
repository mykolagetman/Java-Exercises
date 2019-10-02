import java.util.Scanner;
public class E10t4 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    System.out.println("Hoy te voy a decir tu horoscopo");
    
    System.out.print("Lo primero, dime tu dia de nacimiento: ");
    int dia = x.nextInt();
    
    //System.out.print("Ahora dime tu mes de nacimiento: ");
    //String mes = x.nextLine();
    
    if (( dia >= 1 ) && ( dia <= 15 )) {
      System.out.print("Tu futuro me parece incierto");
    }
    if (( dia > 15 ) && ( dia <= 30 )) {
      System.out.print("Tu futuro lo veo muy claro");
    }
    
    System.out.print("Ahora dime tu mes de nacimiento: ");
    String mes = x.nextLine();
    String mesAnio = Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre;
    
    if ("Enero";"Febrero";"Marzo";"Abril";"Mayo";"Junio".equals(mesAnio)) {
      System.out.print("Ahora lo tengo claro, no te van a pasar cosas buenas");
    }
    if ("Julio";"Agosto";"Septiembre";"Octubre";"Noviembre";"Diciembre".equals(mesAnio)) {
      System.out.print("Si, vas a tener mucha suerte en la vida");
    }
  }
}
