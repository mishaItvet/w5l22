package ge.itvet.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class LambasTest {
    public static void test() {
        List<TV> tvs = new ArrayList<>();
        tvs.add(new TV(140, 1500, "TVT"));
        tvs.add(new TV(109, 2000, "Samsung"));
        tvs.add(new TV(109, 2000, "Sharp"));
        tvs.add(new TV(109, 2000, "Sony"));
        tvs.add(new TV(109, 2000, "Lg"));

        tvs.get(1).compareTo(tvs.get(0));


        tvs.sort((tv1, tv2) -> tv2.brand.compareTo(tv1.brand));//DESC
        tvs.sort(Comparator.comparing(tv -> tv.brand));

        tvs.sort(new Comparator<TV>() {
            @Override
            public int compare(TV tv1, TV tv2) {
                return tv2.brand.compareTo(tv1.brand);
            }
        });
    }

    public static void testPredicate() {
        DynamicArray<TV> tvs = new DynamicArray<>();
        tvs.add(new TV(140, 1500, "TVT"));
        tvs.add(new TV(109, 2000, "Samsung"));
        tvs.add(new TV(80, 2000, "Sharp"));
        tvs.add(new TV(109, 2000, "Sony"));
        tvs.add(new TV(43, 2000, "Lg"));

        System.out.println(tvs.filter(tv -> tv.price < 2000));
        System.out.println(tvs);

    }

    public static void testConsumer(Supplier<Double> getDiscountPercent) {
        DynamicArray<MyInteger> myIntegers = new DynamicArray<>();
        myIntegers.add(new MyInteger(100));
        myIntegers.add(new MyInteger(1001));
        myIntegers.add(new MyInteger(2002));
        myIntegers.updateData(m -> m.setValue((int) (m.getValue() - m.getValue() * getDiscountPercent.get())));
        System.out.println(myIntegers);

    }

    public static void testSupplier() {
        testConsumer(() -> 0.3);
    }

    public void testFunctionalInterface() {
        callFunctionalInterface( l -> l % 2 == 0 );
    }

    public void callFunctionalInterface(TwoMethodInterface twoMethodInterface) {
        boolean test = twoMethodInterface.test(8);
    }

    public interface TwoMethodInterface {
        boolean test(int a);
    }
}
