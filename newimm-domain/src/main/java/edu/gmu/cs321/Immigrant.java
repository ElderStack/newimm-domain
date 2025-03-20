package edu.gmu.cs321;

/**
 * Models the user submitting data through the form.
 */
public class Immigrant {
    /**
     * Name of the Immigrant
     */
    private String name;

    /**
     * Unique ID of the Immigrant
     */
    private int ID;

    /**
     * Default Constructor.
     * - name = null
     * - ID = -1
     */
    public Immigrant() {
        this.name = null;
        this.ID = -1;
    }

    /**
     * Parameterized Constructor
     * @param name Name of the Immigrant
     * @param ID Unique ID of the Immigrant
     */
    public Immigrant(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    /**
     * Outputs the Immigrant Object as a String
     */
    @Override
    public String toString() {
        return "Name: " + this.name + ", ID: " + this.ID;
    }

    /**
     * Returns the name of the Immigrant
     * @return String name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the name of the Immigrant
     * @return int ID
     */
    public int getID() {
        return this.ID;
    }

    /**
     * Sets the name of the Immigrant
     * @param name Name to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the ID of the Immigrant
     * @param ID ID to be set
     */
    public void setID(int ID) {
        this.ID = ID;
    }
}