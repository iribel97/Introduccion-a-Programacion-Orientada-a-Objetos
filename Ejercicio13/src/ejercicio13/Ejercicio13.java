/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import Entidades.Curso;
import Servidor.ServidorCurso;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Ejercicio13 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ServidorCurso server = new ServidorCurso();
        
        System.out.println("Cuantos Cursos desea Ingresar: ");
        int cantCurso = leer.nextInt();
        Curso[] cursos = new Curso[cantCurso];
        
        for (int i = 0; i < cursos.length; i++) {
            cursos[i] = server.crearCurso();
        }
        
        for (int i = 0; i < cursos.length; i++) {
            server.mostrarCurso(cursos[i], i+1);
        }
        
       
    }
    
}
