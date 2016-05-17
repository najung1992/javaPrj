
public class ExamLib {
	public static int total(Exam exam) {
		// TODO Auto-generated method stub
		return total(exam.kor ,exam.eng ,exam.math);
	}

	public static int total(int kor,int eng, int math) {
		// TODO Auto-generated method stub
		return math + eng + kor;
	}
}
