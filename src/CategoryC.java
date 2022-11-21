import Transport.Car;


public  class CategoryC extends Driver<Car> {


    public CategoryC(String fio, String availableDriverLicense, int experience, Car car) {
        super(fio, "C", experience, car);
    }
}

