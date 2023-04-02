/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


/**
 *
 * @author irina
 */
public class Libro extends Autor implements Comparable<Libro>{
    private String nombreL;
    private int cantPag;
    private String generoL;
    
    //Precio en dolares
    private double precio;
    
    //Por si pertenece a alguna saga
    private boolean perteneceSerie;
    private String nombreSerie;
    private int numLibro;
    
    //Stock del libro
    private int cantLib;
    

    public Libro() {
        super();
    }
    //Constructor para el libro que no contenga saga
    public Libro(String nombreL, int cantPag, String generoL, double precio, boolean  perteneceSerie, int cantLib, String nombreA) {
        super(nombreA);
        this.nombreL = nombreL;
        this.cantPag = cantPag;
        this.generoL = generoL;
        this.precio = precio;
        this.perteneceSerie = perteneceSerie;
        this.cantLib = cantLib;
    }
   //Constructor para el libro que si contenga una saga

    public Libro(String nombreL, int cantPag, String generoL, double precio, 
            boolean perteneceSerie, String nombreSerie, int numLibro, int cantLib, String nombreA) {
        super(nombreA);
        this.nombreL = nombreL;
        this.cantPag = cantPag;
        this.generoL = generoL;
        this.precio = precio;
        this.perteneceSerie = perteneceSerie;
        this.nombreSerie = nombreSerie;
        this.numLibro = numLibro;
        this.cantLib = cantLib;
    }
    //Metodos Getter y Setter
    
    /*NOMBRE DEL LIBRO*/
    public String getNombreL() {
        return nombreL;
    }
    
    public void setNombreL(String nombreL) {
        this.nombreL = nombreL;
    }
    
    /*CANTIDAD DE PAGINAS*/
    public int getCantPag() {
        return cantPag;
    }

    public void setCantPag(int cantPag) {
        this.cantPag = cantPag;
    }
    
    /*GENERO LITERARIO*/
    public String getGeneroL() {
        return generoL;
    }

    public void setGeneroL(String generoL) {
        this.generoL = generoL;
    }

    /*PRECIO DEL LIBRO EN DOLARES*/
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /*PERTENECE A UNA SERIE*/
    public boolean isPerteneceSerie() {
        return perteneceSerie;
    }

    public void setPerteneceSerie(boolean perteneceSerie) {
        this.perteneceSerie = perteneceSerie;
    }

    /*NOMBRE DE LA SERIE O SAGA*/
    public String getNombreSerie() {
        return nombreSerie;
    }

    public void setNombreSerie(String nombreSerie) {
        this.nombreSerie = nombreSerie;
    }
    
    /*ORDEN DEL LIBRO SEGUN LA SERIE*/
    public int getNumLibro() {
        return numLibro;
    }

    public void setNumLibro(int numLibro) {
        this.numLibro = numLibro;
    }
    
    /*NUMERO DE CANTIDAD DE LIBROS EN STOCK*/
    public int getCantLib() {
        return cantLib;
    }

    public void setCantLib(int cantLib) {
        this.cantLib = cantLib;
    }

    @Override
    public int compareTo(Libro o) {
        return this.nombreL.compareTo(o.nombreL);
    }
    
}
