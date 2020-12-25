package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Calendar calendar;
        String s = "\\d{4}\\-\\d{2}\\-\\d{2}";
        Scanner scanner = new Scanner(System.in);
        String str=scanner.next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if(str.matches(s)){
            Date date1 = new Date();
            Date date = simpleDateFormat.parse(str);
            System.out.println(("过了:"+(date1.getTime()-date.getTime())/1000/7/24/3600)+"周");
        }

    }
}
