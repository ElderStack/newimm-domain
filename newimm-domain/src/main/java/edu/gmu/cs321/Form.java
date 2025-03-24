package edu.gmu.cs321;

/** 
 * The Form class which will be displayed to the user in order to retrieve their information for further validation.
 */
public class Form {
    private Immigrant immInfo;

    /** 
     * Default constructor for Form class.
    */
    public Form() {
        this.immInfo = new Immigrant();
    }

    /**
     * Parameterized Form constructor containing an immigrants info using the Immigrant object and the immigrant's address.
     * @param immigrantInfo An Immigrant object which contains the immigrant's information
     */
    public Form(Immigrant immigrantInfo) {
        this.immInfo = new Immigrant(immigrantInfo.getName(), immigrantInfo.getID(), immigrantInfo.getAddress(), immigrantInfo.getDoB());
    }

    /**
     * Returns an Immigrant object of the current immigrant and their information.
     * @return      Immigrant object containing informaion inputted by user
     */
    public Immigrant getImmigrantInfo() {
        return immInfo;
    }

    /**
     * Sets the immigrant's information to the information provided as parameters.
     * @param name      a String representation of the immigrant's name
     * @param ID        an int value which is the immigrant's ID number
     * @param address   a String representation of the immigrant's address
     * @param DoB       a Calendar object representing the immigrant's date of birth
     */
    public void setImmigrantInfo(String name, int ID, String address, String DoB) {
        immInfo.setName(name);
        immInfo.setID(ID);
        immInfo.setAddress(address);
        immInfo.setDoB(DoB);
    }
}