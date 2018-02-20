/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author colsam-16
 */
public class Netflix {
    private ArrayList<peliculas> listadepeliculas = new ArrayList<> ();

    public Netflix() {
    }
   public void aggPelicula(peliculas p){
       listadepeliculas.add(p);
}
   public void eliminarPelicula(peliculas p){
       listadepeliculas.remove (p);
   }
   public void mostrarLista(){
       Iterator<peliculas> elemento = listadepeliculas.iterator();
       while(elemento.hasNext()){
           peliculas p = elemento.next();
           System.out.println(p.toString());
       }
           }
}
