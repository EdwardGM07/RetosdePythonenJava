/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_5;
import java.util.Scanner;
/**
 *
 * @author edwar
 * Crear una encriptación de un mensaje de no mas de 120 caracteres en el cual 
 * se deberá cambiar:
 * los espacios por '-'
 * las letras 'a' por '@' 
 * las letras 'b' por '3'
 * las letras 'o' por '0'
 */
public class Reto_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);//objero llamado sc instanciado para
        //reservar espacio en la memoria y recibir entradas del teclado
        System.out.println("Escriba un texto no mayor a 120 caracteres");
        String mensaje =sc.nextLine(); 
        //guarda en una variable la entrada por teclado
        
        char texto[]= new char[120];//arreglo de tipo caracteres instanciado 
        //para reservar en la memoria 120 caracteres 
        for(int i=0;i<mensaje.length();i++){
            //iterador que convierte el String a un arreglo de caracteres 
            texto[i]=mensaje.charAt(i);
        }
        
        for(int i=0;i<texto.length;i++){
            //iterador para el arreglo de caracteres
            if (texto[i]==' '){
                //comparador que modifica segun la posición del arreglo
                texto[i]='-';
            }else if(texto[i]=='a' || texto[i]=='A'){
                //comparador que modifica segun la posición del arreglo
                texto[i]='@';
            }else if(texto[i]=='b' || texto[i]=='B'){
                //comparador que modifica segun la posición del arreglo
                texto[i]='3';
            }else if(texto[i]=='o' || texto[i]=='O'){
                //comparador que modifica segun la posición del arreglo
                texto[i]='0';
            }
        }
        mensaje="";//se limpia la variable mensaje para almecenar el mensaje cifrado
        for(int i=0;i<texto.length;i++){       
            //iterador que convierte el arreglo de caracteres en String
            mensaje+=texto[i];
        }        
        //imprime el mensaje cifrado
        System.out.println("El texto crifrado es: "+mensaje);
    }
    
}
