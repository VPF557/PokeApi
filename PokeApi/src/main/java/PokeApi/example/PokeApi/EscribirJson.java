package PokeApi.example.PokeApi;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class EscribirJson {
    static void escribirJsonPokemon(ArrayList<Pokemon> listaPokemon)
    {

        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter("pokemons.json")) {
            gson.toJson(listaPokemon, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void escribirJsonPeticiones(ArrayList<Parametro> listaPokemon)
    {
        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter("Peticiones.json")) {
            gson.toJson(listaPokemon, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
