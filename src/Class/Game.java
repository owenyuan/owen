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
		System.out.println("**\t��ȭ����ʼ\t********");
		System.out.println("*********************");
		System.out.println("��ȭ���� 1.���� 2.ʯͷ 3.��");
		System.out.print("��ѡ��Է��Ľ�ɫ(1������ 2.��Ȩ 3.�ܲ�)��");
		int a = scan.nextInt();
		if(a==1){
			computer.name = "����";
		}else if(a==2){
			computer.name = "��Ȩ";
		}else if(a==3){
			computer.name = "�ܲ�";
		}
		System.out.print("�������������:");
		person.name = scan.nextLine();
		System.out.println(person.name+"vs"+computer.name+"\t��ս");
	}
	public void start(){
		System.out.print("Ҫ��ʼ��(y/n)��");
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
