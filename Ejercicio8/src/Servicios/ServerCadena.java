/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cadena;

/**
 *
 * @author irina
 */
public class ServerCadena {
    /*
    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
        frase ingresada.
    */
    
    public void mostrarVocales(Cadena cadena){
        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
        char vocal;
        
        for (int i = 0; i < cadena.getTamFrase(); i++) {
            vocal = cadena.getFrase().toLowerCase().charAt(i);
            switch (vocal) {
                case 'a' -> contA++;
                case 'e' -> contE++;
                case 'i' -> contI++;
                case 'o' -> contO++;
                case 'u' -> contU++;
            }
        }
        System.out.println("--------------------------------------------------");
        System.out.println("  SE ENCONTRO:");
        System.out.println("     * Vocal a = " + contA);
        System.out.println("     * Vocal e = " + contE);
        System.out.println("     * Vocal i = " + contI);
        System.out.println("     * Vocal o = " + contO);
        System.out.println("     * Vocal u = " + contU);
        System.out.println("--------------------------------------------------");
    }
    
    /*
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
        ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    */
    
    public void invertirFrase(Cadena cadena){
        char letra;
        String Frase = "";
        for (int i = (cadena.getTamFrase()-1); i >= 0 ; i--) {
            letra = cadena.getFrase().charAt(i);
            Frase = Frase + letra;
            
        }
        System.out.println("--------------------------------------------------");
        System.out.println("                  FRASE INVERTIDA                 ");
        System.out.println("--------------------------------------------------");
        System.out.println(Frase);
    }
    
    /*
    Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
        contabilizar cuántas veces se repite el carácter en la frase,
    */
    public int vecesRepetido(char letter, Cadena cadena){
        int contador = 0;
        char letra3;
        for (int i = 0; i < cadena.getTamFrase(); i++) {
            letra3 = cadena.getFrase().toLowerCase().charAt(i);
            if ( letra3 == letter) {
                contador ++;
            }
        }
        return contador;
    }
    
    /*
    Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    compone la clase con otra nueva frase ingresada por el usuario.
    */
    
    public void compararLongitud(String frase, Cadena cadena){
        int tamanio;
        tamanio = frase.length();
        if (tamanio == cadena.getTamFrase()) {
            System.out.println("--------------------------------------------------");
            System.out.println("        LAS FRASES SON DE LA MISMA LONGITUD       ");
            System.out.println("--------------------------------------------------");
        }else{
            System.out.println("--------------------------------------------------");
            System.out.println("      LAS FRASES NO SON DE LA MISMA LONGITUD      ");
            System.out.println("--------------------------------------------------");
        }
    }
    
    /*
    Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    */
    public void unirFrases(String frase, Cadena cadena){
        String nuevaFrase;
        nuevaFrase = frase.concat(cadena.getFrase());
        System.out.println("--------------------------------------------------");
        System.out.println("                 FRASE RESULTANTE                 ");
        System.out.println("--------------------------------------------------");
        System.out.println("   " + nuevaFrase);
    }
    
    /*
    Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
    la frase resultante.
    */
    
    public void reemplazar(char letra, Cadena cadena){
        char let;
        String nuevaFrase = "";
        for (int i = 0; i < cadena.getTamFrase(); i++) {
            let = cadena.getFrase().charAt(i);
            if (let == 'a' || let == 'A') {
                nuevaFrase = nuevaFrase + letra;
            }else{
                nuevaFrase = nuevaFrase + let;
            }
        }
        System.out.println("--------------------------------------------------");
        System.out.println("                 FRASE RESULTANTE                 ");
        System.out.println("--------------------------------------------------");
        System.out.println("  " + nuevaFrase);
    }
    
    /*
    Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    */
    public boolean contiene(char letter, Cadena cadena){
        boolean bandera = false;
        int contador = 0;
        
        for (int i = 0; i < cadena.getTamFrase(); i++) {
            if(contador == 0){
                if (letter == cadena.getFrase().charAt(i)) {
                    contador++;
                    bandera = true;
                }
            }
        }
        return bandera;
    }
}
