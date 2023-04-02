/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cliente;
import Entidades.Libro;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author irina
 */
public class Libreria {
    Scanner scaner = new Scanner(System.in);
    
    
    
    Inventario servlib = new Inventario();
    
    
    
    public Cliente pedirInfoCliente(){
        Cliente cliente1 = new Cliente();

        System.out.println("--------------------------------------------------");
        System.out.println("          BIENVENIDA/O A NUESTRA LIBRERIA         ");
        System.out.println("--------------------------------------------------");
        System.out.println(" Por favor ingrese la siguiente informacion: ");
        System.out.print("   - Nombre : ");
        cliente1.setNombreC(scaner.nextLine());
        
        //Va a repetir el tipo de moneda hasta que digite la opcion correcta
        boolean opcCorrecta = true;
        int opc;
        
        do {
            System.out.println("   Tipo de moneda: ");
            System.out.println("     1. Dolares");
            System.out.println("     2. Libras");
            System.out.println("     3. Yenes");
            System.out.println("     4. Euros");
            System.out.print("   - Seleccione una: ");
            opc = scaner.nextInt();
            switch (opc) {
                case 1:
                    cliente1.setTipoMoneda("Dolares");
                    break;
                case 2:
                    cliente1.setTipoMoneda("Libras");
                    break;
                case 3:
                    cliente1.setTipoMoneda("Yenes");
                    break;
                case 4:
                    cliente1.setTipoMoneda("Euros");
                    break;
                default:
                    System.out.println("Opcion no identificada, intentelo nuevamente");
                    opcCorrecta = false;
            }
        } while (opcCorrecta == false);

        System.out.print("   - Ingrese su saldo: ");
        cliente1.setSaldo(scaner.nextDouble());

        return cliente1;
    }

    //Cuanto equivale un dolar a las diferentes tipos de monedas
    public double conversionMoneda(Cliente cliente2) {
        double moneda;
        switch (cliente2.getTipoMoneda()) {
            case "Libras":
                moneda = 0.81;
                break;
            case "Yenes":
                moneda = 132.85;
                break;
            case "Euros":
                moneda = 0.92;
                break;
            default:
                moneda = 1;
        }
        return moneda;
    }

