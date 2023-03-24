/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

/**
 *
 * @author irina
 */
public class Ejercicio10 {

    /*
    Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
    de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
    programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
    Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
    ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
    0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
    20.
    */
    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double[20];
        double result;
        
        //Inicializar arreglo A con numeros aleatorios
        
        for (int i = 0; i < A.length; i++) {
            result = Math.random()*100;
            BigDecimal bd = new BigDecimal(result);
            bd = bd.setScale(2, RoundingMode.HALF_UP);
            A[i] = bd.doubleValue();
        }
        //Mostrar por pantalla
        System.out.println("--------------------------------------------------");
        System.out.println("                    ARREGLO 'A'                   ");
        System.out.println("--------------------------------------------------");

        System.out.println(Arrays.toString(A));
        
        //Ordenar de menor a mayor
        Arrays.sort(A);
        
        System.out.println("--------------------------------------------------");
        System.out.println("       ARREGLO 'A' ORDENADO DE MENOR A MAYOR      ");
        System.out.println("--------------------------------------------------");
        System.out.println(Arrays.toString(A));
        
        //copiar los primeros 10 números ordenados al arreglo B de 20 elementos
        for (int i = 0; i < B.length; i++) {
            if (i < 10) {
                B[i] = A[i];
            }else{
                //rellenar los 10 últimos elementos con el valor 0.5
                B[i] = 0.5;
            }
        }
       System.out.println("--------------------------------------------------");
       System.out.println("               ARREGLO 'B' COMBINADO              ");
       System.out.println("--------------------------------------------------");
       System.out.println(Arrays.toString(B));
    }
    
}
