package edu.gmu.cs321;
//Lance
public class Immigrant {
    private String name;
    private int ID;
    public Immigrant(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String toString(){
        return "Name: " + this.name + ", ID: " + this.ID;
    }

    public String getName(){
        return this.name;
    }

    public int getID(){
        return this.ID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public boolean checkNum(int num) {
        return true;
    }
}
