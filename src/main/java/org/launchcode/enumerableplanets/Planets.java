package org.launchcode.enumerableplanets;

public enum Planets {
    MERCURY("Mercury", 88, 0.387098, 0.055),
    VENUS("Venus", 225, 0.723332, 0.815),
    EARTH("Earth", 365, 1.0, 1.0),
    MARS("Mars", 687, 1.523679, 0.107),
    JUPITER("Jupiter", 4333, 5.2044, 317.8),
    SATURN("Saturn", 10759, 9.5826, 95.159),
    URANUS("Uranus", 30687, 19.19126, 14.536),
    NEPTUNE("Neptune", 60200, 30.07, 17.147);

    public final String name;
    public final int yearLength;
    public final double distanceFromSun;
    public final double mass;

    Planets(String name, int yearLength, double distanceFromSun, double mass) {
        this.name = name;
        this.yearLength = yearLength;
        this.distanceFromSun = distanceFromSun;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public int getyearLength() {
        return yearLength;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getMass() {
        return mass;
    }
}
