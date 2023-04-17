/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Pass;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ServPass {

    Scanner scaner = new Scanner(System.in);
    /*
     ● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
            teclado)
     */
    Pass usuario = new Pass("Password12", "Irina Ochoa", 1234567);

    /*
    ● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
            validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
            Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
     */
    public void crearPass(String contra) {
        if (contra.length() == 10) {
            usuario.setPass(contra);
            System.out.println("SU CONTRASEÑA FUE CAMBIADA CON EXITO");
        } else {
            System.out.println("LA CONTRASEÑA NO CUMPLE LOS REQUISITOS");
        }
    }

    /*
     ● Crear un método para analizar la contraseña(analizarPass). Donde:
                o SI Existe al menos una letra z : Es nivel MEDIO
                o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
                o Si ninguna condición se cumple es nivel BAJO
     */
    public void analizarPass(String contra) {
        //booleano para que compruebe que exista z
        boolean z = false;
        //contador para la cantidad de vocales a
        int contA = 0;
        //variable tipo char que guarde caracter por caracter de la contraseña en el for
        char letra;

        for (int i = 0; i < usuario.getPass().length(); i++) {
            letra = usuario.getPass().toLowerCase().charAt(i);
            if (letra == 'z') {
                z = true;
            }
            if (letra == 'a') {
                contA++;
            }
        }

        if (z && contA >= 2) {
            System.out.println("       Es nivel ALTO");
        } else if (z) {
            System.out.println("       Es nivel MEDIO");
        } else {
            System.out.println("       Es nivel BAJO");
        }
    }

    /*
    ● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
            debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
            acceso a modificar los datos.
     */
    //METODO PARA MODIFICAR EL NOMBRE  
    public void modificarNombre(boolean bandera) {

        if (bandera) {
            System.out.println("--------------------------------------------------");
            System.out.println("    CONTRASEÑA CORRECTA, PUEDE CAMBIAR SU NOMBRE    ");
            System.out.println("--------------------------------------------------");
            System.out.print("     NOMBRE: ");
            usuario.setNombre(scaner.nextLine());

        } else {
            System.out.println("--------------------------------------------------");
            System.out.println("  CONTRASEÑA INCORRECTA, NO PUEDE CAMBIAR SU NOMBRE ");
            System.out.println("--------------------------------------------------");
        }
    }

    //METODO PARA MODIFICAR EL DNI
    public void modificarDNI(boolean bandera) {

        if (bandera) {
            System.out.println("--------------------------------------------------");
            System.out.println("      CONTRASEÑA CORRECTA, PUEDE CAMBIAR SU DNI     ");
            System.out.println("--------------------------------------------------");
            System.out.print("     DNI: ");
            usuario.setDni(scaner.nextInt());

        } else {
            System.out.println("--------------------------------------------------");
            System.out.println("   CONTRASEÑA INCORRECTA, NO PUEDE CAMBIAR SU DNI   ");
            System.out.println("--------------------------------------------------");
        }
    }

    /*
    ● A través de un menú de opciones:
                o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
                    contraseña valida).
                o B) Mensaje al usuario que tipo de NIVEL es su contraseña
                o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
                    dar permiso
                o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
                    SINO impedir cambios
                o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
                    SINO impedir cambios
     */
    public void opciones() {
        /*
        Variable que guarde la contraseña que digite el usuario
        y luego que sea usada para verificar con la que se definio al inicio
         */
        String pass;
        //Variable que escoja la opcion
        char opcM;
        
        //VARIABLE PARA LAS OPCIONES
        String contraN;

        System.out.println("--------------------------------------------------");
        System.out.println("                BIENVENIDO USUARIO                ");
        System.out.println("--------------------------------------------------");
        System.out.print("   INGRESE SU CONTRASEÑA: ");
        pass = scaner.nextLine();
        if (pass.equals(usuario.getPass())) {
            do {
                System.out.println("--------------------------------------------------");
                System.out.println("         " + usuario.getNombre() + ", BIENVENIDO/A");
                System.out.println("--------------------------------------------------");
                System.out.println("   A) CAMBIAR CONTRASEÑA");
                System.out.println("   B) VER NIVEL DE LA CONTRASEÑA");
                System.out.println("   C) MODIFICAR NOMBRE");
                System.out.println("   D) MODIFICAR DNI");
                System.out.println("   E) SALIR");
                System.out.println("--------------------------------------------------");
                System.out.print("   SELECCIONE UNA OPCION: ");
                opcM = scaner.next().toUpperCase().charAt(0);
                switch (opcM) {
                    case 'A':
                        scaner.nextLine();
                        System.out.println("--------------------------------------------------");
                        System.out.print("    INGRESE SU NUEVA CONTRASEÑA: ");
                        contraN = scaner.nextLine();
                        crearPass(contraN);
                        break;
                    case 'B':
                        analizarPass(usuario.getPass());
                        break;
                    case 'C':
                        scaner.nextLine();
                        System.out.println("--------------------------------------------------");
                        System.out.print("   INGRESE DE NUEVO SU CONTRASEÑA: ");
                        String pass1 = scaner.nextLine();
                        boolean flag = pass1.equals(usuario.getPass());
                        modificarNombre(flag);
                        break;
                    case 'D':
                        scaner.nextLine();
                        System.out.println("--------------------------------------------------");
                        System.out.print("   INGRESE DE NUEVO SU CONTRASEÑA: ");
                        String pass2 = scaner.nextLine();
                        boolean flag1 = pass2.equals(usuario.getPass());
                        modificarDNI(flag1);
                    case 'E':
                        break;
                    default:
                        System.out.println("INGRESE UNA OPCION VALIDA");
                }
            } while (opcM != 'E');
        }else{
            System.out.println("--------------------------------------------------");
            System.out.println("                CONTRASEÑA INCORRECTA               ");
            System.out.println("--------------------------------------------------");
        }

    }

}
