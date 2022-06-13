package io.turntabl.spacetravel;

import io.turntabl.planets.model.CelestialBody;

public class Habitability {
    public static boolean canIMoveTo(CelestialBody cb){

        return cb.supportsLife();
    }

}
