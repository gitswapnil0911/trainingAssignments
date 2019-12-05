package com.jpm.collectionrevision.problem;

import java.util.Objects;

public class City {
    private String name;
    private int population;

    public City(){}

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        return getPopulation() == city.getPopulation() &&
                getName().equals(city.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPopulation());
    }

}
