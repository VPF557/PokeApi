package PokeApi.example.PokeApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tipo
{
    @JsonProperty
    private String name;
    @JsonProperty
    private int id;

    public Tipo()
    {
    }

    public Tipo(String name, String url) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tipo{" +
                "name='" + name + '\'' +
                "id='" + id + '\'' +
                '}';
    }
}
