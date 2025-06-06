package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.excepcion.ErrorEnConversionDeDuracionExeption;
import com.aluracursos.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.google.gson.GsonBuilder;

public class PrincipalConBusquedas {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true){

            System.out.println("Escriba el nombre de la pelicula");
            var busqueda = scanner.nextLine();
            var busquedaIndexada = URLEncoder.encode(busqueda, StandardCharsets.UTF_8.toString());
            String direccion = "https://www.omdbapi.com/?t="+busquedaIndexada+"&apikey=58237260";

            if (busqueda.equalsIgnoreCase("Salir")){
                break;
            }

            try {

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();




                TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);

                Titulo miTitulo = new Titulo(miTituloOmdb);
                System.out.println("Titulo ya convertido: \n"+miTitulo);
                titulos.add(miTitulo);

            } catch (NumberFormatException e){
                System.out.println("Ocurrio un error: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e){
                System.out.println("Ocurrio un error en la URI !Verifique la direccion : ");
                System.out.println(e.getMessage());
            } catch (ErrorEnConversionDeDuracionExeption e){
                System.out.println(e.getMessage());
            } catch (Exception e){
                System.out.println("tienes un error sin catch!!!!!!!!!!!!!!!!!");
            }
        }
        System.out.println(titulos);

        FileWriter escritura = new FileWriter("titulos.json");
        escritura.write(gson.toJson(titulos));
        escritura.close();

        System.out.println("Finalizo la ejecucion del sistema...");



    }
}
