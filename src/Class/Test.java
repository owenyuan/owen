package Class;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Cat cat = new Cat("小黑","黑色",2);
		Cat cat1 = new Cat("小白","白色",5);
		Scanner scan = new Scanner(System.in);
		System.out.println("呼叫");
		String name = scan.next();
		if(cat.name.equals(name)){
			System.out.println("name:"+cat.name+"colour:"+cat.colour+"age:"+cat.age);
		}else if(cat1.name.equals(name)){
			System.out.println("name:"+cat1.name+"colour:"+cat1.colour+"age:"+cat1.age);
		}else{
			System.out.println("没有这只猫");
		}
	}

}
