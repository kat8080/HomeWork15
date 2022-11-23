package Transport;

public enum LoadCapacity {
   N1(null, 3.5f),
   N2(3.5f, 12f),
   N3(12f, null);
   private final Float capacityFrom;  //вместимость от
   private final Float capacityTo;     //вместимость до

   LoadCapacity(Float capacityFrom, Float capacityTo) {
      this.capacityFrom = capacityFrom;
      this.capacityTo = capacityTo;
   }

   public Float getCapacityFrom() {
      return capacityFrom;
   }

   public Float getCapacityTo() {
      return capacityTo;
   }

   @Override
   public String toString() {
      String capacityFromString;
      if (capacityFrom != null) {
         capacityFromString = "от " + capacityFrom;
      } else {
         capacityFromString = "";
      }
      //String capacityFromString = capacityFrom != null ? "от " + capacityFrom : "";   //если верхняя граница грузоподъемности не определени то опускается "вместимость от"
      String capacityToString = capacityTo != null ? "до " + capacityTo + "тонн " : ""; //то же самое с нижней
      return "Грузоподъемность " + capacityFromString + capacityToString;
   }
}
