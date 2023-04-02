/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Libro;

/**
 *
 * @author irina
 */
public class Inventario {
    
    
    
    public Libro registrarLibro(String NombreLib, int CantidadPag, String Genero, double Precio, boolean Pertenece, int Stock, String nombreAutor){
        Libro libro = new Libro(NombreLib, CantidadPag, Genero, Precio, Pertenece, Stock, nombreAutor);
        return libro;
    }
    
    public Libro registrarLibroConSerie(String NombreLib, int CantidadPag, String Genero, double Precio, 
            boolean Pertenece, String Saga, int NumLibro, int Stock, String nombreAutor){
        Libro libroCon = new Libro(NombreLib, CantidadPag, Genero, Precio, Pertenece, Saga, NumLibro, Stock, nombreAutor);
        
        return libroCon;
    }
    
    public Libro[] biblioteca(){
        Libro[] libros = new Libro[20];
        
        //AUTORA Holly Black - SAGA Habitantes del aire
        libros[0] = registrarLibroConSerie("El Principe Cruel", 464, "Fantasia", 24.50, true, "Habitantes del aire", 1, 5, "Holly Black");
        libros[1] = registrarLibroConSerie("El Rey Malvado", 336, "Fantasia", 18, true, "Habitantes del aire", 2, 8, "Holly Black");
        libros[2] = registrarLibroConSerie("La Reina de Nada", 432, "Fantasia", 22.25, true, "Habitantes del aire", 3, 3, "Holly Black");
        
        //AUTORA Ariana Godoy
        libros[3] = registrarLibro("Sigue Mi Voz", 336, "Ficcion Adulto Joven", 18, false, 10, "Ariana Godoy");
        /*SAGA Darks*/
        libros[4] = registrarLibroConSerie("Heist", 448, "Ficcion Adulto Joven", 23, true, "Darks", 1, 5, "Ariana Godoy");
        libros[5] = registrarLibroConSerie("Fleur", 336, "Ficcion Adulto Joven", 15.5, true, "Darks", 2, 5, "Ariana Godoy");
        
        //AUTORA Alex Mirez
        libros[6] = registrarLibro("Damian", 472, "Misterio", 25, false,10,"Alex Mirez");
        
        //AUTORA Angie Ocampo
        libros[7] = registrarLibro("Backstage", 419, "Ficcion Adulto Joven", 19, false, 9, "Angie Ocampo");
        
        //AUTORA Joana Marcus
        /*TRILOGIA Ciudades de Fuego*/
        libros[8] = registrarLibroConSerie("Ciudad de Humo", 496, "Ficcion Adulto Joven", 28, true, "Ciudades de Fuego", 1, 4, "Joana Marcus");
        libros[9] = registrarLibroConSerie("Ciudad de Cenizas", 356, "Ficcion Adulto Joven", 16.5, true, "Ciudades de Fuego", 2, 2, "Joana Marcus");
        libros[10] = registrarLibroConSerie("Ciudad de Fuego", 608, "Ficcion Adulto Joven", 30, true, "Ciudades de Fuego", 3, 2, "Joana Marcus");
        
        //AUTORA Victoria Vilchez
        libros[11] = registrarLibro("Un Linaje Osuro", 480, "Fantasia", 22, false, 4, "Victoria Vilchez");
        
        //AUTORA V.E. Schwab
        libros[12] = registrarLibro("La vida Invisible de Addie LaRue", 504, "Fantasia", 30.25, false, 1, "V.E. Schawb");
        
        //AUTORA Penelope Douglas
        libros[13] = registrarLibro("Birthday Girl", 407, "Romance", 23, false, 5, "Penelope Douglas");
        libros[14] = registrarLibro("Punk 57", 306, "Romance", 15.5, false, 1, "Penelope Douglas");
        
        //AUTORA Stelle M.
        libros[15] = registrarLibroConSerie("Love you", 512, "Romance", 30, true, "You", 1, 2, "Stelle M.");
        libros[16] = registrarLibroConSerie("Need you", 440, "Romance", 25, true, "You", 2, 2, "Stelle M.");
        libros[17] = registrarLibroConSerie("Miss you", 424, "Romance", 24.5, true, "You", 3, 2, "Stelle M.");
        libros[18] = registrarLibroConSerie("Forever you", 544, "Romance", 32.5, true, "You", 4, 2, "Stelle M.");
        
        //AUTORA Belen Martinez
        libros[19] = registrarLibro("El Vals de la Bruja", 512, "Romance", 30, false, 1, "Belen Martinez");
        
        return libros;
    }
}
