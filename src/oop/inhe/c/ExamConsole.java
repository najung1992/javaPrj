package oop.inhe.c;

import java.util.Scanner;

public abstract class ExamConsole {

	private Exam exam;

	public ExamConsole(Exam exam) {
		this.exam = exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	public Exam getExam() {
		return exam;
	}


	public ExamConsole() {

	}


	public void inputGrade() {
		// 입력
		int math = 0;
		int eng = 0;
		int kor = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("┌────────────┐");
		System.out.println("│       성적 입력      │");
		System.out.println("└────────────┘");
		System.out.print(" 국어:");
		kor = scan.nextInt();

		while (kor > 100 || kor < 0) {
			System.out.println("제대로 입력하세욤(0~100)");
			System.out.print(" 국어:");
			kor = scan.nextInt();
		}
		System.out.print(" 영어:");
		eng = scan.nextInt();

		while (eng > 100 || eng < 0) {
			System.out.println("제대로 입력하세욤(0~100)");
			System.out.print(" 영어:");
			eng = scan.nextInt();
		}
		System.out.print(" 수학:");
		math = scan.nextInt();

		while (math > 100 || math < 0) {
			System.out.println("제대로 입력하세욤(0~100)");
			System.out.print(" 수학:");
			math = scan.nextInt();

		}

		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}

	public void print() {
		// 츌력
		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();
		int total = exam.total();
		float avg = exam.avg();
		// total = math + eng + kor;
		// avg = (total / 3.0f); // 실수결과 얻으려고 f씀

		System.out.println("┌────────────┐");
		System.out.println("│      성적 출력        │");
		System.out.println("└────────────┘");
		// for (int i = 0; i < 3; i++) {
		System.out.printf("   번호 : %d\n", 1);
		System.out.printf("   국어 : %d\n", kor);
		System.out.printf("   영어 : %d\n", eng);
		System.out.printf("   수학 : %d\n", math);
		onPrint(); //중간에~넣ㅇㅓ랑~
		System.out.printf("   총점 : %d\n", total);
		System.out.printf("   평균 : %.2f\n", avg);
		System.out.println("────────────────────");
		// }

	}

	protected abstract void onPrint();
		//상속받은 자식은 쓸수있게 protected 함
		//이 함수를 재정의해서 원하는 과목을 포함시켜라ㅏㅏ~
		//재정의하는 법? abstract 써서 꼭 재정의 하도록 만든당
	// 대신 몸뜡이 없애줘야함! 그리고 꼭 클래스도 abstract 해야함

}
