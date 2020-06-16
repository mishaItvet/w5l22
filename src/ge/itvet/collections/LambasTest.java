package ge.itvet.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

}
