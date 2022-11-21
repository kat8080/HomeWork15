package Transport;

public class Truck extends Transport implements Competing {
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

    public String toString() {
        return "Грузовой автомобиль: " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume();
    }
}

