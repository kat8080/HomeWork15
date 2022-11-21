package Transport;

public final class Bus extends Transport implements Competing {



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

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп 3 секунды");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга 20 минут");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость 220 км/ч");
    }
}
