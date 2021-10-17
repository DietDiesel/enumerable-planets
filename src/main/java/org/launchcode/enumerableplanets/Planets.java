package org.launchcode.enumerableplanets;

public enum Planets {
    MERCURY("Mercury"),
    VENUS("Venus"),
    EARTH("EARTH"),
    MARS("Mars"),
    JUPITER("Jupiter"),
    SATURN("Saturn"),
    URANUS("Uranus"),
    NEPTUNE("Neptune");

    public final String name;

    Planets(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
