
public final class Bus extends Transport {


    public Bus(String brand, String model, Float engineVolume) {
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

    @Override
    public String toString() {
        return "Автобус: " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume();
    }
}
