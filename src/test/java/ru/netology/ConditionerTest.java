package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void shouldGetAndSetMinMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        int minTempExpected = 16;
        int maxTempExpected = 28;

        conditioner.setMinTemperature(minTempExpected);
        assertEquals(minTempExpected, conditioner.getMinTemperature());

        conditioner.setMaxTemperature(maxTempExpected);
        assertEquals(maxTempExpected, conditioner.getMaxTemperature(maxTempExpected));
    }

    @Test
    public void SetCurrentTempBelowLimits() {
        Conditioner conditioner = new Conditioner();
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
        Conditioner conditioner = new Conditioner();
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
        Conditioner conditioner = new Conditioner();
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
        Conditioner conditioner = new Conditioner();
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
        Conditioner conditioner = new Conditioner();
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
        Conditioner conditioner = new Conditioner();
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
        Conditioner conditioner = new Conditioner();
        assertEquals(false, conditioner.isOn());
    }
    @Test
    public void checkSeton() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn();
    }

}

