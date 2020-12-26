package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合，并添加元素0-9
 * 将集合转换为一个Integer数组并输出数组每一个元素
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ints.add(i);
        }
        Object[] integer = ints.toArray();
        for (Object o : integer) {
            System.out.println(o);
        }
    }
}
