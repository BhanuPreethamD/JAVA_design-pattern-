package Creational.Builder;

public class Car {
    private String engine;
    private String color;
    private boolean gps;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.color = builder.color;
        this.gps = builder.gps;
    }

    public static class CarBuilder {
        private String engine;
        private String color;
        private boolean gps;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setGps(boolean gps) {
            this.gps = gps;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", color=" + color + ", gps=" + gps + "]";
    }
}
