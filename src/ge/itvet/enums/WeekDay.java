package ge.itvet.enums;

public enum WeekDay {
    MONDAY("ორშაბათი", 7),
    TUESDAY("სამშაბათი", 6),
    WEDNESDAY("ოთხშაბათი", 5),
    THURSDAY("ხუთშაბათი", 4),
    FRIDAY("პარასკევი", 3),
    SATURDAY("შაბათი", 2),
    SUNDAY("კვირა", 1);

    private String geoName;
    public int myOrdinal;

    WeekDay(String geoName, int myOrdinal) {
        this.geoName = geoName;
        this.myOrdinal = myOrdinal;
    }

    public String getGeoName() {
        return this.geoName;
    }

    @Override
    public String toString() {
        return this.geoName;
    }
}
