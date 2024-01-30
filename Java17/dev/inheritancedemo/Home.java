package dev.inheritancedemo;

public class Home {
    private int houseNumber;
    private String houseName;
    private String houseOwner;

    public Home(){

    }

    public Home(int houseNumber, String houseName, String houseOwner) {
        this.houseNumber = houseNumber;
        this.houseName = houseName;
        this.houseOwner = houseOwner;
    }


    @Override
    public String toString() {
        return "House{" +
                "houseNumber=" + houseNumber +
                ", houseName='" + houseName + '\'' +
                ", houseOwner='" + houseOwner + '\'' +
                '}';
    }


    public void generateAddress(int houseNumber, String houseName, String houseOwner){
        System.out.println("Address: "+ houseOwner +" "+ houseNumber +" "+houseName);
    }

    public void rentOut(boolean isBooked){
        System.out.println("is this House booked ?" + isBooked);
    }

}
