package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */

@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job one = new Job();
        Job two = new Job();
        assertNotEquals(one.getId(), two.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job someJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(someJob.getName() instanceof String);
        assertTrue(someJob.getEmployer() instanceof Employer);
        assertTrue(someJob.getLocation() instanceof Location);
        assertTrue(someJob.getPositionType() instanceof PositionType);
        assertTrue(someJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(someJob.getName(), "Product tester");
        assertEquals(someJob.getEmployer(), "ACME");
        assertEquals(someJob.getLocation(), "Desert");
        assertEquals(someJob.getPositionType(), "Quality Control");
        assertEquals(someJob.getCoreCompetency(), "Persistence");

    }
}
