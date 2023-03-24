/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class NifServidor {
    
    Scanner scaner = new Scanner(System.in);
    
    protected char[] L = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    /*
    - Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
        corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
        resultado del calculo.
    La letra correspondiente al dígito verificador se calculará a traves de un método que
    funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
    número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
    buscar en un array (vector) de caracteres la posición que corresponda al resto de la
    división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
    */
    
    public NIF crearNif() {
        NIF nif = new NIF();

        System.out.println("--------------------------------------------------");
        System.out.print("   Ingrese el DNI: ");
        nif.setDNI(scaner.nextLong());
        nif.setLetra(designarLetra(nif));

        return nif;
    }
    
    public char designarLetra(NIF n) {
        char Letra;
        int resto;

        resto = (int) (n.getDNI() % 23);

        Letra = L[resto];

        return Letra;
    }
    
    /*
     - Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
        en mayúscula; por ejemplo: 00395469-F).
    */
    
    public void mostrar(NIF nif1){
        //System.out.println(nif1.getDNI() + "-" + nif1.getLetra());
        System.out.println("--------------------------------------------------");
        System.out.print("      CODIGO NIF: ");
        System.out.println(String.format("%08d", nif1.getDNI())+"-"+nif1.getLetra());
    }
}
