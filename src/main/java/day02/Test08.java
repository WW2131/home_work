package day02;

import javax.swing.*;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {

    public static void main(String[] args) {
        Emp[][] emp = new Emp[2][2];
        Scanner scanner = new Scanner(System.in);

        for(int i =0;i<2;i++){
            for(int j =0;j<2;j++){
                String name=scanner.next();
                int age = scanner.nextInt();
                String gender = scanner.next();
                int salary = scanner.nextInt();
                emp[i][j]=new Emp(name,age,gender,salary);
            }
        }
        for(int i = 0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(emp[i][j].toString());
            }
        }
    }
}

class Emp{
    String name;
    int age;
    String gender;
    int salary;

    public Emp(String name, int age, String gender, int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
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

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}