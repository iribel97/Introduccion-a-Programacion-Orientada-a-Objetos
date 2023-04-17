/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extraextra2;

import Entidades.Tiempo;
import Servicios.ServTiempo;

/**
 *
 * @author irina
 */
public class ExtraExtra2 {

    /*
    Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
    constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
    además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
    Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
    animas a simular el paso del tiempo en consola??????
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ServTiempo serv = new ServTiempo();
        
        serv.pedirTiempo();
        serv.imprimirHoraCompleta();
    }
    
}
