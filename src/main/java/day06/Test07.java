package day06;

import java.io.*;

/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 *
 * @author Bonnie
 */
public class Test07 {
    public static void main(String[] args) throws IOException {
        String path = Test07.class.getClassLoader().getResource("myfile.txt").getFile();
        Test07 test07 = new Test07();
//        test07.copy1(path);
        test07.copy2(path);
    }

    /**
     * 使用单字节方式复制
     *
     * @param name 要复制的文件名
     */
    public void copy1(String name) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(name);
        String str = name.substring(0, name.indexOf("."));
        String str1 = name.substring(name.indexOf("."));
        FileOutputStream fileOutputStream = new FileOutputStream(str + "_copy" + str1);
        int len = 0;
        while ((len = fileInputStream.read()) != -1) {
			fileOutputStream.write(len);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    /**
     * 使用字节数组形式复制
     *
     * @param name 要复制的文件名
     */
    public void copy2(String name) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(name);
        String str = name.substring(0, name.indexOf("."));
        String str1 = name.substring(name.indexOf("."));
        FileOutputStream fileOutputStream = new FileOutputStream(str+"_copy"+str1);
        byte[] c = new byte[10];
        int len = 0;
        while ((len = fileInputStream.read(c))!=-1){
            System.out.println(new String(c,0,len));
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
