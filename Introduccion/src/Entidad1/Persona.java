/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad1;

/**
 *
 * @author irina
 */
public class Persona {

    private String nacionalidad;
    private String nombre;
    private int edad;

    public Persona() {
    }
    
    public Persona(String nacionalidad, String nombre, int edad) {
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    //toString
    @Override
    public String toString() {
        return "Persona{" + "nacionalidad=" + nacionalidad + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
