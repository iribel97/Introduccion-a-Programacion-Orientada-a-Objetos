/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import Entidades.Persona;
import Servidores.ServPersona;

/**
 *
 * @author irina
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear 4 Objetos de tipo Persona
        ServPersona server = new ServPersona();
        //Gradar el resultado del peso de cada persona
        int [] pesoIper = new int[4];
        //Guardar el resultado de mayor de edad
        boolean[] mayorEdad = new boolean[4];
        //como plus, vamos a guardar el nombre de las personas
        String[] nombreP = new String[4];
        //contadores para cada peso
        int contPBajo = 0, contPIdeal = 0, contSP = 0;
        //contador de edades
        int contMayEdad = 0, contMenEdad = 0;
        
        System.out.println("--------------------------------------------------");
        System.out.println("                     PERSONA 1                    ");
        System.out.println("--------------------------------------------------");
        Persona persona1 = server.crearPersona();
        pesoIper[0] = server.calcularIMC(persona1);
        mayorEdad[0] = server.esMayorDeEdad(persona1);
        nombreP[0] = persona1.getNombre();
        System.out.println("--------------------------------------------------");
        System.out.println("                     PERSONA 2                    ");
        System.out.println("--------------------------------------------------");
        Persona persona2 = server.crearPersona();
        pesoIper[1] = server.calcularIMC(persona2);
        mayorEdad[1] = server.esMayorDeEdad(persona2);
        nombreP[1] = persona2.getNombre();
        System.out.println("--------------------------------------------------");
        System.out.println("                     PERSONA 3                    ");
        System.out.println("--------------------------------------------------");
        Persona persona3 = server.crearPersona();
        pesoIper[2] = server.calcularIMC(persona3);
        mayorEdad[2] = server.esMayorDeEdad(persona3);
        nombreP[2] = persona3.getNombre();
        System.out.println("--------------------------------------------------");
        System.out.println("                     PERSONA 4                    ");
        System.out.println("--------------------------------------------------");
        Persona persona4 = server.crearPersona();
        pesoIper[3] = server.calcularIMC(persona4);
        mayorEdad[3] = server.esMayorDeEdad(persona4);
        nombreP[3] = persona4.getNombre();
        System.out.println("--------------------------------------------------");
        System.out.println("                INFORME ESPECIFICO                ");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < 4; i++) {
            System.out.print("    * " + nombreP[i]);
            switch (pesoIper[i]) {
                case -1 -> {
                    System.out.print(" tiene un peso bajo y es");
                    contPBajo++;
                }
                case 0 -> {
                    System.out.print(" tiene un peso ideal y es");
                    contPIdeal++;
                }
                default -> {
                    System.out.print(" tiene un sobre peso y es");
                    contSP++;
                }
            }
            
            if (mayorEdad[i] == true) {
                System.out.print(" mayor de edad");
                contMayEdad++;
            }else{
                System.out.print(" menor de edad");
                contMenEdad++;
            }
            System.out.println("");
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("                  INFORME GENERAL                 ");
        System.out.println("--------------------------------------------------");
        System.out.println("        REFERENTE AL PESO: ");
        //porcentaje del peso
        double porcentPeso;
        
        porcentPeso = (contPBajo * 100)/4;
        System.out.println("* " + contPBajo + " personas con peso bajo, representa el " + porcentPeso + "%");
        porcentPeso = (contPIdeal * 100)/4;
        System.out.println("* " + contPIdeal + " personas con peso ideal, representa el " + porcentPeso + "%");
        porcentPeso = (contSP * 100)/4;
        System.out.println("* " + contSP + " personas con sobre peso, representa el " + porcentPeso + "%");
        System.out.println("        REFERENTE A LA EDAD: ");
        //porcentaje de Edad
        double porcentEdad;
        
        porcentEdad = (contMayEdad * 100)/4;
        System.out.println("* " + contMayEdad + " personas mayores de edad, representa el " + porcentEdad + "%");
        porcentEdad = (contMenEdad * 100)/4;
        System.out.println("* " + contMenEdad + " personas menores de edad, representa el " + porcentEdad + "%");
    }
    
}
