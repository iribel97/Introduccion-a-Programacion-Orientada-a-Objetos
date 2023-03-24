/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Matemáticas;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author irina
 */
public class ServerMatematicas {
    
    //a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public double devolverMayor(Matemáticas mate){
        double num;
        num = Math.max(mate.getNum1(), mate.getNum2());
        return num;
    }
    
    /*
    b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
        elevado al menor número. Previamente se deben redondear ambos valores.
    */
    
    public void calcularPotencia(Matemáticas mate){
        double num1 = devolverMayor(mate), result;
        
        
        System.out.println("--------------------------------------------------");
        System.out.println("                     POTENCIA                     ");
        System.out.println("--------------------------------------------------");
        
        if (num1 == mate.getNum1()) {
            result = Math.pow(mate.getNum1(), mate.getNum2());
            System.out.println("   Base : " + mate.getNum1());
            System.out.println("   Exponente : " + mate.getNum2());
            
        }else{
            result = Math.pow(mate.getNum2(), mate.getNum1());
            System.out.println("   Base : " + mate.getNum2());
            System.out.println("   Exponente : " + mate.getNum1());
        }
        BigDecimal bd = new BigDecimal(result);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        result = bd.doubleValue();
        
        System.out.println("   Resultado : " + result);
    }
    
    /*
    c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
        Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    */
    public void calcularRaiz(Matemáticas mate){
        double numMin = Math.min(mate.getNum1(), mate.getNum2());
        double resultado;
        
        resultado = Math.sqrt(numMin);
        resultado = Math.abs(resultado);
        System.out.println("--------------------------------------------------");
        System.out.println("          RAIZ CUADRADA DEL MENOR NUMERO          ");
        System.out.println("--------------------------------------------------");
        System.out.println("    Resultado: " + resultado);
    }
}
