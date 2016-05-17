package capsule;

public class Exam {

		private int kor;
		private int eng;
		private int math;

		public static void setKor(Exam exam, int kor){
			exam.kor=kor;
		}
		
		public static int getKor(Exam exam){
			return exam.kor;
		}
		
		public static void setEng(Exam exam, int eng){
			exam.eng=eng;
		}
		
		public static int getEor(Exam exam){
			return exam.eng;
		}
		
		public static void setMath(Exam exam, int math){
			exam.math=math;
		}
		
		public static int getMath(Exam exam){
			return exam.math;
		}
		
		static int total(Exam exam) {
			// TODO Auto-generated method stub
			return total(exam.kor ,exam.eng ,exam.math);
		}

		static int total(int kor,int eng, int math) {
			// TODO Auto-generated method stub
			return math + eng + kor;
		}
}
