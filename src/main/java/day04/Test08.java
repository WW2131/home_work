package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 *
 * @author Bonnie
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        String s = "\\d{4}\\-\\d{2}\\-\\d{2}";
        Scanner scanner = new Scanner(System.in);

        Date date;
        List<Date> list = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        int n = 0;
        while (n<3) {
            String s1 = scanner.next();
            if (s1.matches(s)) {
                date = simpleDateFormat.parse(s1);
                list.add(date);
                n++;
            }
        }
        list.sort(Date::compareTo);
        for (Date date1 : list) {
            System.out.println(date1);
        }
    }
}
