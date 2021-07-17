/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_3;
import java.util.Scanner;

/**
 *
 * @author edwar
 * Se ha logrado identificar, que los hackers al momento de inscribirse en la plataforma utilizan
contraseñas a partir de datos adquiridos del usuario por ejemplo número de cedula
combinado con el nombre, contraseñas solo numéricas como por ejemplo 123456789 y
nombre de mascotas e hijos.
Es por esto por lo que Min Tic te pide que hagas el siguiente programa para evitar futuros
ataques y todos estemos más seguros.
Tienes que hacer un programa que valide una contraseña segura por tal motivo tienes que
cumplir con los siguientes requisitos:
• La contraseña debe tener al menos 6 caracteres
• La contraseña debe tener máximo 12 caracteres
• debe contener letras minúsculas
• debe contener al menos unas mayúsculas
• debes tener al menos un número
• debes tener al menos 1 carácter no alfanumérico.
• no puede contener espacios en blanco.
• debe tener al menos un “#”
 */
public class Reto_3 {

    public static String clave_segura(String clave) {
        String mensaje="";
        boolean letra_minuscula = false;
        boolean letra_mayuscula = false;
        boolean digito = false;
        boolean numeral = false;
        boolean noalfanumerico = false;
        boolean espacio = true;
        //inicialización de variables 
        
        if (clave.length() > 5 && clave.length() < 13) {
            //comparador que hace cumplir la condición de longitud
            int longitud=clave.length();  
            //creación de una variable de longitud
            for (int i = 0; i < longitud; i++) {
                //iterador de la clave
                
                if (Character.isLowerCase(clave.charAt(i))) {
                    //comparador para saber si es minuscula
                    letra_minuscula = true;
                }
                if (Character.isUpperCase(clave.charAt(i))) {
                    //comparador para saber si es mayuscula
                    letra_mayuscula = true;
                }
                if (Character.isDigit(clave.charAt(i))) {
                    //comparador para saber si es un número
                    digito = true;
                }
                if (!Character.isLetterOrDigit(clave.charAt(i))) {
                    //comparador para saber si es un no alfanumerico
                    noalfanumerico = true;
                }
                if (Character.isSpaceChar(clave.charAt(i))) {
                    //comparador para saber si tiene un espacio
                    espacio = false;
                }
                if (clave.charAt(i) == '#') {
                    //comparador para saber si tiene un numeral
                    numeral = true;
                }
            }
            if (letra_minuscula==true && letra_mayuscula==true && digito==true && 
                    noalfanumerico==true && espacio==true && numeral==true){
                //comparador que verifica que se cumplan todas la condiciones
                mensaje="CORRECTO";
            }else{
                mensaje="INCORRECTO";
            }          
        }

        return mensaje;//devuelve el resultado para la clave si es correcta o incorrecta
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);//objeto llamado sc que instancia un espacio en la memoria
        //para entrada del teclado
        System.out.println("""
                           Escriba su clave para saber si es segura
                           -- el sistema arrojara 'CORRECTO' si es segura o 'Incorrecto' si es insegura--""");
        String clave= sc.nextLine();//lee la entrada del teclado del usuario
        System.out.println(clave_segura(clave));//imprime el resultado
    }

}
