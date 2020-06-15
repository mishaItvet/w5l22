package ge.itvet;

import ge.itvet.collections.DynamicArray;
import ge.itvet.collections.TV;
import ge.itvet.collections.TvComparator;

public class Main {

    public static void main(String[] args) throws Exception {


        DynamicArray<TV> tvs = new DynamicArray<>();
        tvs.add(new TV(140, 1500, "TVT"));
        tvs.add(new TV(109, 2000, "Samsung"));
        tvs.add(new TV(109, 2000, "Sharp"));
        tvs.add(new TV(109, 2000, "Sony"));
        tvs.add(new TV(109, 2000, "Lg"));

        TvComparator.ByBrand byBrand = new TvComparator.ByBrand();
        for (TV tv : tvs) {
            System.out.println(tv);
        }
    }
}


