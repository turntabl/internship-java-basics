package io.turntabl;

public class RockyPlanet extends Planet {
    @Override
    public boolean supportsLife() {
        return true;
    }

    @Override
    public boolean canLand() {
        return true;
    }

    @Override
    public double getWeight() {
        return 0;
    }
}
