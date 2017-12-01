package edu.orangecoastcollege.cs273.ocmusicevents;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

// static import null
// Using the framework org.junit

/**
 * Created by bwegener on 11/30/2017.
 */
public class MusicEventTest {

    // Created member variable
    private MusicEvent testEvent;

    @Before
    public void setUp() throws Exception {
        // Default empty string are initialized to null
        testEvent = new MusicEvent();
    }

    @Test
    public void getSetTitle() throws Exception {

        // Assertions = guarantees that something matches an expected value
        assertNull("Testing title is null", testEvent.getTitle());

        testEvent.setTitle("Led Zeppelin");
        // Assert that the title equals Led Zeppelin
        assertEquals("Testing title is now Led Zeppelin", "Led Zeppelin", testEvent.getTitle());

    }

    @Test
    public void getSetDate() throws Exception {

        assertNull("Testing date is null", testEvent.getDate());

        testEvent.setDate("December 16");

        assertEquals("Testing date is now December 16", "December 16", testEvent.getDate());

    }

    @Test
    public void getSetDay() throws Exception {

        assertNull("Testing day is null", testEvent.getDay());

        testEvent.setDay("Sunday");

        assertEquals("Testing day is now Sunday", "Sunday", testEvent.getDay());

    }

    @Test
    public void getSetTime() throws Exception {

        assertNull("Testing time is null", testEvent.getTime());

        testEvent.setTime("8:00 PM");

        assertEquals("Testing time is now 8:00 PM", "8:00 PM", testEvent.getTime());

    }

    @Test
    public void getSetLocation() throws Exception {

        assertNull("Testing location is null", testEvent.getLocation());

        testEvent.setLocation("Orange County");

        assertEquals("Testing location is now Orange County", "Orange County", testEvent.getLocation());

    }

    @Test
    public void getSetAddress1() throws Exception {

        assertNull("Testing address 1 is null", testEvent.getAddress1());

        testEvent.setAddress1("251 E 19th Street");

        assertEquals("Testing address 1 is 251 E 19th Street", "251 E 19th Street", testEvent.getAddress1());

    }

    @Test
    public void getSetAddress2() throws Exception {

        assertNull("Testing address 2 is null", testEvent.getAddress2());

        testEvent.setAddress2("Costa Mesa, California");

        assertEquals("Testing address 2 is Costa Mesa, California", "Costa Mesa, California", testEvent.getAddress2());

    }

    @Test
    public void getSetImageName() throws Exception {

        assertNull("Testing image name", testEvent.getImageName());

        testEvent.setImageName("LedZeppelin.jpeg");

        assertEquals("Testing ImageName is LedZeppeling.jpeg", "LedZeppelin.jpeg", testEvent.getImageName());

    }

}