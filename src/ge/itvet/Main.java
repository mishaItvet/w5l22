package ge.itvet;

import ge.itvet.collections.TV;
import ge.itvet.collections.TvComparator;
import ge.itvet.equalsmethod.Foo;
import ge.itvet.equalsmethod.Person;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {


        List<TV> tvs = new ArrayList<>();
        tvs.add(new TV(140, 1500, "TVT"));
        tvs.add(new TV(109, 2000, "Samsung"));
        tvs.add(new TV(109, 2000, "Sharp"));
        tvs.add(new TV(109, 2000, "Sony"));
        tvs.add(new TV(109, 2000, "Lg"));

        TvComparator.ByBrand byBrand = new TvComparator.ByBrand();

        System.out.println(tvs);
        tvs.sort(byBrand);
        System.out.println(tvs);



    }
}


