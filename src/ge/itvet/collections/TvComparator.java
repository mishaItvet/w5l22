package ge.itvet.collections;

import java.util.Comparator;

public interface TvComparator {

    class ByBrand implements Comparator<TV> {
        @Override
        public int compare(TV tv, TV t1) {
            return tv.brand.compareTo(t1.brand);
        }
    }

    class ByPrice implements Comparator<TV> {
        @Override
        public int compare(TV tv, TV t1) {
            return Double.compare(tv.price, t1.price);
        }
    }

}
