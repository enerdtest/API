package OOPs.Algo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class GetDayByGivenDate {
     public void GetDayByGivenDate(String date){
        LocalDate currentDate = LocalDate.parse(date);
        int day = currentDate.getDayOfMonth();
        Month month = currentDate.getMonth();
        int year = currentDate.getYear();
        DayOfWeek dt = currentDate.getDayOfWeek();
        System.out.println("Date-Month-Year " +day+"-"+month+"-"+year);
         System.out.println("Date of the Week " + dt);

    }
    //use split();
    public void findDate(String date){
         String dateParts[] = date.split("-");
         String day = dateParts[0];
         String month = dateParts[1];
         String year = dateParts[2];
        System.out.println("Date-Month-Year is "+day+"/"+month+"/"+year );
    }
    public void getDay(int date, int month, int year){
        LocalDate dt = LocalDate.of(year, month, date);
        System.out.println(dt.getDayOfWeek());
    }
    public void findDay(int month, int day, int year) {
        LocalDate dt = LocalDate.of(year, month, day);
        System.out.println(dt.getDayOfWeek());
    }
}
