/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author irina
 */
public class CuentaB {
    /*
    Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
    numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
    Las operaciones asociadas a dicha clase son:
        
        
    */
    
    private int numCuent;
    private long dni;
    private double saldoA;
    private int interes;
    
    //a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
    public CuentaB() {
    }

    public CuentaB(int numCuent, long dni, int saldoA, int interes) {
        this.numCuent = numCuent;
        this.dni = dni;
        this.saldoA = saldoA;
        this.interes = interes;
    }
    
    
    //b) Agregar los métodos getters y setters correspondientes
    public int getNumCuent() {
        return numCuent;
    }

    public void setNumCuent(int numCuent) {
        this.numCuent = numCuent;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoA() {
        return saldoA;
    }

    public void setSaldoA(double saldoA) {
        this.saldoA = saldoA;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
    
    
}
