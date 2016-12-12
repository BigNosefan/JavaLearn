package chapter_5;

public class Ex5_13_Inheritance {

	public static void main(String[] args) {
		Manager mrZhang = new Manager();
		mrZhang.setName("�Ÿ�");
		mrZhang.setDepartment("����");
		mrZhang.setSalary(2500);
		mrZhang.setSpecial("���񴦴���");
		mrZhang.setSubsidy(500);
		System.out.println("*************Ա����Ϣ**************");
		System.out.println();
		System.out.println(mrZhang);

	}

}
class Employee {
	protected String name;
	protected double salary;
	protected String department;
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getName() {return this.name;}
	public double getSalary() {return this.salary;}
	public String getDepartment() {return this.department;}
	public String toString() {
		return "����:"+name+"\t����:"+department+"\t��������:"+salary;
	}
}
class Manager extends Employee {
	private String special;
	private double subsidy;
	public void setSpecial(String special) {this.special = special;}
	public void setSubsidy(double subsidy) {this.subsidy = subsidy;}
	public String getSpecial() {return this.special;}
	public double getSubsidy() {return this.subsidy;}
	public String toString() {
		return "����:"+name+ "\t����:"+department+"\tְ��:"+special+ "\t��������:"+salary+"\t����:"+subsidy;
	}
}