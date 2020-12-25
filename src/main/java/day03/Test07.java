package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 *
 * @author Bonnie
 */
public class Test07 {
    public static void main(String[] args) throws ParseException {
        ArrayList<Emp> emps = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();
        String gender = scanner.next();
        int salary = scanner.nextInt();
        String str = "\\d{4}\\-\\d{2}\\-\\d{2}";
        String date;
        while (true) {
            date = scanner.next();
            if(date.matches(str)){
                break;
            }else{
                System.out.println("请输入正确的日期格式“yyyy-MM-dd”");
            }
        }
        Date hiredate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Emp emp =  new Emp(name,age,gender,salary,simpleDateFormat.parse(date));
        emps.add(new Emp("1",11,"nan",111,simpleDateFormat.parse(date)));
        for(int i=0;i<emps.size();i++){
            if(emps.get(i).equals(emp)){
                System.out.println("员工也存在导入失败");
            }else
                emps.add(emp);
        }
        for(int i=0;i<emps.size();i++){
            System.out.println(emps.get(i).toString());
        }
    }
}
