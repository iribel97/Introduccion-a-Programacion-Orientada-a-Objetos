/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import Entidades.Curso;
import Servidor.ServidorCurso;

/**
 *
 * @author irina
 */
public class Ejercicio13 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        ServidorCurso server = new ServidorCurso();
        
        Curso course1 = server.crearCurso();
        
        server.calcularGananciaSemanal(course1);
    }
    
}
