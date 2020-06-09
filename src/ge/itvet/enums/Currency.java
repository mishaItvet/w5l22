package ge.itvet.enums;

public class Currency {
   private String name;
   private Double weight;
   public static final Currency DOLLAR = new Currency("USD",1.0);

    public Currency(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
