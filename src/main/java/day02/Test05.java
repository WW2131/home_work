package day02;

import java.io.*;
import java.util.Date;

/**
 * 实现文件重命名。
 * 要求用户输入一个文件名称，例如:abc.jpg
 * 然后对该名字进行重新命名，输出的格式为:系统时间毫秒值.jpg
 * 例如:1465266796279.jpg
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) throws IOException {
		OutputStream inputStream = new FileOutputStream(new File("./bb.txt"));
		// 旧的文件或目录
		File oldName = new File(String.valueOf(Test05.class.getResource("./aa.txt")));

		// 新的文件或目录
		System.out.println(oldName);
		Date date = new Date();
		File newName = new File(String.valueOf(Test05.class.getResource("./"+date.getTime()+".txt")));
		if (newName.exists()) {  //  确保新的文件名不存在
			throw new IOException("file exists");
		}
		if(oldName.renameTo(newName)) {
			System.out.println("已重命名");
		} else {
			System.out.println("Error");
		}

	}
}
