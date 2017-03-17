package Class;
import Class.Person;

import java.util.Scanner;

import Class.Computer;

public class Game {
	Scanner scan = new Scanner(System.in);
	Computer computer = new Computer();
	Person person = new Person();
	public void init(){
		System.out.println("*********************");
		System.out.println("**\t猜拳，开始\t********");
		System.out.println("*********************");
		System.out.println("出拳规则： 1.剪刀 2.石头 3.布");
		System.out.print("请选择对方的角色(1：刘备 2.孙权 3.曹操)：");
		int a = scan.nextInt();
		if(a==1){
			computer.name = "刘备";
		}else if(a==2){
			computer.name = "孙权";
		}else if(a==3){
			computer.name = "曹操";
		}
		System.out.print("请输入你的姓名:");
		person.name = scan.nextLine();
		System.out.println(person.name+"vs"+computer.name+"\t对战");
	}
	public void start(){
		System.out.print("要开始吗？(y/n)：");
		String b = scan.next();
		System.out.println("----------------------------");
		if(b.equals("y")){
			person.chuQuan();
			computer.chuQuan();
		}else{
			return;
		}
		
	}
	public void getResult(){
		
	}
		

}
