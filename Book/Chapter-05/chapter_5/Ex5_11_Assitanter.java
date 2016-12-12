package chapter_5;

import Course.*;

public class Ex5_11_Assitanter {

	public static void main(String[] args) {
		Examination exam;
		Student1 zhangGang = new Student1(19,"山西太原","张刚",350);
		Teacher missLiu = new Teacher(35,"beijing","刘老师",2000,"102198");
		ComputerCourse c1 = new ComputerCourse("12345", 3.5f, "必修", "Java语言程序设计技术", "5");
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
			System.out.println("通过考试,实际学分为"+c);
		}
		if(score < 60) {
			c = course.credit;
			System.out.println("未通过考试,实际学分为"+c);
		}
//		System.out.printlne"课程性质"+cnurseCharacter);
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
		System.out.println("课程编号 "+super.courseID);
		System.out.println("本类课程编号: "+this.courseID);
		System.out.println("学分 "+super.credit);
		System.out.println("课程性质 "+courseCharacter);
//		System.out.println("开设学期 "+super.term);
//		System.out.println("课程介绍 "+super.description);
	}
	
}