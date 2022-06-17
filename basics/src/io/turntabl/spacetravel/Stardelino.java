package io.turntabl.spacetravel;

public class Stardelino extends Spaceship{
    @Override
    public int getCapacity() {
        return 80;
    }

    @Override
    public int getSafetyRating() {
        return 8;
    }

    @Override
    public int getSpeed() {
        return 900;
    }
}
