/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Fecha;

/**
 *
 * @author irina
 */
public class ServFecha {
    Fecha date = new Fecha();
    
    String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", 
        "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    
    int cantidadD;
    /*
    ● Verificar que el año ingresado por el usuario este entre 1900 y 2023, caso contrario, el año
    tomara el valor por defecto.
    */
    public void verificarYear(int year1){
        if (year1 >= 1900 && year1 <= 2023) {
            date.setYear(year1);
            System.out.println("AÑO VALIDO");
        }else{
            System.out.println("AÑO INVALIDO");
        }
    }
    
    /*
    ● Conocer la cantidad de días totales que tiene el mes elegido por el usuario. EJ: USTED
    INGRESO MES 10 (OCTUBRE), QUE TIENE 31 días
    */
    //anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)
    public int cantDias(int mes, int cant){
        switch (mes) {
            case 1,3,5,7,8,10,12:
                
                cantidadD = 31;
                break;
            case 2:
                if (date.getYear()%4 == 0 && (date.getYear() % 100 != 0 || date.getYear() % 400 == 0)) {
                    
                    cantidadD = 29;
                }else{
                    
                    cantidadD = 28;
                }
                break;
            case 4,6,9,11:
                
                cantidadD = 30;
                break;
            default:
                System.out.println("MES INGRESADO ES INCORRECTO");  
        }
        if (cant == 0) {
            System.out.println("USTED INGRESO MES " + mes + " (" + meses[mes-1] + "), QUE TIENE "+cantidadD+ " DIAS");
        }
        
        return cantidadD;
    }
    
    /*
    ● Mostrar día anterior a la fecha ingresada (Hay que considerar que sucede con inicio de
    cada mes)
    */
    public void diaAnterios(int dia, int mes, int year1){
        //guarde dia
        int dia2 = cantDias(mes-1 , 1);
        
        System.out.println("LA FECHA ANTERIOR ES: ");
        if (dia == 1) {
            if (mes == 1) {
                //SI EL USUARIO INGRESA 1-ENERO
                System.out.println("31 DE DICIEBRE DE " + (year1-1) );
            }else{
      
                System.out.println(dia2 + " DE " + meses[mes-2].toUpperCase() + " DE "+ year1);
            }
        }else{
            System.out.println((dia-1) + " DE " + meses[mes-1].toUpperCase() + " DE "+ year1);
        }
    }
    
    /*
    ● Mostrar día posterior a la fecha ingresada (Hay que considerar que sucede con fin de cada
    mes)
    */
    public void diaPosterior(int dia, int mes, int year1){
        
        System.out.println("LA FECHA POSTERIOR ES: ");
        if (dia == 31) {
            if (mes == 12) {
                //SI EL USUARIO INGRESA 31-diciembre
                System.out.println("1 DE ENERO DE " + (year1+1) );
            }else{
      
                System.out.println("1 DE " + meses[mes].toUpperCase() + " DE "+ year1);
            }
        }else{
            System.out.println((dia+1) + " DE " + meses[mes-1].toUpperCase() + " DE "+ year1);
        }
    }
    
    /*
    ● Crear un método para verificar si el año ingresado es bisiesto
    */
    public void bisiesto(int year){
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("EL AÑO ES BISIESTO");
        }else{
            System.out.println("EL AÑO NO ES BISIESTO");
        }
        
    }
}
