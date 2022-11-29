package Transport;

public final class Bus extends Transport implements Competing {

    private final SeatsCapacity seatsCapacity;

    public Bus(String brand, String model, Float engineVolume,SeatsCapacity seatsCapacity) {
        super(brand, model, engineVolume);
        this.seatsCapacity = seatsCapacity;
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

    @Override
    public void printType() {
        if (this.seatsCapacity != null) {
            System.out.println(seatsCapacity);
        } else {
            System.out.println("Информации не достаточно");
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобус " + getBrand() + getModel() + " в диагностике не требуется");
        return true;
    }

    @Override
    public String toString() {
        return "Автобус: " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume();
    }
}
