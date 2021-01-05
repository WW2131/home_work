package day06;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个文件或目录名，并删除当前目录下的该文件或目录。
 * 可自行手动先在当前项目目录中创建一个要删除的文件或目录，若是目录，还可以
 * 在该目录中继续创建若干级目录和文件。
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.next();
        File file = new File("D:\\home_work_test\\"+path);
        Test05 test05 = new Test05();
        test05.fileDelete(file);

    }

    public void fileDelete(File file){
        if(file.isFile()){
            file.delete();
        }
        if(file.isDirectory()){
            File[] fa = file.listFiles();
            for (File file1 : fa) {
                fileDelete(file1);
                file1.delete();
            }
            file.delete();
        }

    }
}
