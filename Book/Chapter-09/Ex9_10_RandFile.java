
import java.io.*;

public class Ex9_10_RandFile {
	public static void main(String[] args) {
		RandomAccessFile file;
		EmployeeRecord e1 = new EmployeeRecord(1001, "����", 5678.50);
		EmployeeRecord e2 = new EmployeeRecord(1002, "����", 6758.60);
		EmployeeRecord e3 = new EmployeeRecord(1003, "����", 5867.70);
		EmployeeRecord emp = new EmployeeRecord(0, "", 0.0);
		try {
			file = new RandomAccessFile(".\\Employee.txt", "rw");
			e1.write(file);
			e2.write(file);
			e3.write(file);
			file.seek(1*emp.size());
			emp.read(file);
			emp.setName("����");
			file.seek(1*emp.size());
			emp.write(file);
			EmployeeRecord e4 = new EmployeeRecord(1004, "���", 8867.70);
			file.seek(file.length());
			e4.write(file);
			file.seek(0);
			while(file.getFilePointer()<file.length()){
				emp.read(file);
				System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
			}
			file.close();

		} catch (IOException e) {
			System.out.println("�ļ��򿪻�д�ļ�����ļ�ʧ�ܣ�"+e.toString());
			System.exit(1);
		}
		
	}
}
class EmployeeRecord {
	int id;
	String name;
	double salary;
	EmployeeRecord(int i,String n,double s) {
		this.id = i;
		this.name = n;
		this.salary = s;
	}
	public void read(RandomAccessFile file) throws IOException {
		id = file.readInt();//��һ������
//		name = file.readUTF();
		byte[] b = new byte[10];//���峤��Ϊ10���ֽ�����b
		file.readFully(b);//���ļ���ȡ10���ֽڵ�����b
		name = new String(b);//��b�����е��ֽ����ݱ���Ϊ�ַ���
		salary = file.readDouble();//��ȡһ��double����
	}
	public void write(RandomAccessFile file) throws IOException {
		file.writeInt(id);
		byte[] b = new byte[10];
		if(name != null) {
			byte[] temp = name.getBytes();
			System.arraycopy(temp, 0, b, 0, temp.length);
		}
		file.write(b);
		file.writeDouble(salary);
	}
	public int size() {return 22;}
	public void setId(int i) {id=i;}
	public void setName(String name) {this.name = name;}
	public void setSalary(double d) {salary = d;}
	public int getId() {return id;}
	public String getName() {return name;}
	public double getSalary() {return salary;}
}
