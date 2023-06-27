package PokeApi.example.PokeApi;

import com.fasterxml.jackson.annotation.JsonProperty;

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
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
