package dev.inheritancedemo;

public class Apartment extends Home {

    private String floorNumber;
    private String numberOfRooms;

    public Apartment() {
        super(101, "Hogwards", "Harry Potter");
    }

    public Apartment(int houseNumber, String houseName, String houseOwner, String floorNumber, String numberOfRooms) {
        super(houseNumber, houseName, houseOwner);
        this.floorNumber = floorNumber;
        this.numberOfRooms = numberOfRooms;
    }
    public Apartment(int houseNumber, String houseName, String houseOwner){
        this(houseNumber, houseName, houseOwner, "1", "3");
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "floorNumber='" + floorNumber + '\'' +
                ", numberOfRooms='" + numberOfRooms + '\'' +
                "} " + super.toString();
    }

    public void rentOut(){
            doCleaning();
            System.out.println("in rent out");
    }
    @Override
    public void generateAddress(int houseNumber, String houseName, String houseOwner) {
        super.generateAddress(houseNumber, houseName, houseOwner);
        System.out.println("Generating address for Apartment...");
        if(houseNumber < 100){
            System.out.println("These all belongs to Owner Apartments, no activity required");
        }else{
            doCleaning();
            payBills();
            submitDeposit();
        }
    }

    private void doCleaning(){
    System.out.println(" Apartment needs cleaning before next tenant move in....!!  ");
    }

    private void payBills(){
        System.out.println("Pay bills of Apartment... ");
    }

    private void submitDeposit(){
        System.out.println("Deposit of Apartment must be paid before move in... ");
    }
}
