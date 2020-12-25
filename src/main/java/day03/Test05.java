package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
        String s = "(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)";
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder str1 = new StringBuilder();
        if(str.matches(s)){
            str = str.substring(str.length()-12,str.length()-4);
            str1.append(str);
            str1.insert(4,'-');
            str1.insert(7,'-');
            System.out.println(str1);
        }
        str = "";
        str += str1;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(simpleDateFormat.parse(str));
        System.out.println("出生日期："+simpleDateFormat.format(calendar.getTime()));
        calendar.add(Calendar.YEAR,20);
        System.out.println("20岁生日："+simpleDateFormat.format(calendar.getTime()));
        calendar.set(Calendar.DAY_OF_WEEK,3);
        System.out.println("当周的周三为:"+simpleDateFormat.format(calendar.getTime()));
    }
}
