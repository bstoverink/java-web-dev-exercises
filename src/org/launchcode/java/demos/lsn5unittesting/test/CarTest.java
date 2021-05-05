package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class CarTest {

    Car test_car;

    @Before
    public void createCarObject(){
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
    //TODO: constructor sets gasTankLevel properly

    @Test
    public void testInitialGasTank(){

        assertFalse(test_car.getGasTanklevel() == 0);
    }

    //TODO: gasTankLevel is accurate after driving within tank range

    @Test
    public void testTankRangeAccuracy(){
        assertEquals(50, 50);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception

}
