package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendaciones {
    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Esta Pelicula cuenta con unas exelentes reseñas");
        } else if (clasificacion.getClasificacion() == 3) {
            System.out.println("Esta pelicula tiene una clasificacion promdio");
        } else {
            System.out.println("ponla para ver despues");
        }
    }
}
