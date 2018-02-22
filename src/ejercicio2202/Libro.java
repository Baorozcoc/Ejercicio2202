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
public class Libro {
    private String titulo;
    private int NoPag;
    private int Calificacion;

    private Autor autor;
    
    public Libro(String titulo, int NoPag){
        this.titulo= titulo;
        this.NoPag= NoPag;
    }
    public String getTitulo() {
        return titulo;
    }

    public int getNoPag() {
        return NoPag;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNoPag(int NoPag) {
        this.NoPag = NoPag;
    }

    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }
    
    public Autor getAutor(){
        return autor;
    } 
    
    public void setAutor(Autor autor){
        this.autor = autor;
        
    }
}
