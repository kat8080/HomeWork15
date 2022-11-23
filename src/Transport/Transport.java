package Transport;

import java.util.Objects;

public abstract class Transport {
    private final String brand;         //марка

    private final String model;

    private final Float engineVolume;    //объем двигателя

    public Transport(String brand, String model, Float engineVolume) {
        this.brand = Tasks.validOrDefault(brand, "указать");
        this.model = Tasks.validOrDefault(model, "указать");
        this.engineVolume = engineVolume >= 0.0f ? engineVolume : 1.5f;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Float getEngineVolume() {
        return engineVolume;
    }

    public abstract void startMoving();   //начало движения
    public abstract void finishMoving();  //конец дыижения

    public abstract void printType();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return brand.equals(transport.brand) && model.equals(transport.model) && engineVolume.equals(transport.engineVolume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }
}




