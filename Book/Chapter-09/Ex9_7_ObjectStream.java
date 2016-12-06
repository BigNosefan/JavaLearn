
import java.io.*;

class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String className;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getClassName() {
		return this.className;
	}
}
public class Ex9_7_ObjectStream {

	public static void main(String[] args) throws IOException {
		//Object Defination
		Student student = new Student();
		student.setName("小明");
		student.setId(1);
		student.setClassName("三年一班");

		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(".\\object.dat"));
		oos.writeObject(student);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(".\\object.dat"));
		Object temp;
		Student studentT = new Student();
		student.setName("");
		student.setId(0);
		student.setClassName("");

		try {
			temp = ois.readObject();
			studentT = (Student)temp;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		ois.close();
		System.out.println("姓名:\t"+studentT.getName());
		System.out.println("班级名称:\t"+studentT.getClassName());
		System.out.println("ID:\t"+studentT.getId());
	}
}
