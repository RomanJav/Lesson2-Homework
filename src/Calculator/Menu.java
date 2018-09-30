package Calculator;

import java.util.Scanner;

public class Menu {
	int choise=10;

	Menu() {
		while (choise != 0) {
			System.out.println("Какие действия вы хотите совершить: ");
			System.out.println("1. Посчитать сумму двух чисел. ");
			System.out.println("2. Посчитать разность двух чисел. ");
			System.out.println("3. Умножить два числа. ");
			System.out.println("4. Поделить первое число на второе. ");
			System.out.println("5. Узнать находится ли число k в интервале m,n. ");
			System.out.println("6. Увидеть матрицу от 1 до k формата NxN. ");
			System.out.println("7. Найти корни квадратного уравнения вида ax^2 + bx + c = 0");
			System.out.println("8. Найти месяц по числу ");
			System.out.println("0. Выход ");
			Scanner sc = new Scanner(System.in);
			choise = sc.nextInt();
			Calculator calc = new Calculator();
			switch (choise) {
			case 1:
				calc.result('+');
				break;
			case 2:
				calc.result('-');
				break;
			case 3:
				calc.result('/');
				break;
			case 4:
				calc.result('*');
				break;
			case 5:
				calc.interval();
				break;
			case 6:
				calc.matrix();
				break;
			case 7:
				calc.roots();
				break;
			case 8:
				calc.checkMounth();
				break;

			}
		}
	}
}
