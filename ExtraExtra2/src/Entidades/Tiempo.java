/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author irina
 */
public class Tiempo {
    /*
    la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
    constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
    además, los métodos getters y setters correspondientes
    */
    private int hora, min, seg;

    public Tiempo() {
    }

    public Tiempo(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }
    
}
