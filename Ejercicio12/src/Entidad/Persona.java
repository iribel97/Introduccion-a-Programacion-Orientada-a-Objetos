/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.LocalDate;

/**
 *
 * @author irina
 */
public class Persona {
    /*
    Una persona tiene un nombre y una fecha de nacimiento
    (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
    métodos:
    */
    private String Nombre;
    private LocalDate fechaNacimiento;

    public Persona() {
    }

    public Persona(String Nombre, LocalDate fechaNacimiento) {
        this.Nombre = Nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
