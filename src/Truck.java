public final class Truck extends Transport {
    public Truck(String brand, String model, Float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Начать движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Закончить движение");
    }
    public String toString() {
        return "Грузовой автомобиль: " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume();
    }
}
