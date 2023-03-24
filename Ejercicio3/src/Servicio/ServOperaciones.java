/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Operaciones;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ServOperaciones {
    Scanner scaner = new Scanner(System.in);
    
    //d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
    public Operaciones crearOperacion(){
        Operaciones op = new Operaciones();
        System.out.println("|--------------------------------------------------|");
        System.out.println("|         INGRESE LA SIGUIENTE INFORMACION         |");
        System.out.println("|--------------------------------------------------|");
        System.out.print("        PRIMERA CANTIDAD: ");
        op.setNum1(scaner.nextDouble());
        System.out.print("        SEGUNDA CANTIDAD: ");
        op.setNum2(scaner.nextDouble());
        return op;
    }
    
    //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public void sumar(Operaciones x){
        double sum;
        
        sum = x.getNum1() + x.getNum2();
        
        System.out.println("|--------------------------------------------------|");
        System.out.println("|                       SUMA                       |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("          RESULTADO: " + sum);
    }
    
    //f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public void restar(Operaciones x){
        double rest;
        
        rest = x.getNum1() - x.getNum2();
        
        System.out.println("|--------------------------------------------------|");
        System.out.println("|                      RESTA                       |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("          RESULTADO: " + rest);
    }
    
//    g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//            fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
//            Si no, se hace la multiplicación y se devuelve el resultado al main
    public void multiplicar(Operaciones x){
        double multi;
        
        multi = x.getNum1() * x.getNum2();
        if (multi == 0) {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|                   MULTIPLICAR                    |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("          RESULTADO: " + multi);
            System.out.println("ERROR!! Uno de los numeros es 0");
        }else{
            System.out.println("|--------------------------------------------------|");
            System.out.println("|                   MULTIPLICAR                    |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("          RESULTADO: " + multi);
        }
    }
    
//    h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//            una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//            informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
    public void dividir(Operaciones x){
        double div;
        if (x.getNum2() == 0) {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|                     DIVIDIR                      |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("           ERROR!! NO SE PUEDE DIVIDIR PARA 0       ");
        }else{
            div = x.getNum1() / x.getNum2();
            System.out.println("|--------------------------------------------------|");
            System.out.println("|                     DIVIDIR                      |");
            System.out.println("|--------------------------------------------------|");
            System.out.println("          RESULTADO: " + div);
        }
    }
}
