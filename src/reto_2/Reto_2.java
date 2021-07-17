/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_2;

import java.util.Scanner;

/**
 *
 * @author edwar
 * Los beneficiarios de la Misión TIC 2022 tendrán cada uno una cuenta de correo para acceder
a la diversidad de recursos y plataformas que se utilizarán dentro del proceso.
Le han solicitado implementar una función tal que a partir de los datos personales del
beneficiario como lo es el nombre, el primer apellido y el año de nacimiento genere un
usuario de correo.
Esta función la utilizará el jefe de sistemas de la misión tic el cual envía los parámetros
necesarios para la generación de la cuenta y a su vez le envía una opción la cual representa
la manera como se debe construir la cuenta, es de aclarar que la opción es un número que
puede ser 1,2 o 3 . A continuación, se comparten los siguientes ejemplos.
Nombre: Mariana
Apellido1: Cardona
Año Nacimiento: 1963
Opción enviada por el jefe es 1:
inicial_nombreinicial_apellido1@misiontic.com
El usuario de correo según la opción 1 sería : mcr@misiontic.com
Opción enviada por el jefe es 2:
primeras_3_letras_nombre.primeras_2_letras_apellido@misiontic.com
El usuario de correo según la opción 2 sería: marca@misiontic.com
Opción enviada por el jefe es 3:
primeras_3_letras_nombre.ultimas_2_letras_apellido.1963@misiontic.com
El usuario de correo según la opción 3 sería: marna1963@misiontic.com
 */
public class Reto_2 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);//objeto llamado sc intanciado para reservar un 
        //espacio en la memoria y atrapar las entradas por el teclado

        System.out.println("Nombre del beneficiario: ");
        String nombre = sc.nextLine();//guarda el nombre en una variable
        System.out.println("Apellido del beneficiario: ");
        String apellido = sc.nextLine();//guarda el apellido en una variable
        System.out.println("Nacimiento del beneficiario: ");
        String nacimiento = sc.nextLine();//guarda el nacimiento en una variable        
        System.out.println("Opción del beneficiario: ");
        String opcion = sc.nextLine();//guarda la opción para crear el correo

        beneficiario ben = new beneficiario(nombre, apellido, nacimiento, Integer.parseInt(opcion));
        //objeto llamado ben en el cual se instancia para reservar espacio en la memoria y enviar 
        //los datos ingresados a la clase beneficiario
        
        System.out.print("el correo es: ");
        ben.generar_correo();//invoca el metodo del objeto para generar el correo

    }

}
