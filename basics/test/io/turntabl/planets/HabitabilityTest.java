package io.turntabl.planets;

import io.turntabl.RockyPlanet;
import org.junit.Assert;
import org.junit.Test;

public class HabitabilityTest {
    @Test
    public void canLiveOnARockyPlanet(){
        RockyPlanet earth = new RockyPlanet();
        Assert.assertTrue(earth.canLand());
    }
}
