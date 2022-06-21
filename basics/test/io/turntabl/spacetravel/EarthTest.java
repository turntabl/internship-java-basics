package io.turntabl.spacetravel;


import io.turntabl.Earth;
import io.turntabl.Moon;
import org.junit.Assert;
import org.junit.Test;

public class EarthTest {

    @Test
    public void inheritedIsPlanet() {
        Assert.assertEquals(true, new Earth().isPlanet());
    }

    @Test
    public void getOverloadedGravitationalPull() {
        Assert.assertEquals(1.9713356E20, new Earth().gravitationalPull(7.3E22, 3.84E8), 0.000001E20);
        Assert.assertEquals(1.9713356E20, new Earth().gravitationalPull(new Moon(), 3.84E8), 0.000001E20);
    }

    @Test
    public void earthOverridesPlanet() {
        Assert.assertEquals("Welcome to planet earth", new Earth().welcomeMessage());
        Assert.assertEquals("Goodbye", new Earth().goodbyeMessage());
    }
}
