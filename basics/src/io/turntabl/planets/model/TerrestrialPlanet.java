package io.turntabl.planets.model;

public abstract class TerrestrialPlanet extends Planet {
    @Override
    public boolean supportsLife() {
        return true;
    }
}
