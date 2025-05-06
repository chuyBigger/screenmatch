package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Series;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.movies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {

        movies miPelicula = new movies("matrix", 1999);
        miPelicula.evalua(9);
        movies otraPelicula = new movies("Trnasformers",2007);
        otraPelicula.evalua(8);
        var rapidosYFuriosos = new movies("Rapidos y furiosos",2002);
        rapidosYFuriosos.evalua(7.9);
        Series casaDragon = new Series("Casa Dragon",2009);
        casaDragon.evalua(8);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(rapidosYFuriosos);
        lista.add(casaDragon);

        for (Titulo item: lista){
            System.out.println(item);
            if(item instanceof movies movie && movie.getClasificacion()>2){
                System.out.println(movie.getClasificacion());
            }

        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antono banderas");
        listaDeArtistas.add("Ricardo Arjona");
        listaDeArtistas.add("Miguel bose");
        listaDeArtistas.add("Alejandra Guzman");

        System.out.println(listaDeArtistas);
        Collections.sort(listaDeArtistas);
        System.out.println("a carai ??????????'"+listaDeArtistas);

        System.out.println("Lista desordenada de peliculas "+ lista);
        Collections.sort(lista);

        System.out.println("Lista ordenada de peliculas "+ lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamineto));

        System.out.println("Lista ordena por fecha: " + lista);

    }
}
