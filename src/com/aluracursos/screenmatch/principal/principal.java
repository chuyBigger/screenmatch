import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendaciones;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Series;
import com.aluracursos.screenmatch.modelos.movies;

import java.util.ArrayList;
import java.util.Arrays;

public class principal {

    public static void main(String[] args) {
        movies miPelicula = new movies("matrix", 1999);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(9.5);
        miPelicula.evalua(8.9);
        miPelicula.evalua(9.1);

        System.out.println(miPelicula.calculaMedia());
        System.out.println(miPelicula.getToalDeLasEvaluaciones());
        System.out.println(miPelicula.getNombre());
        System.out.println(miPelicula.getDuracionEnMinutos());
        System.out.println(miPelicula.getFechaDeLanzamineto());

        Series casaDragon = new Series("Casa Dragon",2009);
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodiosPorTemporada(6);
        casaDragon.setMinutosPorEpisodios(10);
        casaDragon.setMinutosPorTemporada(50);

        movies otraPelicula = new movies("Trnasformers",2007);
        otraPelicula.setDuracionEnMinutos(90);

        System.out.println(casaDragon.getNombre()+ casaDragon.getEpisodiosPorTemporada()+casaDragon.getTemporadas());
        System.out.println(casaDragon.getDuracionEnMinutos());

        CalculadoraDeTiempo calc = new CalculadoraDeTiempo();
        calc.incluye(miPelicula);
        calc.incluye(casaDragon);
        calc.incluye(otraPelicula);

        System.out.println(otraPelicula.getNombre());
        System.out.println(miPelicula.getNombre());
        System.out.println(calc.getTiempoTotal());

        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtra(miPelicula);

        Episodio episodio = new Episodio("eitd");
        episodio.setNumero(1);
        episodio.setNombre("LA casa maestra");
        episodio.setSeries(casaDragon);
        episodio.setTotalVisualizaciones(50);


        filtroRecomendaciones.filtra(episodio);
        var rapidosYFuriosos = new movies("Rapidos y furiosos",2002);
        rapidosYFuriosos.setDuracionEnMinutos(180);

        ArrayList<movies> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista"+ listaDePeliculas.size());
        System.out.println("LA primera pelicula es: "+listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas.toString());

        System.out.println("Tu string de la pelicula: "+listaDePeliculas);











    }
}
