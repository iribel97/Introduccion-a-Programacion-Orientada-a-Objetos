/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class ServidorCurso {
    Scanner scaner = new Scanner(System.in);
    /*
    método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
    que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
    en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
    nombre de cada alumno.
    */
    public String[] cargarAlumnos(){
        
        
        scaner.nextLine();
        String[] nombreEsts = new String[5];
        System.out.println("--------------------------------------------------");
        System.out.println("         INGRESE NOMBRE DE LOS ESTUDIANTES        ");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < nombreEsts.length; i++) {
            System.out.println(" * ESTUDIANTE # " + (i+1));
            System.out.print("     Nombres: ");
            nombreEsts[i] = scaner.nextLine();
            System.out.println("--------------------------------------------------");
        }
        return nombreEsts;
    }
    
    /*
    Método crearCurso(): el método crear curso, le pide los valores de los atributos al
    usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
    al atributo alumnos
    */
    
    public Curso crearCurso(){
        Curso course = new Curso();
        boolean bandera;
        int contE = 0;
        System.out.println("--------------------------------------------------");
        System.out.println("         INGRESE LA SIGUIENTE INFORMACION         ");
        System.out.println("--------------------------------------------------");
        System.out.print("   Nombre del curso: ");
        course.setNombreCurso(scaner.nextLine());
        System.out.print("   Cantidad de dias por semana: ");
        course.setCantDiasPS(scaner.nextInt());
        System.out.print("   Cantidad de horas por dias: ");
        course.setCantHorasPD(scaner.nextInt());
        scaner.nextLine();
        do {
            if (contE != 0) {
                System.out.println("--------------------------------------------------");
                System.out.println("    JORNADA NO ES RECONOCIDA, INTENTELO DE NUEVO");
                System.out.println("--------------------------------------------------");
            }
            System.out.print("   Jornada (Matutina o Vespertina): ");
            course.setTurno(scaner.nextLine().toLowerCase());
            contE++;
            bandera = "matutina".equals(course.getTurno()) || "vespertina".equals(course.getTurno());
        } while (bandera != true);
        System.out.print("   Precio por hora: ");
        course.setPrecioPH(scaner.nextDouble());
        course.setNombreAlumnos(cargarAlumnos());
        return course;
        
    }
    
    /*
    Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
    en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
    día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
    se repite el encuentro.
    */
    public void calcularGananciaSemanal(Curso curso){
        
        double ganancia;
        
        ganancia = curso.getCantHorasPD() * curso.getPrecioPH() * 5 * curso.getCantDiasPS();
        
        System.out.println("--------------------------------------------------");
        System.out.println(" Las ganancias semanales son: " + ganancia);
        
    }
    
    /*Metodo Mostrar Curso*/
    
    public void mostrarCurso(Curso curso, int numCurso){
        System.out.println("--------------------------------------------------");
        System.out.println("                  CURSO #"+ numCurso);
        System.out.println("--------------------------------------------------");
        System.out.println("   Nombre: " + curso.getNombreCurso());
        System.out.println("   Cantidad de dias por semana: " + curso.getCantDiasPS());
        System.out.println("   Cantidad de horas por dia: " + curso.getCantHorasPD());
        System.out.println("   Jornada: " + curso.getTurno().replace(curso.getTurno().charAt(0),
                curso.getTurno().toUpperCase().charAt(0)));
        System.out.println("   Alumnos: ");
        for (String alumno : curso.getNombreAlumnos()) {
            System.out.println("      - " + alumno);
        }
        calcularGananciaSemanal(curso);
    }
}
