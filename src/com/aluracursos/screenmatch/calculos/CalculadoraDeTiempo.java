package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.modelos.Series;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.movies;

public class CalculadoraDeTiempo {
    public int getTiempoTotal() {
        return tiempoTotal;
    }

    private int tiempoTotal;

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }


}
