package day06;

import java.io.File;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        File file = new File("D:\\home_work\\src\\main\\java");
        if (!file.exists()){
            System.out.println("not exists");
            return;
        }
        File[] fs = file.listFiles();
        for (File fa : fs) {
            if (fa.isDirectory()) {
                System.out.println(fa.getName() + " [目录]");
            } else {
                System.out.println(fa.getName());
            }
        }
    }
}
