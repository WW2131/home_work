package day04;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 *   使用迭代器遍历集合，并在过程中删除所有的"$"，
 *   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        String[] strs = new String[]{"1", "$", "2", "$", "3", "$", "4"};
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, strs);
        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i)=="$"){
                strings.remove(i);
            }
        }
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
