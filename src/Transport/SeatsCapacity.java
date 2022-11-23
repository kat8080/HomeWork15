package Transport;

public enum SeatsCapacity {
    ESPECIALLY_SMALL(0,10),
    SMALL( 10, 25),
    AVERAGE( 40, 50),
    BIG( 60, 80 ),
    VERY_BIG( 100, 120);
    private final int capacityFrom;  //вместимость от

    private final int capacityTo;     //вместимость до

    SeatsCapacity(int capacityFrom, int capacityTo) {
        this.capacityFrom = capacityFrom;
        this.capacityTo = capacityTo;
    }

    public int getCapacityFrom() {
        return capacityFrom;
    }

    public int getCapacityTo() {
        return capacityTo;
    }

    @Override
    public String toString() {
        String capacity = capacityFrom > 0 ? capacityFrom + " - " + capacityTo : String.valueOf(capacityTo);
        return "Вместимость: " + name() + "(" + capacity + " мест)";
    }
}
