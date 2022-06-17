package io.turntabl;

public class Moon extends CelestialBody {
    @Override
    public boolean canLand() {
        return true;
    }

    @Override
    public boolean supportsLife() {
        return false;
    }
}
