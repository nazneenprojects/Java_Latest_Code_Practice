package dev.classdemo;

public class ClassObjDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("VW");
        car.setColor("Red");
        car.setDoors(4);
        car.setElectric(true);

        System.out.println("com.DemoClass.Car Details :" + car.getBrand()
                        + " " + car.getColor()
                        + " " + car.getDoors()
                        + " "+ car.isElectric());
        car.describedCar();

    }
}
