package edu.gmu.cs321;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Class to run tests on Immigrant.java
 */
public class ImmigrantTest {
    private final String name = "Karl";
    private final int id = 1;
    private final String address = "1234 Lane";
    private final String DoB = "2000/01/01";
    private Immigrant testImm = new Immigrant(this.name, this.id, this.address, this.DoB);

    /**
     * Test Immigrant.java getter functions.
     * Test Values:
     * - name = "Karl"
     * - id = 1
     * - address = "1234 Lane"
     * - DoB = "2000/01/01"
     */
    @Test
    public void testGetters() {
        boolean testGetName = testImm.getName().equals(this.name);
        boolean testGetId = testImm.getID() == this.id;
        boolean testGetAddress = testImm.getAddress().equals(this.address);
        boolean testGetDoB = testImm.getDoB().equals(this.DoB);
        assertTrue(testGetName);
        assertTrue(testGetId);
        assertTrue(testGetAddress);
        assertTrue(testGetDoB);
    }

    /**
     * Test Immigrant.java setter functions. 
     * Test Values:
     * - name = "Big Boss"
     * - id = 2
     * - address = "8960 Test Address"
     * - DoB = "1999/10/12"
     */
    @Test
    public void testSetters() {
        String testName = "Big Boss";
        testImm.setName(testName);
        assertTrue(testImm.getName().equals(testName));

        int testID = 2;
        testImm.setID(testID);
        assertTrue(testImm.getID() == testID);

        String testAddress = "8960 Test Address";
        testImm.setAddress(testAddress);
        assertTrue(testImm.getAddress().equals(testAddress));

        String testDoB = "1999/10/12";
        testImm.setDob(testDoB);
        assertTrue(testImm.getDoB().equals(testDoB));

        testImm = new Immigrant(this.name, this.id, this.address, this.DoB);
    }

    /**
     * Tests the Immigrant.java constructors
     * Test Values for default constructor:
     * - name = null
     * - id = -1;
     * - address = null
     * - DoB = null
     * 
     * Test Values for parameterized constructor:
     * - name = "Ocelot"
     * - id = 7
     * - address = "6758 Victory Road"
     * - DoB = "3000/01/01"
     */
    @Test
    public void testConstructor() {
        String testName = "Ocelot";
        int testID = 7;
        String testAddress = "6758 Victory Road";
        String testDoB = "3000/01/01";
        Immigrant newImm = new Immigrant(testName, testID, testAddress, testDoB);
        
        assertTrue(newImm.getName().equals(testName));
        assertTrue(newImm.getID() == testID);
        assertTrue(newImm.getAddress().equals(testAddress));
        assertTrue(newImm.getDoB().equals(testDoB));

        newImm = new Immigrant();
        assertTrue(newImm.getName() == (null));
        assertTrue(newImm.getID() == -1);
        assertTrue(newImm.getAddress() == (null));
        assertTrue(newImm.getDoB() == (null));
    }

    /**
     * Tests Immigrant.java toString()
     * Test values:
     * - name = "Karl"
     * - id = 1
     * - address = "1234 Lane"
     * - DoB = "2000/01/01"
     * - output string = "Name: Karl, ID: 1, Address: 1234 Lane, Date of Birth: 2000/01/01"
     */
    @Test
    public void testToString() {
        String testOutput = "Name: Karl, ID: 1, Address: 1234 Lane, Date of Birth: 2000/01/01";
        assertTrue(testImm.toString().equals(testOutput));
    }
}