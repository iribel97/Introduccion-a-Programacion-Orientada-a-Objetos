/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServMovil;

import Entidades.Movil;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ServidorMovil {
    /*
    - Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
        instanciar un objeto Celular y poder cargarlo en nuestro programa.
    */
    Scanner scaner = new Scanner(System.in);
    
    public Movil cargarCelular( int num){
        Movil cell = new Movil();
        scaner.nextLine();
        System.out.println("--------------------------------------------------");
        System.out.println("   INGRESE LA SIGUIENTE INFORMACION DEL CELULAR " + num);
        System.out.println("--------------------------------------------------");
        System.out.print("  * Marca: ");
        cell.setMarca(scaner.nextLine());
        System.out.print("  * Modelo: ");
        cell.setModelo(scaner.nextLine());
        System.out.print("  * Precio: ");
        cell.setPrecio(scaner.nextDouble());
        System.out.print("  * Memoria RAM: ");
        cell.setMemoriaRam(scaner.nextInt());
        System.out.print("  * Almacenamiento: ");
        cell.setAlmacenamiento(scaner.nextInt());
        System.out.println("  * Codigo: ");
        cell.setCodigo(ingresarCodigo());
        
        return cell;
    }
    
    /*
    - Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
        números de un celular. Para ello, puede utilizarse un bucle repetitivo
    */
    
    public int[] ingresarCodigo(){
        int[] cod = new int[7];
        for (int i = 0; i < cod.length; i++) {
            
            cod[i] = (int)(Math.random()*10);
            System.out.print("[ "+cod[i] + "]");
        }
        System.out.println("");
        return cod;
    }
    
}
