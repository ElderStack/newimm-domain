/**
 * Programmed by Jakob Elmore
 */

package edu.gmu.cs321;

/**
 * Dependent Class. Models a dependent of an Immigrant
 */
public class Dependent extends Immigrant{
    /**
     * The guardian of the Dependent
     */
    private Immigrant guardian;

    /**
     * Default constructor sets Immigrant to null.
     */
    public Dependent(){
        this.guardian = null;
    }

    /**
     * Parameterized constructor sets the guardian for the Dependent
     * @param guardian
     */
    public Dependent(String name, int ID, String address, String dob, Immigrant guardian){
        this.guardian = guardian;
    }

    /**
     * Returns the guardian of the Dependent
     * @return          guardian of the Dependent
     */
    public Immigrant getGuardian(){
        return this.guardian;
    }

    /**
     * Sets the guardian of the Dependent
     * @param guardian  new guardian of the Dependent
     */
    public void setGuardian(Immigrant guardian){
        this.guardian = guardian;
    }
}
