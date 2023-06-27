package PokeApi.example.PokeApi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller {

    LeerJson reader = new LeerJson();
    DataHanding data = new DataHanding();
    EscribirJson writter = new EscribirJson();

    @GetMapping("/registro")
    public ArrayList<Parametro> listaObjeto1()
    {
        //Leemos el reason e introducimos los elementos en un arraylist
        ArrayList<Parametro> listaPeticiones = reader.LeerFicheroPeticiones("Peticiones.json");
        //Mostramos los elementos leidos
        return listaPeticiones;
    }

    @PostMapping("/peticion")
    public void mandarElemento(@RequestBody Parametro objeto1)
    {
        //Hecho
        ArrayList<Pokemon> listaPokemons = reader.LeerFicheroPokemons("Pokemons.json");
        ArrayList<Parametro> listaPeticiones = reader.LeerFicheroPeticiones("Peticiones.json");
        ArrayList<Tipo> listaTipo = reader.LeerFicheroTipos("Tipos.json");

        Pokemon pokemon = new Pokemon();
        pokemon = data.obtenerPokemon(objeto1);
        listaPokemons.add(pokemon);

        listaPeticiones.add(objeto1);

        writter.escribirJsonPokemon(listaPokemons);
        writter.escribirJsonPeticiones(listaPeticiones);
    }

}
