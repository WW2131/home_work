package day05;

import javax.sound.sampled.Line;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * 创建一个队列，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        Integer[] arr = {1,2,3,4,5};
        queue.addAll(Arrays.asList(arr));
        for (Integer integer : queue) {
            System.out.println(integer);
        }

    }
}
