package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.excepcion.ErrorEnConversionDeDuracionExeption;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    @SerializedName("Title")
    private String nombre;
    @SerializedName("Year")
    private int fechaDeLanzamineto;

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre=miTituloOmdb.title();
        this.fechaDeLanzamineto= Integer.valueOf(miTituloOmdb.year());
        if (miTituloOmdb.Runtime().contains("N/A")){
            throw new ErrorEnConversionDeDuracionExeption(
                    "No puedo convertir la duracion porque contiene: "
                            +miTituloOmdb.Runtime()
            );
        }
        this.duracionEnMinutos=Integer.valueOf(miTituloOmdb.Runtime().substring(0,3).replace(" ",""));
    }

    @Override
    public String toString() {
        return "Nombre: '" + nombre + '\n' +
                "Fecha De Lanzamineto: " + fechaDeLanzamineto+
                "\nDuracion: "+ duracionEnMinutos+ " Minutos";
    }

    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int toalDeLasEvaluaciones;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamineto(int fechaDeLanzamineto) {
        this.fechaDeLanzamineto = fechaDeLanzamineto;
    }

    public Titulo(String nombre, int fechaDeLanzamineto) {
        this.nombre = nombre;
        this.fechaDeLanzamineto = fechaDeLanzamineto;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public double getSumaDeLasEvaluaciones() {
        return sumaDeLasEvaluaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamineto() {
        return fechaDeLanzamineto;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public int getToalDeLasEvaluaciones(){
        return toalDeLasEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("El Nombre de la pelicula es:" + nombre);
        System.out.println("Su fecha de lanzamiento en el año: " + fechaDeLanzamineto);
        System.out.println("Tiene una duracion de: " + duracionEnMinutos+" minutos");
    }

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        toalDeLasEvaluaciones++;

    }
    public double calculaMedia(){
        return sumaDeLasEvaluaciones / toalDeLasEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {

        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
