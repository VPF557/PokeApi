package PokeApi.example.PokeApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

public class Pokemon
{
    @JsonProperty
    private String name;
    @JsonProperty
    private int weight;
    @JsonProperty
    private int height;

    public Pokemon() {
    }

    public Pokemon(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(String Weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
