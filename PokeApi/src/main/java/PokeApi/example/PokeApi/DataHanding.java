package PokeApi.example.PokeApi;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class DataHanding {

    private final static String url = "https://pokeapi.co/api/v2/%s/%s";

    public Pokemon obtenerPokemon(Parametro params)
    {

        Pokemon pokemon = null;

        String peopleUrl = String.format(url, params.getParameter1(), params.getParameter2());

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(peopleUrl))
                    .GET()
                    .build();

            HttpResponse<String> response = HttpClient
                    .newBuilder()
                    .build()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String jsonData = response.body();

            Gson gson = new Gson();
            pokemon = gson.fromJson(jsonData, Pokemon.class);

        } catch (URISyntaxException e) {
            System.out.println("Error al crear la request: " + e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        return pokemon;
    }

    public Tipo obtenerTipo(Parametro params)
    {

        Tipo tipo = null;

        String peopleUrl = String.format(url, params.getParameter1(), params.getParameter2());

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(peopleUrl))
                    .GET()
                    .build();

            HttpResponse<String> response = HttpClient
                    .newBuilder()
                    .build()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String jsonData = response.body();

            Gson gson = new Gson();
            tipo = gson.fromJson(jsonData, Tipo.class);

        } catch (URISyntaxException e) {
            System.out.println("Error al crear la request: " + e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        return tipo;
    }

}
