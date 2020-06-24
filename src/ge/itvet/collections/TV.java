package ge.itvet.collections;

public class TV implements Comparable<TV> {
    public final int resolution;
    public final double price;
    public  String brand;

    public TV(int resolution, double price, String brand) {
        this.resolution = resolution;
        this.price = price;
        this.brand = brand;
    }

    @Override
    public int compareTo(TV tv) {
        if (tv == null) return 1;
        return this.resolution == tv.resolution ? 0 : this.resolution - tv.resolution;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "TV{" +
                "resolution=" + resolution +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
