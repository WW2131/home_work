package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.concurrent.CancellationException;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int num = scanner.nextInt();
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        calendar.setTime(simpleDateFormat.parse(str));
        calendar.add(Calendar.DATE,num);
        System.out.println("保质期时间："+simpleDateFormat.format(calendar.getTime()));
        calendar.add(Calendar.WEEK_OF_MONTH,-2);
        calendar.set(Calendar.DAY_OF_WEEK,4);
        System.out.println("促销日期："+simpleDateFormat.format(calendar.getTime()));
    }
}
