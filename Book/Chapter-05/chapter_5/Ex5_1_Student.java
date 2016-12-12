package chapter_5;

import chapter_5.Student2;
import java.util.Date;

public class Ex5_1_Student {
		public String name;
		public String studentID;
			Date birthdate;
		public String mobilePhone;
		protected String major;
		private float gpa;
		public Professor advisor;
		public void register() {
			
		}
		public float getgpa() {
			return this.gpa;
		}
		public void setgpa() {
			gpa = 23.5f;
		}
	public static void main(String[] args) {
		Student2 st2 = new Student2();
		st2.setgpa(5);
		System.out.println(st2.getgpa());

	}

}

class Professor {
	
}