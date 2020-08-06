package com.kodilla.stream.world;

import com.kodilla.stream.forum.ForumUser;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {
    private final List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent newContinent) {
        this.continents.add(newContinent);
    }

    //gettery
    public List<Continent> getContinents() {
        return continents;
    }

    public List<Continent> getContinentList() {
        return continents;
    }
}
