package Creational.Builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                        .setEngine("V8")
                        .setColor("Red")
                        .setGps(true)
                        .build();
        System.out.println(car); // Car [engine=V8, color=Red, gps=true]
    }
}
