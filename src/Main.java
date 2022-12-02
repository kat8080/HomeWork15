import Transport.Bus;
import Transport.Car;
import Transport.Transport;
import Transport.Truck;




public class Main {
    public static void main(String[] args) {


        Car lada = new Car("Lada", "Granta", 2.6f, SEDAN);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.5f);
        Car bmv = new Car("BMW", "Z8o", 3.2f);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 3.0f);

        lada.pitStop();
        lada.bestLapTime();
        lada.maximumSpeed();

        Truck kamaz = new Truck("КамАЗ", "4246", 4.5f, Transport.LoadCapacity.N1);
        Truck gaz = new Truck("ГАЗ", "6547", 4.0f);
        Truck zil = new Truck("ЗИЛ", "258", 4.3f);
        Truck ural = new Truck("УРАЛ", "951", 4.6f);

        kamaz.pitStop();
        kamaz.bestLapTime();
        kamaz.maximumSpeed();

        Bus liaz = new Bus("ЛиАЗ", "4292", 3.2f,25);
        Bus paz = new Bus("ПАЗ", "325", 3.5f);
        Bus maz = new Bus("МАЗ", "232", 3.1f);

        paz.pitStop();
        paz.bestLapTime();
        paz.maximumSpeed();

        Driver ivanov = new Driver("Иванов Иван Иванович", "С", 4, kamaz);

        System.out.println(ivanov);
        ivanov.carRace(kamaz);

        Driver petrov = new Driver("Петров Петр Иванович", "В", 4, kamaz);

        System.out.println(petrov);
        ivanov.carRace(lada);

        Driver sidorov = new Driver("Сидоров Сергей Петрович", "D", 4, kamaz);

        System.out.println(sidorov);
        ivanov.carRace(liaz);

    }


}