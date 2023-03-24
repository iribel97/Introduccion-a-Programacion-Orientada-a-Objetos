/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author irina
 */
public class Ahorcado {
    /*
    como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
    cantidad jugadas máximas que puede realizar el usuario.
    */
    private int longitudP;
    private char[] palabra;
    private int cantPalabrasE, cantJugadasMax;
    
    public Ahorcado() {
    }

    public Ahorcado(int longitudP, char[] palabra, int cantPalabrasE, int cantJugadasMax) {
        this.longitudP = longitudP;
        this.palabra = palabra;
        this.cantPalabrasE = cantPalabrasE;
        this.cantJugadasMax = cantJugadasMax;
    }

    public int getLongitudP() {
        return longitudP;
    }

    public void setLongitudP(int longitudP) {
        this.longitudP = longitudP;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getCantPalabrasE() {
        return cantPalabrasE;
    }

    public void setCantPalabrasE(int cantPalabrasE) {
        this.cantPalabrasE = cantPalabrasE;
    }

    public int getCantJugadasMax() {
        return cantJugadasMax;
    }

    public void setCantJugadasMax(int cantJugadasMax) {
        this.cantJugadasMax = cantJugadasMax;
    }

}
