package PokeApi.example.PokeApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pokemon
{
    @JsonProperty
    private String name;
    @JsonProperty
    private String url;
    @JsonProperty
    private int height;

    public Pokemon() {
    }

    public Pokemon(String name, String url, int height) {
        this.name = name;
        this.url = url;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
