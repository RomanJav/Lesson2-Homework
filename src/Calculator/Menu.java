package Calculator;

import java.util.Scanner;

public class Menu {
	int choise=10;

	Menu() {
		while (choise != 0) {
			System.out.println("����� �������� �� ������ ���������: ");
			System.out.println("1. ��������� ����� ���� �����. ");
			System.out.println("2. ��������� �������� ���� �����. ");
			System.out.println("3. �������� ��� �����. ");
			System.out.println("4. �������� ������ ����� �� ������. ");
			System.out.println("5. ������ ��������� �� ����� k � ��������� m,n. ");
			System.out.println("6. ������� ������� �� 1 �� k ������� NxN. ");
			System.out.println("7. ����� ����� ����������� ��������� ���� ax^2 + bx + c = 0");
			System.out.println("8. ����� ����� �� ����� ");
			System.out.println("0. ����� ");
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
