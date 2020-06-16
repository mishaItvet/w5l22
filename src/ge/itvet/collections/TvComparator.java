package ge.itvet.collections;

import java.util.Comparator;

public interface TvComparator {

    class ByBrandAsc implements Comparator<TV> { //ASC
        @Override
        public int compare(TV tv, TV t1) {
            return tv.brand.compareTo(t1.brand);
        }
    }

    class ByBrandDesc implements Comparator<TV> {
        @Override
        public int compare(TV tv, TV t1) {
            return t1.brand.compareTo(tv.brand);
        }
    }

    class ByBrand implements Comparator<TV> {
        boolean desc;

        public ByBrand(Boolean desc) {
            this.desc = desc;
        }

        public ByBrand() {
            this.desc = false;
        }

        @Override
        public int compare(TV tv, TV t1) {
            return (desc ? -1 : 1) * tv.brand.compareTo(t1.brand);
        }
    }

    class ByBrandDesc2 implements Comparator<TV> {
        @Override
        public int compare(TV tv, TV t1) {
            return -1 * tv.brand.compareTo(t1.brand);
        }
    }

    class ByPrice implements Comparator<TV> {
        @Override
        public int compare(TV tv, TV t1) {
            return Double.compare(tv.price, t1.price);
        }
    }

}
