public class movies {
    String nombre;
    int fechaDeLanzamineto;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int toalDeLasEvaluaciones;

    int getToalDeLasEvaluaciones(){
        return toalDeLasEvaluaciones;
    }

    void muestraFichaTecnica(){
        System.out.println("El Nombre de la pelicula es:" + nombre);
        System.out.println("Su fecha de lanzamiento en el año: " + fechaDeLanzamineto);
        System.out.println("Tiene una duracion de: " + duracionEnMinutos+" minutos");
    }

    void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        toalDeLasEvaluaciones++;

    }
    double calculaMedia(){
        return sumaDeLasEvaluaciones / toalDeLasEvaluaciones;
    }

}
