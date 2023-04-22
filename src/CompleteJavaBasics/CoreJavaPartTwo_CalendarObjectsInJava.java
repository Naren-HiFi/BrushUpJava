package CompleteJavaBasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CoreJavaPartTwo_CalendarObjectsInJava {
    public static void main(String[] args) {

        Calendar calInstance = Calendar.getInstance();
        SimpleDateFormat simpleDatFormat = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
        System.out.println("Print the date and time in the specified format: " + simpleDatFormat.format(calInstance.getTime()));
        System.out.println("Print the weeks in the year: " + calInstance.getWeeksInWeekYear());
        System.out.println("Print the AM and PM if it is AM the value is 0, otherwise the value is 1: " + calInstance.get(Calendar.AM_PM));
        System.out.println("Print the day of the month: " +calInstance.get(Calendar.DAY_OF_MONTH));
        System.out.println("Print the day of week in the month: " +calInstance.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Print the current minute: " + calInstance.get(Calendar.MINUTE));




    }
}
