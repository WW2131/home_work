package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Bonnie
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='@'){
				System.out.println(str.substring(0,i));
				break;
			}
		}
	}
}
