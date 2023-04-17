/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Fraccion;

/**
 *
 * @author irina
 */
public class ServFraccion {

    /*
    métodos para sumar, restar, multiplicar y dividir
    fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
     */

    public void sumar(Fraccion frac) {
        //Variables que guarden la suma
        int numS , denomS;
        //si los denominadores son iguales solo se suma los numeradores
        if (frac.getDenom1() == frac.getDenom2()) {
            numS = frac.getNume1() + frac.getNume2();
            denomS = frac.getDenom1();
        } else {
            denomS = frac.getDenom1() * frac.getDenom2();
            numS = (frac.getDenom1() * frac.getNume2()) + (frac.getDenom2() * frac.getNume1());
        }

        //Mostrar al usuario
        System.out.println("--------------------------------------------------");
        System.out.println("                       SUMA                       ");
        System.out.println("--------------------------------------------------");
        System.out.println(numS + " / " + denomS);
        simplificar(numS, denomS);
    }
    
    public void restar(Fraccion frac) {
        //Variables que guarden la resta
        int numR , denomR;
        //si los denominadores son iguales solo se suma los numeradores
        if (frac.getDenom1() == frac.getDenom2()) {
            numR = frac.getNume1() - frac.getNume2();
            denomR = frac.getDenom1();
        } else {
            denomR = frac.getDenom1() * frac.getDenom2();
            numR = (frac.getDenom2() * frac.getNume1()) - (frac.getDenom1() * frac.getNume2());
        }

        //Mostrar al usuario
        System.out.println("--------------------------------------------------");
        System.out.println("                       RESTA                      ");
        System.out.println("--------------------------------------------------");
        System.out.println(numR + " / " + denomR);
        simplificar(numR, denomR);
    }
    
    public void multiplicar(Fraccion frac){
        //Variables que guarden la multiplicacion
        int numM, denomM;
        
        numM = frac.getNume1() * frac.getNume2();
        denomM = frac.getDenom1() *frac.getDenom2();
        
        //Mostrar al usuario
        System.out.println("--------------------------------------------------");
        System.out.println("                  MULTIPLICACION                  ");
        System.out.println("--------------------------------------------------");
        System.out.println(numM + " / " + denomM);
        simplificar(numM, denomM);
        
    }
    public void dividir(Fraccion frac){
        //Variables que guarden la multiplicacion
        int numD, denomD;
        
        numD = frac.getNume1() * frac.getDenom2();
        denomD= frac.getDenom1() * frac.getNume2();
        
        //Mostrar al usuario
        System.out.println("--------------------------------------------------");
        System.out.println("                     DIVICION                     ");
        System.out.println("--------------------------------------------------");
        System.out.println(numD + " / " + denomD);
        simplificar(numD, denomD);
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Funcion para Simplificar">
    
    private void simplificar(int numerador, int denominador) {
        int divisorComun = obtenerDivisorComun(numerador, denominador);
        int numSim = numerador / divisorComun;
        int denSimp = denominador / divisorComun;
        if (numerador != numSim && denominador != denSimp) {
            System.out.println("--------------------------------------------------");
            System.out.println("                  SIMPLIFICACION                  ");
            System.out.println("--------------------------------------------------");
            System.out.println(numerador + "/" + denominador + " = " + numSim + "/"
                + denSimp);
        }
        
    }

    public static int obtenerDivisorComun(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    // </editor-fold>
    
  
}
