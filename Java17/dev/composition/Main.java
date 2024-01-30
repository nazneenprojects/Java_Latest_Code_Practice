package dev.composition;

public class Main {

    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("A1", "DEll", "240");
        Monitor theMoni = new Monitor("27inch", "Acer", 27, "2340X2344");
        Motherboard mboard = new Motherboard("BJ-2000", "Asus",4, 6, "v2.222");

        PersonalComputer thePC = new PersonalComputer("2290", "Dell", theCase, theMoni, mboard);

//        thePC.getMonitor().drawPixelAt(10, 10, "RED");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();

    }
}
