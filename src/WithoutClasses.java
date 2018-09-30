import java.util.Scanner;
import java.text.DateFormatSymbols;

public class WithoutClasses {

	public static void main(String[] args) {
//		Ex.1 Определить принадлежность некоторого значения  k  интервалам 
//		( n,  m ], [ n,  m ), ( n, m ), [ n, m ].
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Scanner in2 = new Scanner(System.in);
		int m = in2.nextInt();
		Scanner in3 = new Scanner(System.in);
		int k = in3.nextInt();
		if (n < m) {
			if (n < k && k <= m) {
				System.out.println("Число в диапазоне ( n,  m ]");
			} else if (n <= k && k < m) {
				System.out.println("Число в диапазоне [ n,  m )");
			} else if (n <= k && k <= m) {
				System.out.println("Число в диапазоне ( n,  m )");
			} else if (n <= k && k < m) {
				System.out.println("Число в диапазоне [ n,  m )");
			} else {
				System.out.println("Число вне границ указанных диапазонов");
			}
		} else {
			System.out.println("Неверно указан диапазон");
		}
		

//		Ex.2 Вывести числа от 1 до k  в виде матрицы  N x N  слева направо и сверху вниз.
		int min = 1;
		int matrix[][] = new int[3][3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = min++;
			}
		}
		for (int i = 0; i < matrix.length; i++, System.out.println()) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(" [" + matrix[i][j] + "] ");
			}
		}
//		Ex.3 Найти  корни  квадратного  уравнения.  Параметры  уравнения  передавать  с командной строкой.
		Scanner in4 = new Scanner(System.in);
		int a = in4.nextInt();
		Scanner in5 = new Scanner(System.in);
		int b = in5.nextInt();
		Scanner in6 = new Scanner(System.in);
		int c = in6.nextInt();
		System.out.println(a + "x^2 + " + b + "x + " + c + " = 0, a != 0: ");
		int discriminant = (b * b) - (4 * a * c);
		if (discriminant < 0) {
			System.out.println("Корней нет");
		} else if (discriminant == 0) {
			int root = (int) -b / (2 * a);
			System.out.println("Один корень: " + root);
		} else if (discriminant > 0) {
			double root1 = ((-b + Math.sqrt(discriminant)) / (2 * a));
			double root2 = ((-b - Math.sqrt(discriminant)) / (2 * a));
			System.out.println("Два корня: " + root1 + ", " + root2);
		}
		
//		Ex.4 Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. 
//		Осуществить проверку корректности ввода чисел.
		Scanner in7 = new Scanner(System.in);
		int mNumber = in7.nextInt();
		if (mNumber >= 1 && mNumber <= 12) {
			String mounth = new DateFormatSymbols().getMonths()[mNumber - 1];
			System.out.println(mounth);
		} else {
			System.out.println("Нет такого месяца");
		}
		in.close();
		in2.close();
		in3.close();
		in4.close();
		in5.close();
		in6.close();
		in7.close();
	}

}
