package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String s = "(\\d+)";
        String s1= "(\\d+\\.\\d+)";
        int n = 0;
        if(str.matches(s)){
            n=Integer.parseInt(str);
            System.out.println(n/10);
        }
        if(str.matches(s1)){
            int a = 0;
            char[] chars= str.toCharArray();
            double num ;
            String ss="";
            while (a!=chars.length){
                if(chars[a]>=48&&chars[a]<=57){
                    ss+=chars[a];
                }
                a++;
            }
            num = Integer.parseInt(ss);
            for(int i=0;i<str.length()-1-str.indexOf('.');i++){
                num = num/10*1.0;
            }
            System.out.println(num*5);
        }
    }
}
