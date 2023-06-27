package PokeApi.example.PokeApi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller {

    @GetMapping("/registro")
    public ArrayList<Pokemon> listaObjeto1()
    {
        LeerJson reader = new LeerJson();
        //Leemos el reason e introducimos los elementos en un arraylist
        ArrayList<Pokemon> lista = reader.LeerFicheroPokemons("Pokemons.json");
        //Mostramos los elementos leidos
        return lista;
    }
/*
    @PostMapping("/peticion")
    public ArrayList<Criptomoneda> create(@RequestBody Criptomoneda objeto1)
    {
        DataHanding dataHanding = new DataHanding();
        ArrayList<Criptomoneda> lista;
        lista = dataHanding.AnadirObjeto1(objeto1,"Criptomonedas.json");
        EscribirJson escribirJSON = new EscribirJson();
        escribirJSON.escribirObjeto1(lista);
        return lista;
    }
*/
}
