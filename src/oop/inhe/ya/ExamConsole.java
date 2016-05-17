package oop.inhe.ya;

import java.util.Scanner;

public class ExamConsole {

	private Exam exam;

	private TitlePrintListener titlePrintListener; 	
	
	public void setTitlePrintListener(TitlePrintListener titlePrintListener) {
		this.titlePrintListener = titlePrintListener;
	}

	
	private PrintListener printListener;

	public void setPrintListener(PrintListener printListener) {
		this.printListener = printListener;
	}

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

		if (titlePrintListener != null)
			titlePrintListener.onTitlePrint();
		else {
			System.out.println("┌────────────┐");
			System.out.println("│      성적 출력        │");
			System.out.println("└────────────┘");
		}
		// for (int i = 0; i < 3; i++) {
		System.out.printf("   번호 : %d\n", 1);
		System.out.printf("   국어 : %d\n", kor);
		System.out.printf("   영어 : %d\n", eng);
		System.out.printf("   수학 : %d\n", math);
		// 고쳐서 사용하는 부분을 끼워서 사용할수 있는 방법으로 바꾼당.
		// 이떄 사용한 변수는 어떤 자료형을 쓸것인가!
		// 끼워진 객체의 자료형을 꼭 알아야하는가!! 아니면 규약?만으로 해결가능해야하는가!!
		// 그때의 규약은 구현한 함수를 가지는 규약캡슐! 그것을 자바에서 객체인터페이스라고 한다
		if (printListener != null)
			printListener.onPrint();
		System.out.printf("   총점 : %d\n", total);
		System.out.printf("   평균 : %.2f\n", avg);
		System.out.println("────────────────────");
		// }

	}

	// protected abstract void onPrint();

}
