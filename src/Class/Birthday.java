package Class;

import java.util.Scanner;

public class Birthday {
	long year;
	long month;
	long day;
	public Birthday(){}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("�������֤��");
		long s = scan.nextLong();
		Birthday Bday = new Birthday();
		Bday.year= s/100000000%10000;//ȡ����
		Bday.month= s/1000000%100;//ȡ����
		Bday.day= s/10000%100;//ȡ����
		System.out.println(Bday.year+"��"+Bday.month+"��"+Bday.day+"��");
	}
}
