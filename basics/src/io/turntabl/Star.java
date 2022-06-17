package io.turntabl;

public class Star extends CelestialBody {
    @Override
    public boolean canLand() {
        return false;
    }

    @Override
    public boolean supportsLife() {
        return false;
    }
}
