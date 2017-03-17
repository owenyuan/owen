package Class;

public class Student {
	int id;
	String name;
	String gender;
	long phoneNumber;
	String homeSite;
	public Student(){}
	public Student(int id){
		this.id = id;
		System.out.println("学号:"+id);
	}
	public Student(int id,String name){
		this.id = id;
		this.name = name;
		System.out.println("学号:"+id+"\t姓名："+name);
	}
	public Student(int id,String name,String gender){
		this.id = id;
		this.name = name;
		this.gender = gender;
		System.out.println("学号:"+id+"\t姓名："+name+"\t性别"+gender);
	}
	public Student(int id,String name,String gender,long phoneNumber){
		this(id,name,gender,phoneNumber,"");
	}
	public Student(int id,String name,String gender,long phoneNumber,String homeSite){
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.homeSite = homeSite; 
		System.out.println("学号:"+id+"\t姓名："+name+"\t性别"+gender+"\t联系电话"+phoneNumber+"\t家庭住址"+homeSite);
	}
}
