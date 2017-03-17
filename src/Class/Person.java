package Class;

import java.util.Scanner;

public class Person {
	String name;
	int score;

	public static void chuQuan() {
		Scanner scan = new Scanner(System.in);
		System.out.print("请出拳：1.剪刀 2.石头 3.布 (输入相应的数字):");
		int playChoose = scan.nextInt();
		
	}

	public static void showChoose(String name, int choose) {
		switch (choose) {
		case 1:
			System.out.println(name+"出拳：剪刀");
			break;
		case 2:
			System.out.println(name+"出拳：石头");
			break;
		case 3:
			System.out.println(name+"出拳：布");
			break;
		default:
			break;
		}
	}
}
