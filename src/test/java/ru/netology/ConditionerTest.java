package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    @Test
    public void shouldGetAndSet() {

        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void shouldGetAndSetMinMaxTemperature() {

        int minTempExpected = 16;
        int maxTempExpected = 28;

        conditioner.setMinTemperature(minTempExpected);
        assertEquals(minTempExpected, conditioner.getMinTemperature());

        conditioner.setMaxTemperature(maxTempExpected);
        assertEquals(maxTempExpected, conditioner.getMaxTemperature(maxTempExpected));
    }

    @Test
    public void SetCurrentTempBelowLimits() {

        int minTemperature = 16;
        int maxTemperature = 28;
        int currentTemperature = 20;
        int expected = 20;

        conditioner.setMaxTemperature(maxTemperature);
        conditioner.setMinTemperature(minTemperature);
        conditioner.setCurrentTemperature(currentTemperature);
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void SetCurrentTempOverLimits() {

        int minTemperature = 16;
        int maxTemperature = 28;
        int currentTemperature1 = 30;
        int expected = 0;
        int currentTemperature2 = 10;


        conditioner.setMaxTemperature(maxTemperature);
        conditioner.setMinTemperature(minTemperature);

        conditioner.setCurrentTemperature(currentTemperature1);
        assertEquals(expected, conditioner.getCurrentTemperature());

        conditioner.setCurrentTemperature(currentTemperature2);
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseCurrentTemperature() {

        int minTemperature = 16;
        int maxTemperature = 28;
        int currentTemperature = 20;
        int expected = 21;


        conditioner.setMaxTemperature(maxTemperature);
        conditioner.setMinTemperature(minTemperature);
        conditioner.setCurrentTemperature(currentTemperature);

        conditioner.IncreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());


    }

    @Test
    public void shouldIncreaseMaxCurrentTemperature() {

        int minTemperature = 16;
        int maxTemperature = 28;
        int currentTemperature = 28;
        int expected = 28;


        conditioner.setMaxTemperature(maxTemperature);
        conditioner.setMinTemperature(minTemperature);
        conditioner.setCurrentTemperature(currentTemperature);

        conditioner.IncreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }


    @Test
    public void shouldDecreaseCurrentTemperature() {

        int minTemperature = 16;
        int maxTemperature = 28;
        int currentTemperature = 20;
        int expected = 19;

        conditioner.setMaxTemperature(maxTemperature);
        conditioner.setMinTemperature(minTemperature);
        conditioner.setCurrentTemperature(currentTemperature);

        conditioner.DecreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());

    }

    @Test
    public void shouldDecreaseMinCurrentTemperature() {

        int minTemperature = 16;
        int maxTemperature = 28;
        int currentTemperature = 16;
        int expected = 16;

        conditioner.setMaxTemperature(maxTemperature);
        conditioner.setMinTemperature(minTemperature);
        conditioner.setCurrentTemperature(currentTemperature);

        conditioner.DecreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void checkIsOn() {
        assertEquals(false, conditioner.isOn());
    }
    @Test
    public void checkSeton() {
        conditioner.setOn();
    }
}
