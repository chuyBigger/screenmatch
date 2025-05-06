package com.aluracursos.screenmatch.modelos;

public record TituloOmdb(String title, String year, String Runtime) {
    @Override
    public String toString() {
        return "Nombre: " + title + '\n' +
                "Año Lanzamiento: '" + year + '\n' +
                "Duracion: " + Runtime ;
    }
}
