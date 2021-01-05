package day06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Bonnie
 *
 */
public class Test03 {
    int num = 0;
    public void creatMakeDirName(String str) throws IOException {
        if(num==1){
            str = str+"副本_"+num;
        }
        if(num>1){
            str = str.substring(0,str.lastIndexOf("副"));
            str = str+"副本_"+num;
        }
        File file = new File(str);
        if(!file.exists()){
            file.mkdir();
        }else{
            num++;
            creatMakeDirName(str);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        Test03 test03 = new Test03();
        test03.creatMakeDirName(fileName);
    }
}
