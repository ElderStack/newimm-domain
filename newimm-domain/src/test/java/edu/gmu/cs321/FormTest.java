package edu.gmu.cs321;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for the Form class.
 */
public class FormTest {
    private Immigrant formTest = new Immigrant("Karl", 1, "My Address", "2001/01/01");

    /**
     * The test method for all the getters of the Form class.
     */
    @Test
    public void testGetters() {
        boolean testGetImmigrant = formTest.getImmigrantInfo() == new Immigrant("Karl", 1);
        assertTrue(testGetImmigrant);
    }

    /**
     * The test method for all the setters of the Form class.
     */
    @Test
    public void testSetters() {
        formTest.setImmigrantInfo("Lukas", 72, "My Address", "2001/01/01");
        assertTrue(formTest.getImmigrantInfo() == new Immigrant("Lukas", 72, "My Address", "2001/01/01"));
    }

    /**
     * The test method for the constructors of the Form class.
     */
    @Test
    public void testConstructor() {
        String address = "My address";
        String name = "steve";
        int ID = 12;
        String DoB = "2001/09/02";
        Immigrant immTest = new Immigrant(name, address, ID, DoB);
        Form testForm = new Form(immTest);
        assertTrue(testForm.getImmigrantInfo() == (immTest));

        Form testForm2 = new Form();
        assertTrue(testForm.getImmigrantInfo() == (null));
    }
}