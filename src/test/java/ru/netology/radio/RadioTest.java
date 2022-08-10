package ru.netology.radio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testNext () {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void testNext2 () {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);

    }

    @Test
    public void testPrev () {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);

    }

    @Test
    public void testPrev2 () {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 4;

        assertEquals(expected, actual);

    }

    @Test
    public void maxVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 7;

        assertEquals(expected, actual);

    }

    @Test
    public void minVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 4;

        assertEquals(expected, actual);

    }

    @Test
    public void setStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(11);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void setStation2 () {
        Radio radio = new Radio();
        radio.setCurrentStation(-2);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void setVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void setVolume2 () {
        Radio radio = new Radio();
        radio.setCurrentVolume(-20);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }


}