    public void comprarLibros() {
        //Sin Ordenar por nombre del libro
        Libro[] boocks = servlib.biblioteca();
        Arrays.sort(boocks);
        int opc;

        //guardar precio
        double total = 0, preciot;
        //opcion dentro de los casos
        char opcCaso;
        //opcion para todo el menu
        char opcMenu;

        Cliente cliente = pedirInfoCliente();
        do {
            do {
                System.out.println("--------------------------------------------------");
                System.out.println("   BUSCAR UN LIBRO POR: ");
                System.out.println("    1. Autor");
                System.out.println("    2. Genero");
                System.out.println("    3. Numero maximo de paginas");
                System.out.println("    4. Series");
                System.out.println("    5. Libros");
                System.out.println("   Otras opcion: ");
                System.out.println("    6. Salir");
                System.out.println("--------------------------------------------------");
                System.out.print("   ELIJA UNA OPCION: ");
                opc = scaner.nextInt();
                if (opc > 6) {
                    System.out.println("--------------------------------------------------");
                    System.out.println(" OPCION MAL INGRESADA, INTENTELO NUEVAMENTE");
                }

            } while (opc > 6);
            switch (opc) {
                case 1:

                    do {
                        scaner.nextLine();
                        preciot = seleccionPorAutor(cliente, boocks);
                        System.out.println("--------------------------------------------------");
                        total = total + preciot;
                        if (total < cliente.getSaldo()) {
                            System.out.println("Su total hasta el momento es: " + total + "  " + cliente.getTipoMoneda());
                            System.out.print(" Volver al menu de Autores (S/N) ");
                            opcCaso = scaner.next().toLowerCase().charAt(0);
                        } else {
                            total = total - preciot;
                            System.out.println("--------------------------------------------------");
                            System.out.println("SU SALDO ES INSUFICIENTE PARA SEGUIR COMPRANDO");
                            opcCaso = 'n';
                        }

                    } while (opcCaso == 's');

                    break;
                case 2:
                    do {
                        scaner.nextLine();
                        preciot = seleccionPorGenero(cliente, boocks);
                        System.out.println("--------------------------------------------------");
                        total = total + preciot;
                        if (total < cliente.getSaldo()) {
                            System.out.println("Su total hasta el momento es: " + total + "  " + cliente.getTipoMoneda());
                            System.out.print(" Volver al menu de Generos Literarios (S/N) ");
                            opcCaso = scaner.next().toLowerCase().charAt(0);
                        } else {
                            total = total - preciot;
                            System.out.println("--------------------------------------------------");
                            System.out.println("SU SALDO ES INSUFICIENTE PARA SEGUIR COMPRANDO");
                            opcCaso = 'n';
                        }

                    } while (opcCaso == 's');
                    break;
                case 3:
                    do {
                        scaner.nextLine();
                        preciot = seleccionNumMaxPag(cliente, boocks);
                        System.out.println("--------------------------------------------------");
                        total = total + preciot;
                        if (total < cliente.getSaldo()) {
                            System.out.println("Su total hasta el momento es: " + total + "  " + cliente.getTipoMoneda());
                            System.out.print(" Volver a elegir un numero maximo de paginas (S/N) ");
                            opcCaso = scaner.next().toLowerCase().charAt(0);
                        } else {
                            total = total - preciot;
                            System.out.println("--------------------------------------------------");
                            System.out.println("SU SALDO ES INSUFICIENTE PARA SEGUIR COMPRANDO");
                            opcCaso = 'n';
                        }

                    } while (opcCaso == 's');
                    break;
                case 4:
                    scaner.nextLine();
                    do {
                        preciot = seleccionSerie(cliente, boocks);
                        System.out.println("--------------------------------------------------");
                        total = total + preciot;
                        if (total < cliente.getSaldo()) {
                            System.out.println("Su total hasta el momento es: " + total + "  " + cliente.getTipoMoneda());
                            System.out.print(" Volver al menu de series (S/N) ");
                            opcCaso = scaner.next().toLowerCase().charAt(0);
                        } else {
                            total = total - preciot;
                            System.out.println("--------------------------------------------------");
                            System.out.println("SU SALDO ES INSUFICIENTE PARA SEGUIR COMPRANDO");
                            opcCaso = 'n';
                        }

                    } while (opcCaso == 's');
                    break;
                case 5:
                    scaner.nextLine();
                    do {
                        preciot = seleccionLibro(cliente, boocks);
                        System.out.println("--------------------------------------------------");
                        total = total + preciot;
                        if (total < cliente.getSaldo()) {
                            System.out.println("Su total hasta el momento es: " + total + "  " + cliente.getTipoMoneda());
                            System.out.print(" Desea volver al menu por libro (S/N) ");
                            opcCaso = scaner.next().toLowerCase().charAt(0);
                        } else {
                            total = total - preciot;
                            System.out.println("--------------------------------------------------");
                            System.out.println("SU SALDO ES INSUFICIENTE PARA SEGUIR COMPRANDO");
                            opcCaso = 'n';
                        }

                    } while (opcCaso == 's');
                    break;
                case 6:
                    opcMenu = 's';
                    break;
                

            }
            if (opc != 6) {
                if (total < cliente.getSaldo()) {
                    System.out.println("--------------------------------------------------");
                    System.out.print("   DESEA FINALIZAR SU COMPRA? (S/N): ");
                    opcMenu = scaner.next().toLowerCase().charAt(0);
                } else {
                    opcMenu = 's';
                }
            } else {
                opcMenu = 's';
            }
            

        } while (opcMenu == 'n');
        if (total == 0) {
            System.out.println("  LAMENTO MUCHO!! ESPERO Y LA PROXIMA COMPRA LA DISFRUTES");
        }else {
            System.out.println("--------------------------------------------------");
            System.out.println(cliente.getNombreC() + " Su valor a pagar es de: " + total + " " + cliente.getTipoMoneda());
            System.out.println("--------------------------------------------------");
            System.out.print("   Desea Pagar? (S/N) ");
            char opcFinal = scaner.next().toLowerCase().charAt(0);
            if (opcFinal == 's') {
                System.out.println("  MUCHAS GRACIAS POR SU COMPRA, AQUI TIENE EL CAMBIO " + (cliente.getSaldo()-total));
            } else {
                System.out.println("  LAMENTO MUCHO!! ESPERO Y LA PROXIMA COMPRA LA DISFRUTES");
            }
        }


    }

