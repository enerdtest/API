package utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class utils {
    public static String getDateTime(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy:HH.mm.ss");
        return formatter.format(calendar.getTime());
    }
}
