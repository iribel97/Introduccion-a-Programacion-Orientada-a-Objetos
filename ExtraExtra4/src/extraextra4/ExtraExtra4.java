/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extraextra4;

import Servicio.ServFecha;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ExtraExtra4 {

    /*
    Definir la clase Fecha. La Clase entidad tendrá solo 3 atributos (día, mes, año). No se podrá utilizar
ningún tipo de objeto de “clase fechas”. Inicializando desde la entidad los valores en 1, 1, 1900
respectivamente.
Se deberá en métodos independientes:
● Verificar que el año ingresado por el usuario este entre 1900 y 2021, caso contrario, el año
tomara el valor por defecto.
● Conocer la cantidad de días totales que tiene el mes elegido por el usuario. EJ: USTED
INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días
● Mostrar día anterior a la fecha ingresada (Hay que considerar que sucede con inicio de
cada mes)
● Mostrar día posterior a la fecha ingresada (Hay que considerar que sucede con fin de cada
mes)
● Crear un método para verificar si el año ingresado es bisiesto

    */
    public static void main(String[] args) {
        // TODO code application logic here
        ServFecha serv = new ServFecha();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESE UNA FECHA:");
        System.out.println("  DIA: ");
        int day1 = leer.nextInt();
        System.out.println("  MES: ");
        int month1 = leer.nextInt();
        System.out.println("  AÑO: ");
        int year1 = leer.nextInt();
        
        serv.verificarYear(year1);
        serv.cantDias(month1, 0);
        serv.diaAnterios(day1, month1, year1);
        serv.diaPosterior(day1, month1, year1);
        serv.bisiesto(year1);
       
    }
    
}
