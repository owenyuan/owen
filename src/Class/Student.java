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
		System.out.println("ѧ��:"+id);
	}
	public Student(int id,String name){
		this.id = id;
		this.name = name;
		System.out.println("ѧ��:"+id+"\t������"+name);
	}
	public Student(int id,String name,String gender){
		this.id = id;
		this.name = name;
		this.gender = gender;
		System.out.println("ѧ��:"+id+"\t������"+name+"\t�Ա�"+gender);
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
		System.out.println("ѧ��:"+id+"\t������"+name+"\t�Ա�"+gender+"\t��ϵ�绰"+phoneNumber+"\t��ͥסַ"+homeSite);
	}
}
