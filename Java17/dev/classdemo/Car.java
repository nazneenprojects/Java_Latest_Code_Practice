package dev.classdemo;

public class Car {
    private String brand;
    private String color;
    private int doors;
    private boolean isElectric;

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isElectric() {
        return isElectric;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public void describedCar(){
        System.out.println(brand +" car with "+
                color+ " color with "+
                doors+ " doors & its "+
                        (isElectric ? "Electric " : "NonElectric ")
                );
    }




}
