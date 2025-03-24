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
     * Date of Birth of the Immigrant
     */
    private String DoB;

    /**
     * Address of the Immigrant
     */
    private String address;

    /**
     * Default Constructor.
     * - name = null
     * - ID = -1
     * - address = null
     * - DoB = null
     */
    public Immigrant() {
        this.name = null;
        this.ID = -1;
        this.address = null;
        this.DoB = null;
    }

    /**
     * Parameterized Constructor
     * @param name      Name of the Immigrant
     * @param ID        Unique ID of the Immigrant
     * @param address   Address of the Immigrant
     * @param DoB       Date of Birth of the Immigrant
     */
    public Immigrant(String name, int ID, String address, String DoB) {
        this.name = name;
        this.ID = ID;
        this.address = address;
        if (verifyDoB(DoB)){
            this.DoB = DoB;
        }
    }

    /**
     * Outputs the Immigrant Object as a String
     */
    @Override
    public String toString() {
        return "Name: " + this.name + ", ID: " + this.ID + ", Address: " + this.address +
        ", Date of Birth: " + this.DoB;
    }

    /**
     * Returns the name of the Immigrant
     * @return      String name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the name of the Immigrant
     * @return      int ID
     */
    public int getID() {
        return this.ID;
    }

    /**
     * Sets the name of the Immigrant
     * @param name  Name to be set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return
     */
    public String getDoB() {
        return this.DoB;
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
    public void setDob(String newDoB){
        if (verifyDoB(newDoB)){
            this.DoB = newDoB;
        }
    }

    /**
     * Verifies that the String submitted as the date of birth is formatted correctly
     * @return ture if date of birth is submitted correctly.
     */
    private boolean verifyDoB(String DoB) {
        String[] splitDate = DoB.split("/");
        //checks lengths of the strings first
        if (splitDate.length == 3 && splitDate[0].length() == 4 && splitDate[1].length() == 2 && 
        splitDate[2].length() == 2) {
            //checks each string to see if its numeric
            for (String item: splitDate){
                if (!validDate(item)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /**
     * Helper method that checks if a string is numeric
     * @param str String to be checked
     * @return True if number is numeric
     */
    private boolean isNumeric(String str) {
        if (str == null){
            return false;
        }

        try {
            Double.valueOf(str);
            return true;
        } 
        catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Helper method that checks if the date falls within real ranges
     * Checks if all numbers are greater then 0
     * For month and year checks if number is less then 31
     * Means we can have a 31st month but if we need to validate that later we can do it here
     */
    private boolean validDate(String str){
        if (!isNumeric(str)){
            return false;
        }

        Double num = Double.valueOf(str);
        if (num < 0){
            return false;
        }
        if (str.length() == 2) {
            if (num > 31) {
                return false;
            }
        }
        return true;
    }
}