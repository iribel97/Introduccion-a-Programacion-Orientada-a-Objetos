/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import Entidades.CuentaB;
import Servicios.ServCuentaB;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Ejercicio5 {

    /*
    Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
    numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
    Las operaciones asociadas a dicha clase son:
        a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
        b) Agregar los métodos getters y setters correspondientes
        c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
        d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
        e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
            la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
            pondrá el saldo actual en 0.
        f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
            usuario no saque más del 20%.
        g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
        h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc;
        boolean bandera = true;
        
        ServCuentaB server = new ServCuentaB();
        
        CuentaB cuenta1 = server.crearCuenta();
        
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("--------------------------------------------------");
            System.out.println("               MENU DE OPCIONES               ");
            System.out.println("--------------------------------------------------");
            System.out.println("      1. DEPOSITAR");
            System.out.println("      2. RETIRAR");
            System.out.println("      3. EXTRACCION RAPIDA");
            System.out.println("      4. CONSULTAR SALDO");
            System.out.println("      5. CONSULTAR DATOS");
            System.out.println("      6. SALIR");
            System.out.println("--------------------------------------------------");
            System.out.print("      INGRESE OPCION: ");
            opc = scan.nextInt();
            
            switch (opc) {
                case 1 -> server.ingresar(cuenta1);
                case 2 -> server.retirar(cuenta1);
                case 3 -> server.extraccionRapida(cuenta1);
                case 4 -> server.consultarSaldo(cuenta1);
                case 5 -> server.consultarDatos(cuenta1);
                case 6 -> bandera = false;
                default -> {
                    System.out.println("--------------------------------------------------");
                    System.out.println("     OPCION NO ENCONTRADA, INTENTELO DE NUEVO");
                }
            }
            
        } while (bandera == true);
        
        
    }
    
}
