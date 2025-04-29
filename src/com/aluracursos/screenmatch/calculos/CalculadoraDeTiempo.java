package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.modelos.movies;

public class calculadoraDeTiempo {
    private int tiempoTotal;

    public void incluye(movies movie){
        tiempoTotal += movie.getDuracionEnMinutos();
    }
}
