package day02;

import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        sub(0,str);
    }
    public static void sub(int n, String str) {
        if(str.indexOf('.')==-1){
            System.out.println(str);
        }
        else{
            System.out.println(str.substring(n, str.indexOf('.')));
            str = (str.substring(str.indexOf('.')+1));
            sub(n, str);
        }
    }
}
