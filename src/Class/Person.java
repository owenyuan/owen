package Class;

import java.util.Scanner;

public class Person {
	String name;
	int score;

	public static void chuQuan() {
		Scanner scan = new Scanner(System.in);
		System.out.print("���ȭ��1.���� 2.ʯͷ 3.�� (������Ӧ������):");
		int playChoose = scan.nextInt();
		
	}

	public static void showChoose(String name, int choose) {
		switch (choose) {
		case 1:
			System.out.println(name+"��ȭ������");
			break;
		case 2:
			System.out.println(name+"��ȭ��ʯͷ");
			break;
		case 3:
			System.out.println(name+"��ȭ����");
			break;
		default:
			break;
		}
	}
}
