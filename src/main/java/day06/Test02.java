package day06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 * @author Bonnie
 *
 */
public class Test02 {
    int num = 0;
    public void creatFileName(String str) throws IOException {
        if(num==1){
            str = str.substring(0,str.indexOf("."));
            str = str+"副本_"+num+".txt";
        }
        if(num>1){
            str = str.substring(0,str.lastIndexOf("副"));
            str = str+"副本_"+num+".txt";
        }
        File file = new File(str);
        if(!file.exists()){
            file.createNewFile();
        }else{
            num++;
            creatFileName(str);
        }
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        Test02 test02 = new Test02();
        test02.creatFileName(fileName);

    }
}
