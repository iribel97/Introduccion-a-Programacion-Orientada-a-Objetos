/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ServerLibro {
    
    public Libro CrearLibro(){
        Scanner scaner = new Scanner(System.in);
        Libro creoLib = new Libro();
        
        
        /*
        Vamos a Pedir Los datos al usuario
        */
        
        System.out.println("--------------------------------------------------");
        System.out.println("-------------INGRESE DATOS DEL LIBRO--------------");
        System.out.println("--------------------------------------------------");
        System.out.print("              TITULO: ");
        creoLib.setTitulo(scaner.nextLine());
        System.out.print("                ISBN: ");
        creoLib.setISBN(scaner.nextLine());
        System.out.print("               AUTOR: ");
        creoLib.setAutor(scaner.nextLine());
        System.out.print("   NUMERO DE PAGINAS: ");
        creoLib.setNumPag(scaner.nextInt());
        
        return creoLib;
    }
    
    //Devolver o imprimir datos del usuario
    
    public void MostrarLibro(Libro x){
        System.out.println("--------------------------------------------------");
        System.out.println("--------------INFORMACIÓN DEL LIBRO---------------");
        System.out.println("--------------------------------------------------");
        System.out.println("                ISBN: " + x.getISBN());
        System.out.println("              TITULO: " + x.getTitulo());
        System.out.println("               AUTOR: " + x.getAutor());
        System.out.println("   NUMERO DE PAGINAS: " + x.getNumPag());
        System.out.println("--------------------------------------------------");
    }
}
