package day05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2006-02-15
 * 
 * 定义equals方法，要求名字以及年龄相同，则认为内容一致。
 * 
 * 实现Comparable接口，并重写抽象方法comparaTo()，比较规则为年龄小的人小。
 * @author Bonnie
 *
 */
public class Emp implements Comparable {

    String name;
    int age;
    String gender;
    int salary;
    Date hiredate;//入职时间


    @Override
    public String toString() {

        SimpleDateFormat simpleDateFormat  = new SimpleDateFormat("yyyy-MM-dd");
        String str = simpleDateFormat.format(this.hiredate);
        return "姓名：'" + name + '\'' +
                ", 年龄：" + age +
                ", 性别：'" + gender + '\'' +
                ", 薪资：" + salary +
                ", 入职时间：" + str+
                ",转正时间："+simpleDateFormat.format(dateTime(this.hiredate).getTime());
    }

    @Override
    public boolean equals(Object obj) {
        day04.Emp emp = (day04.Emp) obj;
        return ((Emp) obj).age==this.age;
    }



    public Emp(String name, int age, String gender, int salary, Date hiredate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Calendar dateTime(Date date){
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH,3);
        calendar.set(Calendar.DAY_OF_WEEK,6);
        return calendar;
    }

    @Override
    public int compareTo(Object o) {
        return ((Emp)o).getAge()-this.age;
    }
}