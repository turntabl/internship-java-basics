package io.turntabl.spacetravel;

public class Bulletship extends Spaceship{
    @Override
    public int getCapacity() {
        return 100;
    }

    @Override
    public int getSafetyRating() {
        return 2;
    }

    @Override
    public int getSpeed() {
        return 1800;
    }
}
