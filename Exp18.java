package Prac;

class person
{
	String name;
	int age;
	
	public person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
class employee extends person
{
	String employeeId;
	double salary;
	
	public employee(String name,int age,String employeeId,double salary)
	{
		super(name,age);
		this.employeeId=employeeId;
		this.salary=salary;
	}
}
public class Exp18 {

	public static void main(String[] args) {
		person p=new person("Hirali",19);
		employee e=new employee("Priya",20,"1050",20);
		
		System.out.println("Person name: "+p.name);
		System.out.println("Person age: "+p.age);
		
		System.out.println("Employee name: "+e.name);
		System.out.println("Employee age: "+e.age);
		System.out.println("Employee ID: "+e.employeeId);
		System.out.println("Employee salary: "+e.salary);
	}

}
