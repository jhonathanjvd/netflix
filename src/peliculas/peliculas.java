package peliculas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author colsam-16
 */
public class peliculas {
    private int codigo;
    private String nombre;
    private int duracion;
    private String genero;

    public peliculas() {
    }

    public peliculas(int codigo, String nombre, int duracion, String genero) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "peliculas{" + "codigo=" + codigo + ", nombre=" + nombre + ", duracion=" + duracion + ", genero=" + genero + '}';
    }
        
}
