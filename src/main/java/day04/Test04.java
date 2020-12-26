package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 *
 * @author Bonnie
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.print("[");
        for (int i = 3; i < 7; i++) {
            if (i != 6)
                System.out.print(list.get(list.indexOf(i)) + ",");
            else
                System.out.println(list.get(list.indexOf(i))+"]");
        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)*10);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }

        for (int i = 7; i < list.size(); i++) {
            list.remove(i);
            i--;

        }

    }
}
