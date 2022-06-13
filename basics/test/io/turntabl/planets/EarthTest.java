package io.turntabl.planets;

import io.turntabl.planets.model.Planet;
import io.turntabl.spacetravel.Habitability;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EarthTest {
    @Test
    public void IsEarthHabitable(){
        Planet e = new Earth();
        assertTrue(Habitability.canIMoveTo(e));
    }
}