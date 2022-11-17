public final class Car extends Transport {


    public Car(String brand, String model, Float engineVolume) {
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
        return "Легковой втомобиль:  " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume();
    }
}
