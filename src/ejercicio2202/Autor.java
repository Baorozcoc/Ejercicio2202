/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2202;

/**
 *
 * @author Estudiante
 */
public class Autor {
    private String Nombre;
    private String Apellido;
    private String telefono;

    public Autor(String Nombre, String Apellido, String telefono){
        this.Nombre= Nombre;
        this.Apellido= Apellido;
        this.telefono= telefono;
    }
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
