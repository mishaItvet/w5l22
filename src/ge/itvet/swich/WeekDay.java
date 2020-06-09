package ge.itvet.swich;

public class WeekDay {
    int dayOfWeek;
    String[] nameOfDays = new String[]
            {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};



    public WeekDay(ge.itvet.enums.WeekDay weekDay) {
        this.dayOfWeek = weekDay.ordinal();
    }

    @Override
    public String toString() {
        return nameOfDays[dayOfWeek - 1];
    }

    public String toWeekDayString() {
        String weekDayString = null;
        final int two = 2;
        switch (dayOfWeek) {
            case 1:
                weekDayString = "Monday";
                break;
            case two:
                weekDayString = "Tuesday";
                break;
            case 3:
                weekDayString = "Wednesday";
                break;
            case 4:
                weekDayString = "Thursday";
                break;
            case 5:
                weekDayString = "Friday";
                break;
            case 6: {
                weekDayString = "Saturday";
                break;
            }
            default:
                weekDayString = "Sunday";
        }
        return weekDayString;
    }
}