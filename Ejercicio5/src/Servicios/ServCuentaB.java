/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.CuentaB;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ServCuentaB {
    Scanner scaner = new Scanner(System.in);
    
    //c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public CuentaB crearCuenta(){
        CuentaB cuenta = new CuentaB();
        
        System.out.println("--------------------------------------------------");
        System.out.println("         INGRESE LA SIGUIENTE INFORMACION         ");
        System.out.println("--------------------------------------------------");
        System.out.print("      DNI: ");
        cuenta.setDni(scaner.nextLong());
        System.out.print("      NUMERO DE CUENTA: ");
        cuenta.setNumCuent(scaner.nextInt());
        System.out.print("      SALDO ACTUAL: ");
        cuenta.setSaldoA(scaner.nextInt());
        System.out.print("      INTERES: ");
        cuenta.setInteres(scaner.nextInt());
        
        return cuenta;
    }
    
    //d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
    
    public void ingresar(CuentaB x){
        double ingreso;
        
        System.out.println("--------------------------------------------------");
        System.out.print("     INGRESE DINERO: ");
        ingreso = scaner.nextDouble();
        
        ingreso += x.getSaldoA();
        x.setSaldoA(ingreso);
        System.out.println("--------------------------------------------------");
        System.out.println("       SALDO ACTUAL: " + x.getSaldoA());
    }
    
//    e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
//            la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//            pondrá el saldo actual en 0.
    public void retirar(CuentaB x){
        double retiro;
        
        System.out.println("--------------------------------------------------");
        System.out.print("      CANTIDAD A RETIRAR: ");
        retiro = scaner.nextDouble();
        
        
        if (x.getSaldoA()< retiro) {
            x.setSaldoA(0);
        }else{
            retiro = x.getSaldoA() - retiro;
            x.setSaldoA(retiro);
        }
        
        
        System.out.println("--------------------------------------------------");
        System.out.println("       SALDO ACTUAL: " + x.getSaldoA());
        
    }
    
    //f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
    //    usuario no saque más del 20%.
    
    public void extraccionRapida(CuentaB x){
        double ext, extraer;
        int contE = 0;
        
        ext = x.getSaldoA() * 0.2;
        
        System.out.println("--------------------------------------------------");
        System.out.println("      PUEDE RETIRAR HASTA $ " + ext);
        
        do {
            if (contE != 0) {
                System.out.println("--------------------------------------------");
                System.out.println("VALOR INGRESADO SUPERA LOS $ " + ext);
            }
            System.out.println("----------------------------------------------");
            System.out.print("      CANTIDAD A RETIRAR : ");
            extraer = scaner.nextDouble();
            
            contE++;
        } while (extraer > ext);
        
        extraer = x.getSaldoA() - extraer;
        
        x.setSaldoA(extraer);
        System.out.println("--------------------------------------------------");
        System.out.println("       SALDO ACTUAL: " + x.getSaldoA());
    }
    
    //g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(CuentaB x){
        System.out.println("--------------------------------------------------");
        System.out.println("                 SALDO DISPONIBLE                 ");
        System.out.println("--------------------------------------------------");
        System.out.println("         $ " + x.getSaldoA());
    }
    
    //h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos(CuentaB x){
        System.out.println("--------------------------------------------------");
        System.out.println("                DATOS DE LA CUENTA                ");
        System.out.println("--------------------------------------------------");
        System.out.println("      DNI: " + x.getDni());
        System.out.println("--------------------------------------------------");
        System.out.println("      NUMERO DE CUENTA: " + x.getNumCuent());
        System.out.println("--------------------------------------------------");
        System.out.println("      SALDO ACTUAL: " + x.getSaldoA());
        System.out.println("--------------------------------------------------");
        System.out.println("      INTERES: " + x.getInteres());
        
    }
}
