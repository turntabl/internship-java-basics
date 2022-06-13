package io.turntabl.planets.model;

public abstract class GasGiant extends Planet{
    @Override
    public boolean supportsLife() {
        return false;
    }
}
