package day01;

public class CalculatorStack {
	private int top = -1;
	private int stack[];
	private int maxSize;

	public CalculatorStack(int maxSize) {
		this.maxSize = maxSize;
		this.stack = new int[maxSize];
	}

	public boolean isFull() {
		return top == this.maxSize - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("Õ»ÂúÁË");
			return;
		}
		this.stack[++top] = value;
	}

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Õ»Îª¿Õ");
		}
		int value = this.stack[top--];
		return value;
	}

	public void showStack() {
		if (isEmpty()) {
			System.out.println("Õ»Îª¿Õ");
			return;
		}
		for (int i = this.top; i > -1; i--) {
			System.out.printf("stack[%d]=%d\n", i, stack[i]);
		}
	}

	public int priority(int oper) {
		if (oper == '*' || oper == '/') {
			return 1;
		} else if (oper == '+' || oper == '-') {
			return 0;
		} else {
			return -1;
		}
	}

	public boolean isOper(char val) {
		return val == '*' || val == '-' || val == '+' || val == '/';
	}

	public int cal(int num1, int num2, int oper) {
		int res = 0;
		switch (oper) {
		case '+':
			res = num1 + num2;
			break;
		case '-':
			res = num2 - num1;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			res = num2 / num1;
			break;
		default:
			break;
		}
		return res;
	}

	public int peek() {
		return stack[top];
	}
}
