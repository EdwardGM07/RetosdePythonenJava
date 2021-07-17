/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_4;

import java.util.Random;

/**
 *
 * @author edwar
 * El concecionario AutosNuevos necesita para su compañia crear un sistema 
 * que les permita crear la placa para que sus clientes puedan transitar en las 
 * calles, por lo tanto es necesario crear una placa que contenga 
 * 3 letras mayusculas y 3 numeros como en el siguiente ejemplo:
 * GSR012
 */
public class Reto_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();//obje4to llamado r para hacer un random
        char array[] = new char[6];//arreglo de caracteres intanciado con una 
        //reserva en la memoria de 6 caracteres
 
 
        for(int i=0; i<3; i++) {
            //iterador que que crea 3 letras aletorias
            int valorLetra = (r.nextInt(25)+97);
            array[i] = (char) Character.toUpperCase(valorLetra);
        }
        for(int i=3; i<6; i++){
            //iterador que crea 3 numeros aletorios de 0 a 9
            int valorNumero = (int) (Math.random()*9);
            array[i] = (char)(valorNumero+'0');
        }        
        for(int i=0; i<6; i++){
               //iterador que imprime la placa para el vehiculo            
            System.out.print(array[i]+"");
        }
        System.out.println(""); 
     
    }
    
}
