import java.util.Scanner;
public class E10t4 {
  public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    
    System.out.println("Hoy te voy a decir tu horoscopo");
    
    System.out.print("Lo primero, dime tu dia de nacimiento: ");
    int dia = x.nextInt();
    
    System.out.print("Ahora dime tu mes de nacimiento(1-12): ");
    int mes = x.nextInt();
    
    if (( dia >= 21 ) && ( dia <= 30 ) && ( mes == 3 ) || ( dia <= 19 ) && (mes == 4 )) {
      System.out.print("aries");
    }
     if (( dia >= 20 ) && ( dia <= 30 ) && ( mes == 4 ) || ( dia <= 20 ) && (mes == 5 )) {
      System.out.print("tauro");
    }
     if (( dia >= 21 ) && ( dia <= 30 ) && ( mes == 5 ) || ( dia <= 20 ) && (mes == 6 )) {
      System.out.print("geminis");
    }
     if (( dia >= 21 ) && ( dia <= 30 ) && ( mes == 6 ) || ( dia <= 22 ) && (mes == 7 )) {
      System.out.print("cancer");
    }
     if (( dia >= 23 ) && ( dia <= 30 ) && ( mes == 7 ) || ( dia <= 23 ) && (mes == 8 )) {
      System.out.print("leo");
    }
     if (( dia >= 24 ) && ( dia <= 30 ) && ( mes == 8 ) || ( dia <= 22 ) && (mes == 9 )) {
      System.out.print("virgo");
    }
     if (( dia >= 21 ) && ( dia <= 30 ) && ( mes == 9 ) || ( dia <= 22 ) && (mes == 10 )) {
      System.out.print("libra");
    }
     if (( dia >= 23 ) && ( dia <= 30 ) && ( mes == 10 ) || ( dia <= 21 ) && (mes == 11 )) {
      System.out.print("escorpio");
    }
     if (( dia >= 21 ) && ( dia <= 30 ) && ( mes == 11 ) || ( dia <= 21 ) && (mes == 12 )) {
      System.out.print("sagitario");
    }
     if (( dia >= 22 ) && ( dia <= 30 ) && ( mes == 12 ) || ( dia <= 19 ) && (mes == 1 )) {
      System.out.print("capricornio");
    }
     if (( dia >= 20 ) && ( dia <= 30 ) && ( mes == 1 ) || ( dia <= 19 ) && (mes == 2 )) {
      System.out.print("acuario");
    }
     if (( dia >= 20 ) && ( dia <= 30 ) && ( mes == 2 ) || ( dia <= 20 ) && (mes == 3 )) {
      System.out.print("piscis");
    }
    
    
    }
  }

