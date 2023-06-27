package PokeApi.example.PokeApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Parametro
{
    @JsonProperty
    private String parameter1;
    @JsonProperty
    private String parameter2;

    public Parametro() {
    }

    public String getParameter1() {
        return parameter1;
    }

    public void setParameter1(String parameter1) {
        this.parameter1 = parameter1;
    }

    public String getParameter2() {
        return parameter2;
    }

    public void setParameter2(String parameter2) {
        this.parameter2 = parameter2;
    }

    @Override
    public String toString() {
        return "Params{" +
                "parameter1='" + parameter1 + '\'' +
                "parameter2='" + parameter2 + '\'' +
                '}';
    }
}
