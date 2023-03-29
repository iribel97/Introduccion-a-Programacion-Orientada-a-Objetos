/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extraejer1;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ExtraEjer1 {

   /*
    Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
    definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
    vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
    además definir los métodos getters y setters correspondientes.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Cancion song = new Cancion();
        
        System.out.println("INGRESE LA SIGUIENTE INFORMACION ");
        
        System.out.print("  Nombre de la cancion: ");
        song.setTitulo(leer.nextLine());
        System.out.print("  Autor de la cancion: ");
        song.setAutor(leer.nextLine());
    }
    
}
