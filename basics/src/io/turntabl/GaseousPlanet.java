package io.turntabl;

public abstract class GaseousPlanet extends Planet {
    @Override
    public boolean supportsLife() {
        return false;
    }

    @Override
    public boolean canLand() {
        return false;
    }
}
