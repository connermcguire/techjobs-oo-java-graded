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
        Job thisJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertTrue(thisJob.getName() instanceof String);
        assertTrue(thisJob.getEmployer() instanceof Employer);
        assertTrue(thisJob.getLocation() instanceof Location);
        assertTrue(thisJob.getPositionType() instanceof PositionType);
        assertTrue(thisJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(thisJob.getName(), "Product tester");
        assertEquals(thisJob.getEmployer().toString(), "ACME");
        assertEquals(thisJob.getLocation().toString(), "Desert");
        assertEquals(thisJob.getPositionType().toString(), "Quality Control");
        assertEquals(thisJob.getCoreCompetency().toString(), "Persistence");
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job thisJob =   new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char firstChar = thisJob.toString().charAt(0);
        char lastChar = thisJob.toString().charAt(thisJob.toString().length()-1);
        assertEquals(firstChar, '\n');
        assertEquals(lastChar, '\n');
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job thisJob =   new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String jobString = "\nID: " + thisJob.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality Control\nCore Competency: Persistence\n";
        assertEquals(thisJob.toString(), jobString);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job thisJob = new Job();
        assertEquals(thisJob.toString(), "OOPS! This job does not seem to exist.");
    }

    @Test
    public void testJobsForEquality() {
        Job firstJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job secondJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(firstJob == secondJob);
    }
}
