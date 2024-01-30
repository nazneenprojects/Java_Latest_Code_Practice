package dev.inheritancedemo;

public class Main {
    public static void main(String[] args) {
        Home home = new Home(123, "MountBlink","Walter Mitty" );
        doHomeStuff(home, false);

        Apartment apt = new Apartment();
        doHomeStuff(apt, true);

        Apartment apt1 = new Apartment(234, "Kiwitsstarsse", "James Brand");
        doHomeStuff(apt1, true);

        Apartment apt2 = new Apartment();
        doHomeStuff(apt2,  false);
    }

    public static void doHomeStuff(Home home, boolean isBooked){
        home.rentOut(isBooked);
        home.generateAddress(100, "MountStern","Tom Jackson" );

        System.out.println(home);
    }
}
