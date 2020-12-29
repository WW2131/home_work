package day05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 创建一个Map，保存某个学生的成绩:
 * 在控制台输入该学生成绩，格式:
 * 科目:成绩;科目:成绩;...
 * 例如:
 * 语文:99;数学:98;英语:97;物理:96;化学:95
 * 然后输出物理的成绩。
 * 然后将化学的成绩设置为96
 * 然后删除英语这一项。
 * 然后遍历该Map分别按照遍历key，Entry，value
 * 的形式输出该Map信息。
 *
 * @author Bonnie
 */
public class Test04 {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        while (true) {
            String str1;
            if (str.contains(";")) {
                str1 = str.substring(0, str.indexOf(";"));
            }else
                str1 = str;
            String name = str.substring(0, str.indexOf(":"));
            int age = Integer.parseInt(str1.substring(str.indexOf(":") + 1));
            stringIntegerMap.put(name, age);
            if (str.contains(";")) {
                str = str.substring(str.indexOf(";") + 1);
            } else
                break;
        }
        stringIntegerMap.get("物理");
        stringIntegerMap.replace("化学", 96);
        stringIntegerMap.remove("英语");
        for (Map.Entry<String, Integer> stringIntegerEntry : stringIntegerMap.entrySet()) {
            System.out.println("\tKey:"+stringIntegerEntry.getKey()+"\tEntry:"+stringIntegerEntry+"\tValue:"+stringIntegerEntry.getValue());
        }
//        stringIntegerMap.put(str,score);
    }
}

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}