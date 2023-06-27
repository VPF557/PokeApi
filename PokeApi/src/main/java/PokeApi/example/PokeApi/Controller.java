package PokeApi.example.PokeApi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller {

    @GetMapping("/registro")
    public ArrayList<Parametro> listaObjeto1()
    {
        LeerJson reader = new LeerJson();
        //Leemos el reason e introducimos los elementos en un arraylist
        ArrayList<Parametro> listaPeticiones = reader.LeerFicheroPeticiones("Peticiones.json");
        //Mostramos los elementos leidos
        return listaPeticiones;
    }
/*
    @PostMapping("/peticion")
    public ArrayList<Criptomoneda> create(@RequestBody Criptomoneda objeto1)
    {
        LeerJson reader = new LeerJson();
        //Leemos el reason e introducimos los elementos en un arraylist
        ArrayList<Pokemon> listaPokemons = reader.LeerFicheroPokemons("Pokemons.json");
        listaPokemons.add()
        //Mostramos los elementos leidos
        return listaPokemons;
    }
*/
}
