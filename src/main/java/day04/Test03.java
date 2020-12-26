package day04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        String[] strs ={"one","two","three","four"};
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(strs));
        System.out.println(strings.get(1));
        strings.set(2,"3");
        strings.add(1,"2");
        strings.remove(2);
    }
}
