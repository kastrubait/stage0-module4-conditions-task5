package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean condLeap;
        if (year % 100 == 0 ) {
            condLeap = year % 400 == 0;
        } else {
            condLeap = year % 4 == 0;
        }
        System.out.println(condLeap ? "leap" : "not leap");
    }
}
