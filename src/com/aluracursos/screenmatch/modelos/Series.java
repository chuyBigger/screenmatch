package com.aluracursos.screenmatch.modelos;

public class Series extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorTemporada;
    private int minutosPorEpisodios;

    public Series(String nombre, int fechaDeLanzamineto) {
        super(nombre, fechaDeLanzamineto);
    }

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodios;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorTemporada() {
        return minutosPorTemporada;
    }

    public void setMinutosPorTemporada(int minutosPorTemporada) {
        this.minutosPorTemporada = minutosPorTemporada;
    }

    @Override
    public String toString() {
        return "Serie: "+ this.getNombre()+"("+this.getFechaDeLanzamineto()+")" ;
    }


}
