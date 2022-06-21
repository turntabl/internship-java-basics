package io.turntabl;

public abstract class Planet extends CelestialBody {

    public boolean isPlanet() {
        return true;
    }

    public String welcomeMessage() {
        return "Welcome to planet";
    }

    public String goodbyeMessage() {
        return "Goodbye";
    }
}
