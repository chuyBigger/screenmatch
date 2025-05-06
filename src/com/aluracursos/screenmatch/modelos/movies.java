package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class movies extends Titulo implements Clasificacion {
    private String director;

    public movies(String nombre, int fechaDeLanzamineto) {
        super(nombre, fechaDeLanzamineto);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) calculaMedia() / 2 ;
    }

    @Override
    public String toString() {
        return "Pelicula: "+this.getNombre() +"("+getFechaDeLanzamineto()+")";
    }
}
