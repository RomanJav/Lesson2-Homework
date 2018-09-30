package Calculator;

import java.text.DateFormatSymbols;
import java.util.Scanner;

public class Calculator {
	int x;
	int y;
	int z;

	public void result(char sign) {
		System.out.println("������� ������ �����: ");
		this.x = value();
		System.out.println(sign);
		System.out.println("������� ������ �����: ");
		this.y = value();
		if (sign == '+') {
			System.out.println(plus());
		} else if (sign == '-') {
			System.out.println(minus());
		} else if (sign == '/') {
			System.out.println(multip());
		} else if (sign == '*') {
			System.out.println(divis());
		}
	}

	private int value() {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		return i;
	}

	private int plus() {
		int result = x + y;
		return result;
	}

	private int minus() {
		int result = x - y;
		return result;
	}

	private int divis() {
		int result = x / y;
		return result;
	}

	private int multip() {
		int result = x * y;
		return result;
	}

	public void interval() {
		System.out.println("������� �����: ");
		this.x = value();
		System.out.println("������� ������ ������� ���������: ");
		this.y = value();
		System.out.println("������� ������� ������� ���������: ");
		this.z = value();
		intervalCheck(x, y, z);
	}

	private void intervalCheck(int k, int n, int m) {
		if (n < m) {
			if (n < k && k <= m) {
				System.out.println("����� � ��������� ( n,  m ]");
			} else if (n <= k && k < m) {
				System.out.println("����� � ��������� [ n,  m )");
			} else if (n <= k && k <= m) {
				System.out.println("����� � ��������� ( n,  m )");
			} else if (n <= k && k < m) {
				System.out.println("����� � ��������� [ n,  m )");
			} else {
				System.out.println("����� ��� ������ ��������� ����������");
			}
		} else {
			System.out.println("������� ������ ��������");
		}
	}

	public void matrix() {
		System.out.println("������� �����: ");
		this.x = value();
		matrixCreate(x);
	}

	private void matrixCreate(int k) {
		int N = (int) Math.sqrt(k);
		int matrix[][] = new int[N][N];
		int a=1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = a++;
			}
		}
		for (int i = 0; i < matrix.length; i++, System.out.println()) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(" [" + matrix[i][j] + "] ");
			}
		}
	}

	public void roots() {
		System.out.println("������� A: ");
		this.x = value();
		System.out.println("������� B: ");
		this.y = value();
		System.out.println("������� C: ");
		this.z = value();
		rootsFind(x, y, z);
	}

	private void rootsFind(int a, int b, int c) {
		System.out.println(a + "x^2 + " + b + "x + " + c + " = 0: ");
		if (a == 0) {
			System.out.println("a == 0");
			return;
		} else if (b == 0 && c == 0) {
			x = 0;
			System.out.println("���� ������: " + x);
			return;
		} else if (b == 0) {
			double x = -c / a;
			if (x >= 0) {
				x = Math.sqrt(-c / a);
				System.out.println("��� �����: " + x + ", " + (-x));
				return;
			} else {
				System.out.println("��� ������");
				return;
			}
		} else if (c == 0) {
			int root1 = 0;
			int root2 = -(b / a);
			System.out.println("��� �����: " + root1 + ", " + root2);
			return;
		}
		int discriminant = (b * b) - (4 * a * c);
		if (discriminant < 0) {
			System.out.println("������ ���");
			return;
		} else if (discriminant == 0) {
			int root = (int) -b / (2 * a);
			System.out.println("���� ������: " + root);
			return;
		} else if (discriminant > 0) {
			double root1 = ((-b + Math.sqrt(discriminant)) / (2 * a));
			double root2 = ((-b - Math.sqrt(discriminant)) / (2 * a));
			System.out.println("��� �����: " + root1 + ", " + root2);
			return;
		}
	}
	
	public void checkMounth() {
		System.out.println("������� ����� ������");
		int mNumber = value();
		if (mNumber >= 1 && mNumber <= 12) {
			String mounth = new DateFormatSymbols().getMonths()[mNumber - 1];
			System.out.println("����� ������ " +mounth);
			return;
		} else {
			System.out.println("��� ������ ������");
			return;
		}
	}
}