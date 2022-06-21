package io.turntabl;

public class Earth extends RockyPlanet {

    private final double G_CONSTANT = 6.67E-11;

    @Override
    public double getWeight() {
        return 5.97E24;
    }

    public double gravitationalPull(double kgs, double distance) {
        double f = (G_CONSTANT * kgs * getWeight()) / (distance * distance);
        System.out.println(f);
        return f;
    }

    public double gravitationalPull(CelestialBody body, double distance) {
        double f = (G_CONSTANT * body.getWeight() * getWeight()) / (distance * distance);
        System.out.println(f);
        return f;
    }

    @Override
    public String welcomeMessage() {
        return "Welcome to planet earth";
    }

    public String welcomeMessage(String extraText) {
        return "Welcome to planet earth";
    }

    private void setMoon(Moon moon) {
        moon.orbitPlanet();
        moon.reflectLight();
    }
}
