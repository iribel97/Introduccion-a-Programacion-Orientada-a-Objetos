/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import Entidades.Matemáticas;
import Servicios.ServerMatematicas;

/**
 *
 * @author irina
 */
public class Ejercicio9 {

    /*
    Realizar una clase llamada Matemática que tenga como atributos dos números reales con
    los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
    constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
    Math.random para generar los dos números y se guardaran en el objeto con su
    respectivos set. Deberá además implementar los siguientes métodos:
        a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
        b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
            elevado al menor número. Previamente se deben redondear ambos valores.
        c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
            Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    */
    public static void main(String[] args) {
        // Crear objeto de la clase Matematicas
        Matemáticas math = new Matemáticas();
        //Genera numeros aleatorios
        math.setNum1((Math.random()*10));
        math.setNum2((Math.random()*10));
        //Visualizar los dos numeros
        System.out.println("--------------------------------------------------");
        System.out.println("             LOS NUMEROS GENERADOS SON            ");
        System.out.println("--------------------------------------------------");
        System.out.println("   Numero 1: " + math.getNum1());
        System.out.println("   Numero 2: " + math.getNum2());
        //Crear objeto servidor
        ServerMatematicas server = new ServerMatematicas();
        System.out.println("--------------------------------------------------");
        System.out.println("   El numero mayor es: " + server.devolverMayor(math));
        server.calcularPotencia(math);
        server.calcularRaiz(math);
        
    }
    
}
