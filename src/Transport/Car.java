package Transport;

public final class Car extends Transport implements Competing {
    private final BodyType bodyType;

    public Car(String brand, String model, Float engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
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
    public void pitStop() {
        System.out.println("Пит-стоп 2 секунды");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга 10 минут");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость 300 км/ч");
    }

    @Override
    public void printType() {
        if (this.bodyType != null) {
            System.out.println(bodyType);
        } else {
            System.out.println("Информации не достаточно");
        }
    }

    @Override
    public String toString() {
        return "Легковой втомобиль:  " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume();
    }
}
