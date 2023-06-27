package PokeApi.example.PokeApi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller {

    LeerJson reader = new LeerJson();
    DataHanding data = new DataHanding();

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
        ArrayList<Pokemon> listaPokemons = reader.LeerFicheroPokemons("Pokemons.json");
        ArrayList<Parametro> listaPeticiones = reader.LeerFicheroPeticiones("Peticiones.json");

        Pokemon pokemon = new Pokemon();
        pokemon = data.obtenerPokemon(objeto1);


    }

}
