package collection.generic;
import java.util.ArrayList;
import java.util.Scanner;


public class Program8 {

	static GCollection list;
	
	public static void main(String[] args) {
		// 메인메뉴우ㅜㅜ

		//초기화 하는 작업!
//		list.exams = new Exam[3];
//		list.current = -1; 
		//이 초기화문들을 ExamCollection안으로 옮기자!
		
		list = new GCollection();
		
		while (true) {
		
			switch (mainMenu()) {
			case 1:
				inputGrade();
				break;
			case 2:
				printGrade();
				break;
			case 3:
				exit();
				break;

			default:
				System.out.println("※※※※※다시고르세염ㅋ※※※※※");

			}
		}

	}

	private static void exit() {
		// 종료
		System.out.println("종료합니다!!");
		System.exit(0);

	}

	private static void printGrade() {
		// 츌력

//		Exam exam = new Exam();

		System.out.println("┌────────────┐");
		System.out.println("│     성적 출력         │");
		System.out.println("└────────────┘");
		
		for (int i = 0; i <list.size(); i++) {	
			
//			exam =(Exam)list.get(i); 
			//가져온 자료형이 Exam인지 아닌지 알아야할필요가있다!
			Exam exam = null;
			Object obj = list.get(i);
			if(obj instanceof Exam) //Exam의 인스턴스냐? 그렇다면!!
				exam= (Exam)obj;
			
			int math = exam.math;
			int eng = exam.eng;
			int kor = exam.kor;
			
			int total=math +eng + kor;
			float avg = (total / 3.0f);
			
			
			 
			System.out.printf("   번호 : %d\n", i + 1);
			System.out.printf("   국어 : %d\n",kor);
			System.out.printf("   영어 : %d\n", eng);
			System.out.printf("   수학 : %d\n", math);
			System.out.printf("   총점 : %d\n", total);
			System.out.printf("   평균 : %.2f\n", avg);
			System.out.println("──────────────");
		}
		
	}

	private static void inputGrade() {
		// 입력
		int math = 0;
		int eng = 0;
		int kor = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("┌────────────┐");
		System.out.println("│     성적 입력         │");
		System.out.println("└────────────┘");
		System.out.print("   국어:");
		kor = scan.nextInt();

		while (kor > 100 || kor < 0) {
			System.out.println("제대로 입력하세욤(0~100)");
			System.out.print("   국어:");
			kor = scan.nextInt();
		}
		System.out.print("   영어:");
		eng = scan.nextInt();

		while (eng > 100 || eng < 0) {
			System.out.println("제대로 입력하세욤(0~100)");
			System.out.print("   영어:");
			eng = scan.nextInt();
		}
		System.out.print("   수학:");
		math = scan.nextInt();

		while (math > 100 || math < 0) {
			System.out.println("제대로 입력하세욤(0~100)");
			System.out.print("   수학:");
			math = scan.nextInt();

		}
		
		Exam exam = new Exam();
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
//		list.exams[++list.current] = exam;
//		이것도 바꾸세용~ ??()로!
		list.add(exam);
	
	
	}

	private static int mainMenu() {
		// 메인메뉴
		Scanner scan = new Scanner(System.in);
		System.out.println("┌────────────┐");
		System.out.println("│     메인 메뉴         │");
		System.out.println("└────────────┘");
		System.out.println("   1.성적 입력");
		System.out.println("   2.성적 출력");
		System.out.println("   3.종료");
		System.out.print("   선택> ");
		int menu = scan.nextInt();

		return menu;
	}
}
