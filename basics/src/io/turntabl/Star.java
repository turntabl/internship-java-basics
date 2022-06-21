package io.turntabl;

public class Star extends CelestialBody {
    @Override
    public boolean canLand() {
        return false;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public boolean supportsLife() {
        return false;
    }
}
