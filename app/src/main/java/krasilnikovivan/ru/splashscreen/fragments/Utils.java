package krasilnikovivan.ru.splashscreen.fragments;

import java.text.SimpleDateFormat;

public class Utils {
    public static String getDate(long date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.mm.yy");
        return  simpleDateFormat.format(date);
    }
    public static String getTime(long time){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH.mm");
        return simpleDateFormat.format(time);
    }
}
