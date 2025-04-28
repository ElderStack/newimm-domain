/**
 * Programmed by Jakob Elmore
 */
package edu.gmu.cs321;

import java.sql.Date;
import java.util.ArrayList;

/**
 * Models the user submitting data through the form.
 */
public class Immigrant {
    /**
     * First name of the Immigrant
     */
    private String firstName;

    /**
     * First name of the Immigrant
     */
    private String lastName;
    /**
     * Unique ID of the Immigrant
     */
    private int ID;

    /**
     * Date of Birth of the Immigrant
     */
    private Date DoB;

    /**
     * Address of the Immigrant
     */
    private String address;

    /**
     * Email Address of the Immigrant
     */
    private String email;

    /**
     * List of Dependents
     */
    private ArrayList<Dependent> dependents;

    /**
     * Default Constructor.
     * - first = null
     * - last = null
     * - ID = -1
     * - address = null
     * - DoB = null
     */
    public Immigrant() {
        this.firstName = null;
        this.lastName = null;
        this.ID = -1;
        this.address = null;
        this.DoB = null;
        this.email = null;
        this.dependents = null;
    }

    /**
     * Parameterized Constructor
     * @param first     First name of the Immigrant
     * @param last      Last name of the Immigrant
     * @param ID        Unique ID of the Immigrant
     * @param address   Address of the Immigrant
     * @param DoB       Date of Birth of the Immigrant
     */
    public Immigrant(String first, String last,  int ID, String address, String email, Date DoB) {
        this.firstName = first;
        this.lastName = last;
        this.ID = ID;
        this.address = address;
        this.email = email;
        this.DoB = DoB;
    }

    /**
     * Parameterized Constructor
     * @param first     First name of the Immigrant
     * @param last      Last name of the Immigrant
     * @param ID        Unique ID of the Immigrant
     * @param address   Address of the Immigrant
     * @param DoB       Date of Birth of the Immigrant
     */
    public Immigrant(String first, String last, int ID, Date DoB) {
        this.firstName = first;
        this.lastName = last;
        this.ID = ID;
        this.DoB = DoB;
    }

    /**
     * Parameterized Constructor
     * @param first     First name of the Immigrant
     * @param last      Last name of the Immigrant
     * @param ID        Unique ID of the Immigrant
     * @param address   Address of the Immigrant
     * @param DoB       Date of Birth of the Immigrant
     */
    public Immigrant(String first, String last, int ID, String email) {
        this.firstName = first;
        this.lastName = last;
        this.ID = ID;
        this.email = email;
    }

    /**
     * Parameterized Constructor
     * @param name      Name of the Immigrant
     * @param ID        Unique ID of the Immigrant
     * @param address   Address of the Immigrant
     * @param DoB       Date of Birth of the Immigrant
     */
    public Immigrant(String first, String last, int ID) {
        this.firstName = first;
        this.lastName = last;
        this.ID = ID;
    }

    /**
     * Outputs the Immigrant Object as a String
     */
    @Override
    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + ", ID: " + this.ID + ", Address: " + this.address +
        ", Date of Birth: " + this.DoB;
    }

    /**
     * Returns the full name of the Immigrant
     * @return      String name
     */
    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    /**
     * Returns the first name of the Immigrant
     * @return      String firstName
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     * Returns the last name of the Immigrant
     * @return      String lastName
     */
    public String getLastName(){
        return this.lastName;
    }

    /**
     * Returns the email of the Immigrant
     * @return      String email
     */
    public String getEmail(){
        return this.email;
    }

    /**
     * Returns the name of the Immigrant
     * @return      int ID
     */
    public int getID() {
        return this.ID;
    }

    /**
     * Sets the first name of the Immigrant
     * @param name  Name to be set
     */
    public void setFirstName(String first) {
        this.firstName = first;
    }

    /**
     * Sets the last name of the Immigrant
     * @param name  Name to be set
     */
    public void setLastName(String last) {
        this.lastName = last;
    }

    /**
     * Sets the ID of the Immigrant
     * @param ID    ID to be set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Returns Immigrant address
     * @return
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Returns Immigrant Date of Birth
     * @return Date
     */
    public Date getDoB() {
        return this.DoB;
    }

    /**
     * Returns Immigrant dependents
     * @return ArrayList<Dependent>
     */
    public ArrayList<Dependent> getDependents(){
        return this.dependents;
    }

    /**
     * Sets Immigrant Address
     */
    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    /**
     * Sets Immigrant Date of Birth
     */
    public void setDoB(Date newDoB){
        this.DoB = newDoB;
    }

    /**
     * Sets Immigrant Date of Birth from String
     */
    public void setDoB(String Date){
        this.DoB = java.sql.Date.valueOf(Date);
    }

    /**
     * Sets Immigrant email
     */
    public void setEmail(String email){
        this.email = email;
    }

    /**
     * Sets Immigrant dependents
     */
    public void setDependents(ArrayList<Dependent> deps){
        this.dependents = deps;
    }
}