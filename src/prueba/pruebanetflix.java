/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import peliculas.Netflix;
import peliculas.peliculas;

/**
 *
 * @author colsam-16
 */
public class pruebanetflix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       peliculas p1 = new peliculas(1,"Jumanji", 120, "Ficcion");
       peliculas p2 = new peliculas(1,"tabbo", 95, "erotica");
       peliculas p3 = new peliculas(1,"XXX", 118, "accion");       
       peliculas p4 = new peliculas(1,"Hitman", 109, "accion");  
       Netflix n = new Netflix();
       n.aggPelicula(p1);
       n.aggPelicula(p2);
       n.aggPelicula(p3);
       n.aggPelicula(p4);
       n.mostrarLista();
       System.out.print("----------");
       n.eliminarPelicula(p3);
       n.mostrarLista();
       System.out.println("la pelicula: " + p1.getNombre() + " tiene una duracion de " + p1.getDuracion());
       
    }
    
}
