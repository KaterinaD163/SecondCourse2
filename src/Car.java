public class Car {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;


    public Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    public String toString() {
        return this.brand + " " + this.model + ": объём двигателя " + this.engineVolume + " л, " +
                this.color + ", год выпуска - " + this.productionYear + ", " + this.productionCountry;
    }

}

