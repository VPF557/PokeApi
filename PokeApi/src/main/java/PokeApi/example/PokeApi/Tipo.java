package PokeApi.example.PokeApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tipo
{
    @JsonProperty
    private String name;
    @JsonProperty
    private String url;

    public Tipo()
    {
    }

    public Tipo(String name, String url) {
        this.name = name;
        this.url = url;
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

    @Override
    public String toString() {
        return "Tipo{" +
                "name='" + name + '\'' +
                "url='" + url + '\'' +
                '}';
    }
}
