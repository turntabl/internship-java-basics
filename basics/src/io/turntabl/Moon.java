package io.turntabl;

public class Moon extends CelestialBody {
    @Override
    public boolean canLand() {
        return true;
    }

    @Override
    public double getWeight() {
        return 7.3E22;
    }

    @Override
    public boolean supportsLife() {
        return false;
    }

    public void orbitPlanet() {

    }

    public void reflectLight() {

    }
}
