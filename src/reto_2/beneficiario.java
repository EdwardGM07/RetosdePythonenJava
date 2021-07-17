/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_2;

/**
 *
 * @author edwar
 */
public class beneficiario {

    private String nombre;
    private String apellido;
    private String nacimiento;
    private String correo;
    private int opcion;

    public beneficiario(String nombre, String apellido, String nacimiento, int opcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.opcion = opcion;
    }

    public beneficiario() {
    }

    @Override
    public String toString() {
        return "beneficiario{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacimiento=" + nacimiento + ", opcion=" + opcion + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public void generar_correo() {
        String nuevo_correo;
        String inicial_apellido = "";
        String inicial_nombre = "";

        switch (opcion) {
            case 1:
                for (int x = 0; x < 1; x++) {
                    inicial_nombre = Character.toString(nombre.charAt(x));
                }
                for (int y = 0; y < 1; y++) {
                    inicial_apellido = Character.toString(apellido.charAt(y));
                }
                nuevo_correo = inicial_nombre + inicial_apellido + "@misiontic.com";
                System.out.println(nuevo_correo.toLowerCase());
                break;
            case 2:

                for (int x = 0; x < 3; x++) {
                    inicial_nombre = inicial_nombre + Character.toString(nombre.charAt(x));
                }
                for (int y = 0; y < 2; y++) {
                    inicial_apellido = inicial_apellido + Character.toString(apellido.charAt(y));
                }
                nuevo_correo = inicial_nombre + inicial_apellido + "@misiontic.com";
                System.out.println(nuevo_correo.toLowerCase());
                break;
            default:
                for (int x = 0; x < 3; x++) {
                    inicial_nombre = inicial_nombre + Character.toString(nombre.charAt(x));
                }
                for (int y = 0; y < 2; y++) {
                    inicial_apellido = inicial_apellido + Character.toString(apellido.charAt(y));
                }
                nuevo_correo = inicial_nombre + inicial_apellido + nacimiento + "@misiontic.com";
                System.out.println(nuevo_correo.toLowerCase());
                break;
        }
    }
}
