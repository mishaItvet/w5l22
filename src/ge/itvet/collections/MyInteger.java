package ge.itvet.collections;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode " + value);
        return value;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals");
        if (o instanceof MyInteger) {
            return this.value == ((MyInteger) o).value;
        }
        return false;
    }

    @Override
    public String toString() {
        return value + "";
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