    //--------------------------------------------------------------------------
    //CASO 1
    public double seleccionPorAutor(Cliente cliente3, Libro[] libros) {
        double precio1;
        boolean bandera1;
        String nombre;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("                      AUTORES                     ");
            System.out.println("--------------------------------------------------");
            //Llamar funcion
            mostrarAutores(libros);
            System.out.println("   Otras opcion: ");
            System.out.println("    - Salir");
            System.out.println("--------------------------------------------------");
            System.out.print("   digite la opcion: ");

            nombre = scaner.nextLine().toLowerCase();

            //Llamar funcion
            bandera1 = verificarNombreA(libros, nombre);
            if (bandera1 == false) {
                System.out.println("  Autor no encontrado, intentelo de nuevo.");
            }
        } while (bandera1 == false);
        if (!nombre.equals("salir")) {
            //Llamar funcion
            mostrarAutor(libros, nombre);

            /*Mostrar los libros del autor------------------------------------------*/
            //contar cuantos libros tiene el autor
            int contLib = 0;
            for (Libro libro : libros) {
                if (libro.getCantLib() != 0) {
                    if (libro.getNombreA().toLowerCase().equals(nombre)) {
                        contLib++;
                    }
                }   
            }
            //Vector que guarde las posiciones
            int[] ubicacionLib = new int[contLib];
            //Mostrar libros y guardar posicion
            //variable usaba solo para mostrar opcion
            int opcion = 0;
            System.out.println("   NOMBRE DEL LIBRO   |->|   CANTIDAD PAGINAS   |->|   PRECIO   |->|   STOCK");
            for (int i = 0; i < libros.length; i++) {
                if (libros[i].getCantLib() != 0) {
                    if (libros[i].getNombreA().toLowerCase().equals(nombre)) {
                        ubicacionLib[opcion] = i;
                        System.out.println("   " + (opcion + 1) + ".- " + libros[i].getNombreL()
                                + "   |->| " + libros[i].getCantPag()
                                + "   |->| " + (libros[i].getPrecio() * conversionMoneda(cliente3))
                                + "   |->| " + libros[i].getCantLib());
                        opcion++;

                    }
                }
            }
            System.out.println("   " + (opcion + 1) + ".- Volver al menu");
            System.out.println("--------------------------------------------------");
            System.out.print("    Elija una opcion: ");
            //Opcion elegido por el usuario
            int opcUsu = scaner.nextInt();
            precio1 = ObtenerPrecio(opcUsu, opcion, ubicacionLib, libros, cliente3);
        }else{
            precio1 = 0;
        }
        
        
        return precio1;
    }
    //Imprimir los autores que estan disponibles
    public void mostrarAutores(Libro[] libro){
        Set<String> autores = new HashSet<>();
        for (Libro libro1 : libro) {
            if (libro1.getCantLib() != 0) {
                autores.add(libro1.getNombreA());
            } 
        }
        Set<String> setOrdenado = new TreeSet<>(autores);
        for (String autor : setOrdenado) {
            System.out.println("   - "+autor);
        }
    }
    
    //Verificar si el usuario escribio bien el nombre
    public boolean verificarNombreA(Libro[] libro, String nom){
        boolean bandera = false;
        
        for (Libro libro1 : libro) {
            if (libro1.getNombreA().toLowerCase().equals(nom)) {
                bandera = true;
                break;
            }
        }
        if (nom.equals("salir")) {
            bandera = true;
        }
        
        return bandera;
    }
    
    //Imprimir el nombre que selecciono
    public void mostrarAutor(Libro[] libro, String nom){
        for (Libro libro1 : libro) {
            if (libro1.getNombreA().toLowerCase().equals(nom)) {
                System.out.println("--------------------------------------------------");
                System.out.println("         Libros de " + libro1.getNombreA());
                break;
            }
        }
    }
    
    //--------------------------------------------------------------------------
    //CASO 2
    public double seleccionPorGenero(Cliente cliente3, Libro[] libros){
        double precio2;
        boolean bandera1;
        String generoL;
        
        do {
            System.out.println("--------------------------------------------------");
            System.out.println("                GENEROS LITERARIOS                ");
            System.out.println("--------------------------------------------------");
            //Llamar funcion
            mostrarGeneros(libros);
            System.out.println("   Otras opcion: ");
            System.out.println("    - Salir");
            System.out.println("--------------------------------------------------");
            System.out.print("   digite la opcion: ");
            generoL = scaner.nextLine().toLowerCase();
            //Llamar funcion
            bandera1 = verificarGeneroL(libros, generoL);
            
            if (bandera1 == false) {
                System.out.println("  Genero literario no encontrado, intentelo de nuevo.");
            }
        } while (bandera1 == false);
        if (!generoL.equals("salir")) {
            /*MOSTRAR LOS LIBROS POR GENERO-----------------------------------------*/
            //Contar los libros por genero
            int cont = 0;
            for (Libro libro : libros) {
                if (libro.getCantLib() != 0) {
                    if (libro.getGeneroL().toLowerCase().equals(generoL)) {
                        cont++;
                    }
                }
                
            }
            //guardar la ubicacion de los libros
            int[] ubiLibGenero = new int[cont];

            int opcion = 0;
            System.out.println("   NOMBRE DEL LIBRO   |->|   CANTIDAD PAGINAS   |->|   AUTOR   |->|   PRECIO   |->|   STOCK");
            for (int i = 0; i < libros.length; i++) {
                if (libros[i].getCantLib() != 0) {
                    if (libros[i].getGeneroL().toLowerCase().equals(generoL)) {
                        ubiLibGenero[opcion] = i;
                        opcion++;
                        System.out.println("   " + opcion + ".- " + libros[i].getNombreL()
                                + "   |->| " + libros[i].getCantPag()
                                + "           |->| " + libros[i].getNombreA()
                                + "   |->| " + (libros[i].getPrecio() * conversionMoneda(cliente3))
                                + "   |->| " + libros[i].getCantLib());
                    }
                }
            }
            System.out.println("   " + (opcion + 1) + ".- Volver al menu");
            System.out.println("--------------------------------------------------");
            System.out.print("    Elija una opcion: ");
            //Opcion elegido por el usuario
            int opcUsu = scaner.nextInt();
            precio2 = ObtenerPrecio(opcUsu, opcion, ubiLibGenero, libros, cliente3);
        }else{
            precio2 = 0;
        }

        
        
       
        return precio2;
    }
    
    //Imprimir los generos que estan disponibles
    public void mostrarGeneros(Libro[] libro){
        Set<String> generos = new HashSet<>();
        for (Libro libro1 : libro) {
            if (libro1.getCantLib() != 0) {
                generos.add(libro1.getGeneroL());
            }
        }
        Set<String> setOrdenado = new TreeSet<>(generos);
        for (String genero : setOrdenado) {
            System.out.println("   - "+genero);
        }
    }
    
    //Verificar si el genero literario escribio bien el nombre
    public boolean verificarGeneroL(Libro[] libro, String nom){
        boolean bandera = false;
        
        for (Libro libro1 : libro) {
            if (libro1.getGeneroL().toLowerCase().equals(nom)) {
                bandera = true;
                break;
            }
        }
        if (nom.equals("salir")) {
            bandera = true;
        }
        
        return bandera;
    }
    
    //--------------------------------------------------------------------------
    //CASO 3
    public double seleccionNumMaxPag(Cliente cliente3, Libro[] libros){
        int max;
        
        System.out.println("--------------------------------------------------");
        System.out.print("  Ingrese un maximo de pagina: ");
        max = scaner.nextInt();
        System.out.println("--------------------------------------------------");
        System.out.println("     SEGUN LO INGRESADO, ESTE ES EL RESULTADO");
        System.out.println("--------------------------------------------------");
        /*MOSTRAR LOS LIBROS POR MAXIMO DE PAGINA-----------------------------------------*/
        //Contar los libros por maximo de paginas
        int cont = 0;
        for (Libro libro : libros) {
            if (libro.getCantLib() != 0) {
                if (libro.getCantPag() <= max) {
                    cont++;
                }
            }
        }
        //guardar la ubicacion de los libros
        int[] ubiMaxPag = new int[cont];
        int opcion = 0;
        System.out.println("   NOMBRE DEL LIBRO   |->|   CANTIDAD PAGINAS   |->|   AUTOR   |->|   PRECIO   |->|   STOCK");
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getCantLib() != 0) {
                if (libros[i].getCantPag() <= max) {
                    ubiMaxPag[opcion] = i;
                    opcion++;
                    System.out.println("   " + opcion + ".- " + libros[i].getNombreL()
                            + "   |->| " + libros[i].getCantPag()
                            + "           |->| " + libros[i].getNombreA()
                            + "   |->| " + (libros[i].getPrecio() * conversionMoneda(cliente3))
                            + "   |->| " + libros[i].getCantLib());
                }
            }
            
        }
        
        System.out.println("   "+(opcion+1) + ".- Volver al menu");
        System.out.println("--------------------------------------------------");
        System.out.print("    Elija una opcion: ");
        //Opcion elegido por el usuario
        int opcUsu = scaner.nextInt();
        
        return ObtenerPrecio(opcUsu, opcion, ubiMaxPag, libros, cliente3);
    }
    
    //--------------------------------------------------------------------------
    //CASO 4
    public double seleccionSerie(Cliente cliente3, Libro[] libros){
        double precio4;
        boolean bandera1;
        String serieE;
        do {
            System.out.println("--------------------------------------------------");
            System.out.println("                      SERIES                      ");
            System.out.println("--------------------------------------------------");
            //Llamar funcion
            mostrarSeries(libros);
            
            System.out.println("   Otra opcion: ");
            System.out.println("    - Salir");
            System.out.println("--------------------------------------------------");
            System.out.print("   digite la opcion: ");
            serieE = scaner.nextLine().toLowerCase();
            //Llamar funcion
            bandera1 = verificarSerie(libros, serieE);
             if (bandera1 == false) {
                System.out.println("  Serie no encontrada, intentelo de nuevo.");
            }
        } while (bandera1 == false);
        if (!serieE.equals("salir")) {
            /*MOSTRAR LOS LIBROS POR SERIE-----------------------------------------*/
            System.out.println("--------------------------------------------------");
            System.out.println("     ESTAS SON LAS SERIES CON LAS QUE CONTAMOS    ");
            System.out.println("--------------------------------------------------");
            //Contar los libros por genero
            int cont = 0;
            for (Libro libro : libros) {
                if (libro.getCantLib() != 0) {
                    if (libro.isPerteneceSerie() == true) {
                        if (libro.getNombreSerie().toLowerCase().equals(serieE)) {
                            cont++;
                        }
                    }
                }
            }
            //guardar la ubicacion de los libros
            int[] ubiLibSerie = new int[cont];
            int opcion = 0;
            System.out.println("   ORDEN DE LECTURA   |->|   NOMBRE DEL LIBRO   |->|   CANTIDAD PAGINAS   |->|   AUTOR   |->|   PRECIO   |->|   STOCK");
            for (int i = 0; i < libros.length; i++) {
                if (libros[i].getCantLib() != 0) {
                    if (libros[i].isPerteneceSerie() == true) {
                        if (libros[i].getNombreSerie().toLowerCase().equals(serieE)) {
                            ubiLibSerie[opcion] = i;
                            opcion++;
                            System.out.println("   " + libros[i].getNumLibro() 
                                    + "           |->|   " + libros[i].getNombreL()
                                    + "   |->| " + libros[i].getCantPag()
                                    + "           |->| " + libros[i].getNombreA()
                                    + "   |->| " + (libros[i].getPrecio() * conversionMoneda(cliente3))
                                    + "   |->| " + libros[i].getCantLib());
                        }
                    }
                }
            }
            System.out.println("   " + (opcion + 1) + ".- Volver al menu");
            System.out.println("--------------------------------------------------");
            System.out.print("    Elija una opcion: ");
            //Opcion elegido por el usuario
            int opcUsu = scaner.nextInt();
            
            precio4 = ObtenerPrecio(opcUsu, opcion, ubiLibSerie, libros, cliente3);
        }else{
            precio4 = 0;
        }

        
        return precio4;
    }
    //Funcion para mostrar las series
    public void mostrarSeries(Libro[] libro){
        Set<String> series = new HashSet<>();
        for (Libro libro1 : libro) {
            if (libro1.isPerteneceSerie() == true && libro1.getCantLib() != 0) {
                series.add(libro1.getNombreSerie());
            }
            
        }
        Set<String> setOrdenado = new TreeSet<>(series);
        for (String serie : setOrdenado) {
            System.out.println("   - "+serie);
        }
    }
    
    //Funcion para comprobar si la serie ingresada si existe
    public boolean verificarSerie(Libro[] libro, String nom){
        boolean bandera = false;
        
        for (Libro libro1 : libro) {
            if (libro1.isPerteneceSerie() == true) {
                if (libro1.getNombreSerie().toLowerCase().equals(nom)) {
                    bandera = true;
                    break;
                }
            }
            
        }
        if (nom.equals("salir")) {
            bandera = true;
        }
        
        return bandera;
    }
    
    //--------------------------------------------------------------------------
    //CASO 5
    public double seleccionLibro(Cliente cliente3, Libro[] libros){
        
        System.out.println("--------------------------------------------------");
        System.out.println("              LOS LIBROS DISPONIBLES              ");
        System.out.println("--------------------------------------------------");
        //Contar los libros para ver si estan disponibles dependiendo de su stock
        int cont = 0;
        for (Libro libro : libros) {
            if (libro.getCantLib() != 0) {
                cont++;
            }
        }
        //guardar la ubicacion de los libros
        int[] ubiLib = new int[cont];
        int opcion = 0;
        System.out.println("   NOMBRE DEL LIBRO   |->|   CANTIDAD PAGINAS   |->|   AUTOR   |->|   PRECIO   |->|   STOCK");
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getCantLib() != 0) {

                ubiLib[opcion] = i;
                opcion++;
                System.out.println("   " + opcion + ".- " + libros[i].getNombreL()
                        + "   |->| " + libros[i].getCantPag()
                        + "           |->| " + libros[i].getNombreA()
                        + "   |->| " + (libros[i].getPrecio() * conversionMoneda(cliente3))
                        + "   |->| " + libros[i].getCantLib());

            }
        }
        System.out.println("   " + (opcion + 1) + ".- Volver al menu");
        System.out.println("--------------------------------------------------");
        System.out.print("    Elija una opcion: ");
        //Opcion elegido por el usuario
        int opcUsu = scaner.nextInt();
        return ObtenerPrecio(opcUsu, opcion, ubiLib, libros, cliente3);
    }
    
    //CODIGO REPETIDO---------------------------------------------------------------------------------------------
    public double ObtenerPrecio(int opcObt, int ubicacion, int[] ubicaciones, Libro[] libroN, Cliente clienteN){
        double precioObt;
        
        if (opcObt < (ubicacion+1)) {
            //Variable que guarde posicion seleccionada
            int ubiActual = ubicaciones[opcObt-1];
            //Cuantos desea comprar
            System.out.print("    Cuantos desea comprar? ");
            int cantL = scaner.nextInt();
            //Calcular el precio
            precioObt = libroN[ubiActual].getPrecio() * conversionMoneda(clienteN) * cantL;
            //Mermar el stock
            libroN[ubiActual].setCantLib((libroN[ubiActual].getCantLib()) - cantL);
        }else{
            precioObt = 0;
        }
        
        return precioObt;
    }
}
