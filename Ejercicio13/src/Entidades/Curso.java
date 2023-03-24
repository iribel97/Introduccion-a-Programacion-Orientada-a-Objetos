/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author irina
 */
public class Curso {
     /*
    Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
    programa para organizar la información de cada curso. Para ello, crearemos una clase
    entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
    cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
    alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
    nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
    */
    private String nombreCurso;
    private int cantHorasPD;
    private int cantDiasPS;
    private String turno; // dia o vespertina
    private double precioPH;
    private String[] nombreAlumnos = new String[5];
    
    // Un constructor por defecto.
    
    public Curso() {
    }
    
    // Un constructor con todos los atributos como parámetro.

    public Curso(String nombreCurso, int cantHorasPD, int cantDiasPS, String turno, double precioPH) {
        this.nombreCurso = nombreCurso;
        this.cantHorasPD = cantHorasPD;
        this.cantDiasPS = cantDiasPS;
        this.turno = turno;
        this.precioPH = precioPH;
    }
    
    // Métodos getters y setters de cada atributo.

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantHorasPD() {
        return cantHorasPD;
    }

    public void setCantHorasPD(int cantHorasPD) {
        this.cantHorasPD = cantHorasPD;
    }

    public int getCantDiasPS() {
        return cantDiasPS;
    }

    public void setCantDiasPS(int cantDiasPS) {
        this.cantDiasPS = cantDiasPS;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPH() {
        return precioPH;
    }

    public void setPrecioPH(double precioPH) {
        this.precioPH = precioPH;
    }

    public String[] getNombreAlumnos() {
        return nombreAlumnos;
    }

    public void setNombreAlumnos(String[] nombreAlumnos) {
        this.nombreAlumnos = nombreAlumnos;
    }
    
}
