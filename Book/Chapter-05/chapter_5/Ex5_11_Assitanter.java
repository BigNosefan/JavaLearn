package chapter_5;

import Course.*;

public class Ex5_11_Assitanter {

	public static void main(String[] args) {
		Examination exam;
		Student1 zhangGang = new Student1(19,"ɽ��̫ԭ","�Ÿ�",350);
		Teacher missLiu = new Teacher(35,"beijing","����ʦ",2000,"102198");
		ComputerCourse c1 = new ComputerCourse("12345", 3.5f, "����", "Java���Գ�����Ƽ���", "5");
		c1.putInfo();
	}

}

class Examination {
	Student1 student;
	float score;
	Ex5_11_Course course;
	public Examination(Student1 student, float score, Ex5_11_Course course) {
		this.student = student;
		this.score = score;
		this.course = course;
	}
	public float putCredit() {
		float c = 0.0f;
		if(score >= 60) {
			c = course.credit;
			System.out.println("ͨ������,ʵ��ѧ��Ϊ"+c);
		}
		if(score < 60) {
			c = course.credit;
			System.out.println("δͨ������,ʵ��ѧ��Ϊ"+c);
		}
//		System.out.printlne"�γ�����"+cnurseCharacter);
		return c;
	}
}
class ComputerCourse extends Ex5_11_Course {
	Teacher teacher;
	String courseID = "00x";

	public ComputerCourse(String courseID, float credit, String courseCharacter, String description, String term) {
		super(courseID, credit, courseCharacter, description, term);
		this.teacher = teacher;
	}
	public void putInfo() {
		System.out.println("�γ̱�� "+super.courseID);
		System.out.println("����γ̱��: "+this.courseID);
		System.out.println("ѧ�� "+super.credit);
		System.out.println("�γ����� "+courseCharacter);
//		System.out.println("����ѧ�� "+super.term);
//		System.out.println("�γ̽��� "+super.description);
	}
	
}