package Class;

import java.util.Scanner;

public class Birthday {
	long year;
	long month;
	long day;
	public Birthday(){}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("输入身份证号");
		long s = scan.nextLong();
		Birthday Bday = new Birthday();
		Bday.year= s/100000000%10000;//取到年
		Bday.month= s/1000000%100;//取到月
		Bday.day= s/10000%100;//取到日
		System.out.println(Bday.year+"年"+Bday.month+"月"+Bday.day+"日");
	}
}
