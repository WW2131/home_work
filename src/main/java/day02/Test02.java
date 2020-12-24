package day02;

/**
 * 将字符串123,456,789,012根据","拆分，并输出拆分后的每一项
 *
 * @author Bonnie
 */
public class Test02 {
    public static void main(String[] args) {
        String str = "123,456,789,012";
        sub(0, str);
    }

    public static void sub(int n, String str) {
        if(str.indexOf(',')==-1){
            System.out.println(str);
        }
        else{
            System.out.println(str.substring(n, str.indexOf(',')));
            str = (str.substring(str.indexOf(',')+1));
            sub(n, str);
        }
    }
}
