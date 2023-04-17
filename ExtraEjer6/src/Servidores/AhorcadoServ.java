/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidores;

import Clases.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class AhorcadoServ {
    Scanner scaner = new Scanner(System.in);
    /*
    - Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
        Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
        vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
        de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
        máximas, el valor que ingresó el usuario y encontradas en 0.
    */
    public Ahorcado crearJuego(){
        Ahorcado juego = new Ahorcado();
        
        //Pedir al usuario la palabra
        System.out.println("**************************************************");
        System.out.println("               JUGUEMOS AL AHORCADO               ");
        System.out.println("**************************************************");
        System.out.print("   Ingrese una frase o palabra: ");
        String word = scaner.nextLine().toLowerCase();
        
        juego.setPalabra(word.toCharArray());
        juego.setLongitudP(word.length());
        
        System.out.print("   cantidad permitida de intentos: ");
        juego.setCantJugadasMax(scaner.nextInt());
        juego.setCantPalabrasE(0);
        
        return juego;
    }
    
    /*
    - Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
        buscar como se usa el vector.length.
    */
    
    public void longitud(Ahorcado game){
        System.out.println("**************************************************");
        System.out.println("   Longitud de la palabra: ");
        for (int i = 0; i < game.getLongitudP(); i++) {
            if (game.getPalabra()[i] == ' ') {
                System.out.print("  ");
            }else{
                System.out.print("[_]");
            }
            
        }
        System.out.println("");
    }
    
    /*
    - Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
        letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    */
    
    public boolean buscar(char Letra, Ahorcado game){
        boolean encontrado = false;
        
        for (int i = 0; i < game.getLongitudP(); i++) {
            if (game.getPalabra()[i] == Letra) {
                encontrado = true;
                break;
            }
        }
        
        return encontrado;
    }
    
    /*
    - Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
        cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
        devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
        busque una letra que no esté, se le restará uno a sus oportunidades.
    */
    
    public char[] encontradas (char Letra, Ahorcado game){
        char[] palabraN = new char[game.getLongitudP()];
        
        //Llamar funcion buscar para saber si esta o no
        
        boolean find = buscar(Letra,game);
        
        if (game.getCantPalabrasE() == 0) {
            for (int i = 0; i < game.getLongitudP(); i++) {
                if(game.getPalabra()[i] == ' '){
                    palabraN[i] = ' ';
                }else{
                    palabraN[i] = '_';
                }
            }
        }
        
        if (find == true) {
            for (int i = 0; i < game.getLongitudP(); i++) {
                if (Letra == game.getPalabra()[i]) {
                    palabraN[i] = game.getPalabra()[i];
                    game.setCantPalabrasE(game.getCantPalabrasE()+1);
                }else if(game.getPalabra()[i] == ' '){
                    palabraN[i] = ' ';
                }else{
                    palabraN[i] = '_';
                }
            }
        }else{
            game.setCantJugadasMax(game.getCantJugadasMax()-1);
        }
        
        return palabraN;
    }
    
    /*
    - Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    */
    
    public void intentos(Ahorcado game){
        System.out.println("Te quedan " + game.getCantJugadasMax() + " intento/s");
    }
    
    /*
    - Método juego(): el método juego se encargará de llamar todos los métodos
        previamente mencionados e informará cuando el usuario descubra toda la palabra o
        se quede sin intentos. Este método se llamará en el main.
    */
    
    public void juego(Ahorcado game){
        //Primero debe de conocer la cantidad de palabras
        int cantP = 0;
        //contador de intentos repetidos
        int cont55 = 0;
        longitud(game);
        for (int i = 0; i < game.getLongitudP(); i++) {
            if (game.getPalabra()[i] != ' ') {
                cantP++;
            }
        }
        System.out.println(cantP);
        char[] nuevaP;
        char[] nuevaP2 = new char[game.getLongitudP()];
        //inicializar
        for (int i = 0; i < game.getLongitudP(); i++) {
            nuevaP2[i] = '_';
        }
        
        char letter;
        
        do {
            System.out.println("**************************************************");
            System.out.print("   ingrese una letra: ");
            letter = scaner.next().charAt(0);
            nuevaP = encontradas (letter, game);
            cont55 = 0;
            for (int i = 0; i < nuevaP.length; i++) {
                if (letter == nuevaP2[i]) {
                    game.setCantPalabrasE(game.getCantPalabrasE()-1);
                    if (cont55 == 0) {
                        game.setCantJugadasMax(game.getCantJugadasMax()-1);
                    }
                    cont55 ++;
                }
                if (nuevaP2[i] == game.getPalabra()[i]) {
                    nuevaP2[i] = game.getPalabra()[i];
                }else{
                    nuevaP2[i] = nuevaP[i];
                }
            }
            System.out.println("**************************************************");
            for (int i = 0; i < nuevaP.length; i++) {
                if (nuevaP2[i] == ' ') {
                    System.out.print(" ");
                }else{
                    System.out.print("[" + nuevaP2[i] + "]");
                }
            }
            
            System.out.println("");
            intentos(game);
            System.out.println(game.getCantPalabrasE());
            
        } while (game.getCantPalabrasE() < cantP && game.getCantJugadasMax() != 0);
        
        if (game.getCantPalabrasE() == cantP) {
            System.out.println(" HAS GANADO!!!");
        }else{
            System.out.println(" LO SENTIMOS, TUS INTENTOS HAN ACABADO :C");
        }
    }
}
