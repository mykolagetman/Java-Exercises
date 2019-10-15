import java.util.Scanner;
  public class Ejercicio24 {
    public static void main(String args[]) {
      Scanner x = new Scanner (System.in);
      
      int cargo;
      int viaje;
      int estado;
      int sueldo;
      int dietas;
      int IRPF;
      int sueldoBruto = sueldo + dietas;
      int sueldoNeto = sueldoBruto - IRPF;
      
      System.out.println("1 - Programador junior");
      System.out.println("2 - Programador senior");
      System.out.println("3 - Jefe de proyecto");
      
      System.out.print("Introduzca el cargo del empleado(1 - 2 - 3): ");
      cargo = x.nextInt();
      x.nextLine();
      System.out.print("Cuantos dias ha estado de viaje visitando clientes?");
      viaje = x.nextInt();
      x.nextLine();
      System.out.print("Introduzca su estado civil(1 - soltero , 2 - casado): ");
      estado = x.nextInt();
      
      switch (cargo) {
        case 1:
        sueldo = 950;
        break;
        case 2:
        sueldo = 1200;
        break;
        case 3:
        sueldo = 1600;
        break;
        default:
      }
      
      dietas = viaje + 30;
      //sueldoBruto = sueldo + dietas;
      
      if (estado == 1) {
        IRPF = (sueldoBruto * 25) / 100;
      }
      if (estado == 2) {
        IRPF = (sueldoBruto * 20) / 100;
      }
      
      //sueldoNeto = sueldoBruto - IRPF;
      
      System.out.printf("| Sueldo base %8d", sueldo);
    }
  }
      
    
