package edu.gmu.cs321;

/**
 * The Form class which will be displayed to the user in order to retrieve their information for further validation.
 */
public class Form {
    private String address = "";
    private Immigrant immigrantInfo;

    /**
     * Default constructor for Form class.
    */
    public Form() {
        this.address = null;
        this.immigrantInfo = new Immigrant();
    }

    /**
     * Parameterized Form constructor containing an immigrants info using the Immigrant object and the immigrant's address.
     * @param address       A String representation of the immigrant's address
     * @param immigrantInfo An Immigrant object which contains the immigrant's information
     */
    public Form(String address, Immigrant immigrantInfo) {
        this.address = address;
        this.immigrantInfo = new Immigrant(immigrantInfo.getName(), immigrantInfo.getID());
    }

    /**
     * Returns the address of the immigrant.
     * @return      String representation of the immigrant's address inputted by user
     */
    public String getAddress() {
        return address;
    }

    /**
     * Returns an Immigrant object of the current immigrant and their information.
     * @return      Immigrant object containing informaion inputted by user
     */
    public Immigrant getImmigrantInfo() {
        return immigrantInfo;
    }

    /**
     * Sets the immigrant's information to the information provided as parameters.
     * @param name  a String representation of the immigrant's name
     * @param ID    an int value which is the immigrant's ID number
     */
    public void setImmigrantInfo(String name, int ID) {
        immigrantInfo.setName(name);
        immigrantInfo.setID(ID);
    }
}