package ge.itvet;

import ge.itvet.collections.TV;
import ge.itvet.date.Dates;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static Random random1 = new Random();

    public static void main(String... args) {


        Dates.testTime();

    }

    public static Set<String> customf(List<TV> l) {
        Set<String> s = new HashSet<>();
        for (TV tv : l) {
            if (tv.brand.startsWith("AB") && tv.resolution > 50 && tv.price < 1500 ) {
                s.add(tv.brand);
            }
        }
        return s;
    }

    public static String nameGenerator() {
        int len = 3 + random1.nextInt(5);
        int i = 0;
        String name = "";
        while (i++ < len) {
            name += (char) ('A' + random1.nextInt('Z' - 'A'));
        }
        return name;
    }
}


