/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author irina
 */
public class Fraccion {
    /*
    4 atributos (denominador y numerador de cada
    fracción)
    */
    private int denom1, denom2, nume1, nume2;

    public Fraccion() {
    }

    public Fraccion(int denom1, int denom2, int nume1, int nume2) {
        this.denom1 = denom1;
        this.denom2 = denom2;
        this.nume1 = nume1;
        this.nume2 = nume2;
    }

    public int getDenom1() {
        return denom1;
    }

    public void setDenom1(int denom1) {
        this.denom1 = denom1;
    }

    public int getDenom2() {
        return denom2;
    }

    public void setDenom2(int denom2) {
        this.denom2 = denom2;
    }

    public int getNume1() {
        return nume1;
    }

    public void setNume1(int nume1) {
        this.nume1 = nume1;
    }

    public int getNume2() {
        return nume2;
    }

    public void setNume2(int nume2) {
        this.nume2 = nume2;
    }
    
}
