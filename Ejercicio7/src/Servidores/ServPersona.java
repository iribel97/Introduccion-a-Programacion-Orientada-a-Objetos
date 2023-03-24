/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidores;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ServPersona {
    Scanner scaner = new Scanner(System.in);
    
    
    //Metodo crearPersona()
    public Persona crearPersona(){
        int contE = 0;
        char caract;
        boolean bandera;
        Persona per = new Persona();
        System.out.println("--------------------------------------------------");
        System.out.println("      INGRESE LOS SIGUENTES DATOS PERSONALES      ");
        System.out.println("--------------------------------------------------");
        System.out.print("      NOMBRE: ");
        per.setNombre(scaner.next());
        System.out.print("      EDAD: ");
        per.setEdad(scaner.nextInt());
        do {
            if (contE != 0) {
                System.out.println("   CARACTER MAL INGRESADO, INTENTELO NUEVAMENTE");
                System.out.println("--------------------------------------------------");
            }
            System.out.print("      SEXO ('H'= Hombre, 'M' = Mujer, 'O' = Otro): ");
            caract = scaner.next().toUpperCase().charAt(0);
            per.setSexo(caract);
            contE++;
            switch (caract) {
                case 'H', 'M', 'O': 
                    bandera = true;
                    break;
                default: 
                    bandera = false;
            }
        } while (bandera != true);
        System.out.print("      PESO (KG): ");
        per.setPeso(scaner.nextDouble());
        System.out.print("      ALTURA: ");
        per.setAltura(scaner.nextDouble());
        return per;
    }
    
    //Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
        //kg/(altura^2 en mt2)).
    
    public int calcularIMC(Persona persona){
        double pesoI;
        int result;
        
        pesoI = (persona.getPeso())/(Math.pow(persona.getAltura(), 2));
        
        if (pesoI < 20) {
            result = -1;
        }else if (pesoI >= 20 && pesoI <= 25) {
            result = 0;
        }else{
            result = 1;
        }
        
        return result;
    }
    
//    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.
    
    public boolean esMayorDeEdad(Persona persona){
        boolean esMayor;
        esMayor = persona.getEdad() > 17;
        return esMayor;
    }
}
