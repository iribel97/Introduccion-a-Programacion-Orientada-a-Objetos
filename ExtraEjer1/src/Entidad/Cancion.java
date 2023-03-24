/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author irina
 */
public class Cancion {
    //atributos: titulo y autor.
    
    private String titulo;
    private String autor;
    
    /*
    constructores: uno vacío que inicializa el titulo y el autor a cadenas
    vacías y otro que reciba como parámetros el titulo y el autor de la canción
    */

    public Cancion() {
        titulo = "";
        autor = "";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    /*
    Se deberán además definir los métodos getters y setters correspondientes.
    */

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
