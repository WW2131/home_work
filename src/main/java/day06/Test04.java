package day06;

import java.io.File;
import java.util.Objects;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
//        String path = Objects.requireNonNull(Test04.class.getClassLoader().getResource("day06")).getFile();
//        System.out.println(path);
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
