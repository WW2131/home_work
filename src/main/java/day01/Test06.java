package day01;

import java.util.Scanner;

/**
 * Ҫ���û�����һ��������ʽ������ʹ�üӼ��˳���
 * ֻ����һ������ģ���Ҫ�������Ӽ��˳��ı��ʽ,�Ҳ���С�����㡣(��:1+2+3)
 * ����:
 * 1+2
 * Ȼ�󾭹���������������:1+2=3
 *
 * @author Bonnie
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.next();

        CalculatorStack numStack = new CalculatorStack(10);
        CalculatorStack operStack = new CalculatorStack(10);

        int index = 0;
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int res = 0;
        char ch = ' ';
        String keepNum = "";

        while (true) {
            ch = expression.substring(index, index + 1).charAt(0);
            if (operStack.isOper(ch)) {
                if (!operStack.isEmpty()) {
                    if (operStack.priority(ch) <= operStack.priority(operStack.peek())) {
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operStack.pop();
                        res = numStack.cal(num1, num2, oper);
                        numStack.push(res);
                        operStack.push(ch);
                    } else {
                        operStack.push(ch);
                    }
                } else {
                    operStack.push(ch);
                }
            } else {
                keepNum += ch;
                if (index == expression.length() - 1) {
                    numStack.push(Integer.parseInt(keepNum));
                } else {
                    if (operStack.isOper(expression.substring(index + 1, index + 2).charAt(0))) {
                        numStack.push(Integer.parseInt(keepNum));
                        keepNum = "";
                    }
                }
            }
            index++;
            if (index >= expression.length()) {
                break;
            }
        }
        while (true) {
            if (operStack.isEmpty()) {
                break;
            }
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operStack.pop();
            res = numStack.cal(num1, num2, oper);
            numStack.push(res);
        }
        int res2 = numStack.pop();
        System.out.printf("���ʽ%s = %d", expression, res2);
    }


}








