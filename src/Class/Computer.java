package Class;

import java.util.Random;

public class Computer {
	static String name;
	int score;
	public Computer(){}
	public Computer(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	public static void chuQuan(){
		Random random = new Random();
		int j = random.nextInt(3)+1;
		if(j==1){
			System.out.println(name+"��ȭ������");
		}else if(j==2){
			System.out.println(name+"��ȭ:ʯͷ");
		}else if(j==3){
			System.out.println(name+"��ȭ:��");
		}else{
			System.out.println("��������");
		}
	}

}
