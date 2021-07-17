/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_1;
import java.util.Scanner;


/**
 *
 * @author edwar
 * Realizar un reto donde al ingresar la nota del estudiante se realice lo siguiente:
 * mayor o igual a 3 "gana"
 * mayor o igual a 2.2 "recupera"
 * menor a 2.2 "pierde"
 */
public class Reto_1 {
     public static String evaluar(float nota_final){
         //metodo que recibe un float de la nota del estudiante
    String mensaje=" "; //inicialización de variable     
    if (nota_final>=3){//comparadores de la nota final recibida en el metodo
        mensaje="gana";
    }else if(nota_final>=2.2){
        mensaje="recupera";        
    }else {
        mensaje="pierde";        
    }
    return mensaje;//devuelve el resultado segun la nota del estudiante
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota;//inicializacion de la variable
        Scanner sc = new Scanner(System.in);//objeto llamado sc instanciado para atrapar la entrada del teclado 
        System.out.println("Ingrese la nota del estudiante: ");
        nota = sc.nextFloat();       //atrapa la nota del estudiante
        System.out.println("El estudiante: "+evaluar(nota));//imprime el resultado dependiendo de la nota
    }
    
}
