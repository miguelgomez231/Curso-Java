/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculasUtilidades;

import entidades.Peliculas;
import java.util.Comparator;

public class comparador {

    public static Comparator<Peliculas> comparaDuracion = new Comparator<Peliculas>(){
        @Override
        public int compare(Peliculas p1, Peliculas p2) {

          //  return Integer.compare(p1.getDuración(), p2.getDuración());
            return p1.getDuración().compareTo(p2.getDuración());
        }
    };
    
    public static Comparator<Peliculas> comparaTitulo = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas p1, Peliculas p2) {
            return p1.getTilulo().compareTo(p2.getTilulo());
          }
    };
            
            
}
