package Class;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Cat cat = new Cat("С��","��ɫ",2);
		Cat cat1 = new Cat("С��","��ɫ",5);
		Scanner scan = new Scanner(System.in);
		System.out.println("����");
		String name = scan.next();
		if(cat.name.equals(name)){
			System.out.println("name:"+cat.name+"colour:"+cat.colour+"age:"+cat.age);
		}else if(cat1.name.equals(name)){
			System.out.println("name:"+cat1.name+"colour:"+cat1.colour+"age:"+cat1.age);
		}else{
			System.out.println("û����ֻè");
		}
	}

}
