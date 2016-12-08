
public class Ex10_2_StringToInt {

	public static void main(String[] args) {
		String grade[] = {"66","56","78","89","83"};
		int sum = 0 ;
		double average = 1.0;
		System.out.println("成绩分别为:");
		for(int i=0; i<grade.length; i++) {
			int gradeInt = Integer.parseInt(grade[i]);
			System.out.println(gradeInt);
			sum = sum+gradeInt;
		}
		average = ((double)sum)/grade.length;
		System.out.println(average);
	}

}
