/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extraejer4;

import Entidades.NIF;
import Servicios.NifServidor;

/**
 *
 * @author irina
 */
public class ExtraEjer4 {

   /*
    Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
    correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
    letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
    - Métodos getters y setters para el número de DNI y la letra.
    - Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
        corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
        resultado del calculo.
    - Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
        en mayúscula; por ejemplo: 00395469-F).
    La letra correspondiente al dígito verificador se calculará a traves de un método que
    funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
    número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
    buscar en un array (vector) de caracteres la posición que corresponda al resto de la
    división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NifServidor serv = new NifServidor();
        
        NIF nif_1 = serv.crearNif();
        
        //serv.mostrar(nif_1);
    }
    
}
