/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import Entidades.Cadena;
import Servicios.ServerCadena;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scaner = new Scanner(System.in);
        //Crear la instancia del servidor
        ServerCadena servidor = new ServerCadena();
        //Crear el objeto cadena
        Cadena cad = new Cadena();
        //Definir variables a usar
        int opc;
            //Opcion 3
        char letra1;
        int contLetra1;
            //Opcion 4 y 5
        String fraseN;
            //Opcion 6 y 7
        char letra2;
        boolean conf;
        
        
        System.out.println("--------------------------------------------------");
        System.out.print("      Ingrese una frase: ");
        cad.setFrase(scaner.nextLine());
        
        //guardar la longitud de la frase
        //x = cad.getFrase().length();
        //cad.setTamFrase(x);
        cad.setTamFrase((cad.getFrase().length()));
        do {
            System.out.println("");
            System.out.println("--------------------------------------------------");
            System.out.println("                 MENU DE OPCIONES                 ");
            System.out.println("--------------------------------------------------");
            System.out.println("   1. Contabilizar vocales");
            System.out.println("   2. Invertir frase");
            System.out.println("   3. Veces repetidas de una letra");
            System.out.println("   4. Comparar longitud de la frase");
            System.out.println("   5. Unir frases");
            System.out.println("   6. Reemplazar");
            System.out.println("   7. Comprobar letra");
            System.out.println("   8. Salir");
            System.out.println("--------------------------------------------------");
            System.out.print("   ELIGE UNA OPCION: ");
            opc = scaner.nextInt();
            scaner.nextLine();
            
            switch (opc) {
                case 1 -> servidor.mostrarVocales(cad);
                case 2 -> servidor.invertirFrase(cad);
                case 3 -> {
                    System.out.println("--------------------------------------------------");
                    System.out.print("   Ingrese un caracter: ");
                    letra1 = scaner.next().charAt(0);
                    contLetra1 = servidor.vecesRepetido(letra1, cad);
                    System.out.println("--------------------------------------------------");
                    System.out.println("   LA LETRA " + letra1 + " SE REPITE " + contLetra1 + " VECES");
                    System.out.println("--------------------------------------------------");
                }
                case 4 -> {
                    System.out.println("--------------------------------------------------");
                    System.out.print(" Ingrese una nueva frase: ");
                    fraseN = scaner.nextLine();
                    servidor.compararLongitud(fraseN, cad);
                }
                case 5 -> {
                    System.out.println("--------------------------------------------------");
                    System.out.print(" Ingrese una nueva frase: ");
                    fraseN = scaner.nextLine();
                    servidor.unirFrases(fraseN, cad);
                    System.out.println("--------------------------------------------------");
                }
                case 6 -> {
                    System.out.println("--------------------------------------------------");
                    System.out.println("INFO: EL CARACTER QUE USTED INGRESE, SERA");
                    System.out.println("REEMPLAZADO EN TODAS LAS VOCALES 'A' EXISTENTES");
                    System.out.println("--------------------------------------------------");
                    System.out.print("Ingrese un caracter: ");
                    letra2 = scaner.next().charAt(0);
                    servidor.reemplazar(letra2, cad);
                }
                case 7 -> {
                    System.out.println("--------------------------------------------------");
                    System.out.println("INFO: DEBE DE INGRESAR UNA LETRA, SI EL RESULTADO");
                    System.out.println("ES 'TRUE' ES PORQUE SI SE ENCUENTRA, SI DEVUELVE");
                    System.out.println("'FALSE' ES PORQUE LA LETRA NO HA SIDO ENCONTRADA");
                    System.out.println("--------------------------------------------------");
                    System.out.print("Ingrese una letra: ");
                    letra2 = scaner.next().charAt(0);
                    conf = servidor.contiene(letra2, cad);
                    System.out.println("--------------------------------------------------");
                    System.out.println("    RESULTADO: " + conf);
                }
                case 8 -> {
                }
                default -> {
                    System.out.println("--------------------------------------------------");
                    System.out.println("     OPCION NO ENCONTRADA, INTENTELO DE NUEVO");
                }
            }
        } while (opc != 8);
    }
    
}
