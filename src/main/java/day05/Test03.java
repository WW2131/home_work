package day05;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * <p>
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 *
 * @author Bonnie
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        List<Emp> emps = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入要输入的员工数：");
        int n = scanner.nextInt();
        int m = 0;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        emps.add(new Emp("1", 11, "nan", 111, simpleDateFormat.parse("2020-01-03")));
        while (m < n) {
            String name = scanner.next();
            int age = scanner.nextInt();
            String gender = scanner.next();
            int salary = scanner.nextInt();
            String str = "\\d{4}\\-\\d{2}\\-\\d{2}";
            String date;
            while (true) {
                date = scanner.next();
                if (date.matches(str)) {
                    break;
                } else {
                    System.out.println("请输入正确的日期格式“yyyy-MM-dd”");
                }
            }

            Emp emp = new Emp(name, age, gender, salary, simpleDateFormat.parse(date));

            for (int i = 0; i < emps.size(); i++) {
                System.out.println(emps.get(i).equals(emp));
                if (emps.get(i).equals(emp)) {
                    System.out.println("员工已经存在导入失败");
                } else {
                    emps.add(emp);
                    m++;
                    break;
                }
            }
        }

        Collections.sort(emps);
        for (int i = 0; i < emps.size(); i++) {
            System.out.println(emps.get(i).toString());
        }
    }

}
