/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author irina
 */
public class Cadena {
    private String frase;
    private int tamFrase;

    public Cadena() {
    }

    public Cadena(String frase, int tamFrase) {
        this.frase = frase;
        this.tamFrase = tamFrase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getTamFrase() {
        return tamFrase;
    }

    public void setTamFrase(int tamFrase) {
        this.tamFrase = tamFrase;
    }
    
    
}
