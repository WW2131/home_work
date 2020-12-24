package day01;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		String str = "";
		int i=0;
		do {
			int z = (int) Math.round(Math.random() * 122);
			if (z >= 97 || (z >= 65 && z <= 91)) {
				str+=(char) z;
				i++;
			}
		} while (i != 5);
		System.out.println(str);
		String str1;
		Scanner scanner = new Scanner(System.in);
		str1 = scanner.next();
		if(str1.toLowerCase().equals(str.toLowerCase())){
			System.out.println("输入正确");
		}else {
			System.out.println("输入错误");
		}
	}
}
