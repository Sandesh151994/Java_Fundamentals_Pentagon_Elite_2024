package penta.oops.constructors;

public class Student {
	
	String name;
	
	int age;
	
	String college;
	
	Student()
	{


		
	}
	
	Student(String n)
	{
		name=n;
	}
	
	Student(String n,int a)
	{
		name=n;
		age=a;
	}
	
	Student(String n,String col)
	{
		
		name=n;
		college=col;
	}
	void disp()
	{
		System.out.println("Student name : "+name);
		System.out.println("College name  : "+college);
		System.out.println("Age : "+age);
	}
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.disp();
		
		Student s2=new Student("Pradeep Eshwar");
		s2.disp();
		
		Student s3=new Student("Jeet",25);
		s3.disp();
		
		Student s4=new Student("Gojo","XYZ");
		s4.disp();
	
		
	}

}
