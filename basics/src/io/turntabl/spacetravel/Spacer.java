package io.turntabl.spacetravel;

public class Spacer extends Spaceship{
    @Override
    public int getCapacity() {
        return 20;
    }

    @Override
    public int getSafetyRating() {
        return 4;
    }

    @Override
    public int getSpeed() {
        return 450;
    }

}
