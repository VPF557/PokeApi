package PokeApi.example.PokeApi;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LeerJson
{
    public static ArrayList<pokemon> LeerFicheroJson1(String ruta){
        ArrayList<pokemon> listaJson = new ArrayList<>();

        try {
            //Creamos el objeto Gson
            Gson gson = new Gson();

            // Creamos el reader
            Reader reader = null;
            try {
                reader = Files.newBufferedReader(Paths.get(ruta));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            listaJson = new Gson().fromJson(reader, new TypeToken<ArrayList<pokemon>>() {}.getType());
            //Cerramos el reader
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        return listaJson;
    }
}
