package day02;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 *
 * @author Bonnie
 */
public class Test07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        getNum(s, getSymbol(s));

    }

    public static void getNum(String s, char c) {
        double num1;
        double num2;
        double num3 = 0;
        double num4 = 0;
        if (s.indexOf(c) != -1 && s.indexOf('.') == -1) {
            num1 = Integer.parseInt(s.substring(0, s.indexOf(c)));
            num2 = Integer.parseInt(s.substring(s.indexOf(c)+1));
            num3 = num1 ;
            num4 = num2;
        } else if (s.indexOf(c) != -1 && s.indexOf('.') != -1) {

            if (s.indexOf('.') < s.indexOf(c)) {
                num1 = Integer.parseInt(s.substring(0, s.indexOf('.')));
                num2 = Integer.parseInt(s.substring(s.indexOf('.') + 1, s.indexOf(c)));
                for (int i = 0; i < s.indexOf(c) - s.indexOf('.') - 1; i++) {
                    num2 /= 10;
                }
                num3 = num1 + num2;
                if (s.indexOf('.', s.indexOf(c)) != -1) {

                    num1 = Integer.parseInt(s.substring(s.indexOf(c) + 1, s.indexOf('.', s.indexOf(c))));
                    num2 = Integer.parseInt(s.substring(s.indexOf('.', s.indexOf(c)) + 1));
                    for (int i = 0; i < s.length() - s.indexOf('.', s.indexOf(c)) - 1; i++) {
                        num2 /= 10;
                    }
                    num4 = num1 + num2;
                } else {
                    num4 = Integer.parseInt(s.substring(s.indexOf(c) + 1));
                }

            } else {
                num3 = Integer.parseInt(s.substring(0, s.indexOf(c)));
                num1 = Integer.parseInt(s.substring(s.indexOf(c) + 1, s.indexOf('.', s.indexOf(c))));
                num2 = Integer.parseInt(s.substring(s.indexOf('.', s.indexOf(c)) + 1));
                for (int i = 0; i < s.length() - s.indexOf('.', s.indexOf(c)) - 1; i++) {
                    num2 /= 10;
                }
                num4 = num1 + num2;
            }

            
        }if (c == '+') {
            System.out.println(num3 + num4);
        } else if (c == '-') {
            System.out.println(num3 - num4);
        } else if (c == '/') {
            System.out.println(num3 / num4);
        } else
            System.out.println(num3 * num4);
    }

    public static char getSymbol(String s) {
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) != '.' && s.charAt(i) < '0') || (s.charAt(i) > '9' && s.charAt(i) != '.')) {
                return s.charAt(i);
            }
        }
        return 0;
    }
}
