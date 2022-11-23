package Transport;

public class Truck extends Transport implements Competing {

    private final LoadCapacity loadCapacity;

        public Truck(String brand, String model, Float engineVolume,LoadCapacity loadCapacity) {
            super(brand, model, engineVolume);
            this.loadCapacity = loadCapacity;
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
            System.out.println("Лучшее время круга 15 минут");
        }

        @Override
        public void maximumSpeed() {
            System.out.println("Максимальная скорость 230 км/ч");
        }

    @Override
    public void printType() {
        if (this.loadCapacity != null) {
            System.out.println(loadCapacity);
        } else {
            System.out.println("Информации не достаточно");
        }
    }

    public String toString() {
        return "Грузовой автомобиль: " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume();
    }
}

