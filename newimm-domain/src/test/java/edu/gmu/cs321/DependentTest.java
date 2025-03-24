package edu.gmu.cs321;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tester Class for Dependent
 */
public class DependentTest {
    /**
     * Parameters for the Immigrant Guardian of the Dependent
     */
    private final String immName = "Kevin";
    private final int immID = 1;
    private final String immAddress = "4321 Street Lane";
    private final String immDoB = "2000/11/00";

    /**
     * Parameters for the Dependent
     */
    private final String depName = "Bob";
    private final int depID = 2;
    private final String depAddress = "4321 Street Lane";
    private final String depDoB = "2200/22/33";

    /**
     * Dependent and Immigrant Objects
     */
    private final Immigrant guardian = new Immigrant(immName, immID, immAddress, immDoB);
    private Dependent testDep = new Dependent(depName, depID, depAddress, depDoB, guardian);

    /**
     * Tests the getGuardian function. Returns true if the guardian is the same as the one 
     * passed in the constructor
     */
    @Test
    public void testGetGuardian(){
        assertTrue(testDep.getGuardian() == guardian);
    }

    /**
     * Tests the setGuardian function. Returns true if the guardian is the same as the one 
     * set using the function
     */
    @Test
    public void testSetGuardian(){
        Immigrant newGuard = new Immigrant();
        testDep.setGuardian(newGuard);
        assertTrue(newGuard == testDep.getGuardian());
        testDep.setGuardian(guardian);
    }
}
