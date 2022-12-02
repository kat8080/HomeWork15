import Transport.Transport;

public class Driver<T extends Transport> {
    private final String fio;          //ФИО
    private String category;      //категория
    private int experience;          //стаж
    private final T auto;

    public Driver(String fio, String category, int experience, T auto) {
        this.fio = fio;
        setCategory(category);
        this.experience = experience;
        this.auto = auto;
    }

    public String getFio() {
        return fio;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category == null) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
        this.category = category;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void startMoving() {                              //метод начать движение
        System.out.println("Начинаю движение");
    }

   public void stop(){                                    //метод остановиться
        System.out.println("Останавливаюсь");
    }

    public void refuelAuto() {                              //метод заправить авто
        System.out.println("Заправляю авто");
    }

    public void carRace(T auto) {                //участие в заезде
        System.out.println("Водитель " + fio + " управляет автомобилем " + auto.getBrand() + " " + auto.getModel() +
                " и будет участвовать в заезде.");
    }

    @Override
    public String toString() {
        return "Водитель: " + fio +
                ", категория " + category + ", стаж " + experience +
                ", машина " + auto.getBrand() + " " + auto.getModel();
    }
}

