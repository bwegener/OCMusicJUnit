package edu.orangecoastcollege.cs273.ocmusicevents;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class JSONLoaderTest {

    private Context testContext;

    @Before
    public void setUp()
    {
        // This gets the context for us
        testContext = InstrumentationRegistry.getTargetContext();
    }

    @Test
    public void testJSONLoader() throws Exception
    {

        List<MusicEvent> testList = JSONLoader.loadJSONFromAsset(testContext, "MusicEventsTest.json");

        // Assert testList is NOT null
        assertNotNull("Testing list is NOT null", testList);

        // Assert size is 2
        assertEquals("Testing list size is 2.", 2, testList.size());

        // First event should be Blink 182
        MusicEvent event1 = testList.get(0);

        assertEquals("Testing Title.", "Blink 182", event1.getTitle());

        assertEquals("Testing Date.", "October 7", event1.getDate());

        assertEquals("Testing Day.", "Friday", event1.getDay());

        assertEquals("Testing Time.", "7:00 PM", event1.getTime());

        assertEquals("Testing Location.", "Irvine Meadows (formerly Verizon Wireless)", event1.getLocation());

        assertEquals("Testing Address 1.", "8808 Irvine Center Drive", event1.getAddress1());

        assertEquals("Testing Address 2.", "Irvine, California 92618", event1.getAddress2());

        assertEquals("Testing ImageName.", "Blink182.jpeg", event1.getImageName());

        MusicEvent event2 = testList.get(1);

        assertEquals("Testing title.", "Ben Folds And A Piano", event2.getTitle());

        assertEquals("Testing Date.", "October 20", event2.getDate());

        assertEquals("Testing Day.", "Thursday", event2.getDay());

        assertEquals("Testing Time.", "8:00 PM", event2.getTime());

        assertEquals("Testing Location.", "City National Grove of Anaheim", event2.getLocation());

        assertEquals("Testing Address 1", "2200 E Katella Ave", event2.getAddress1());

        assertEquals("Testing Address 2", "Anaheim, California", event2.getAddress2());

        assertEquals("Testing ImageName.", "BenFoldsAndAPiano.jpeg", event2.getImageName());

    }
}
