package calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		CalendarConsole cal;
		Calendar calu = Calendar.getInstance();
		int yyyy = calu.get(Calendar.YEAR);
	    int mm = calu.get(Calendar.MONTH)+1;      // 0 to 11
	    int dd = calu.get(Calendar.DATE);

	    
		cal = new CalendarConsole(yyyy,mm);
		cal.printCal(yyyy,mm,dd, true);
		out: while (true) {
			

			// 오늘 달력 함수 //			
		
			System.out.println("─────────────────────────────");
			System.out.println("\t\t\t\t1. 월 달력 보기");
			System.out.println("\t\t\t\t2. 날짜 골라 보기 ");
			System.out.println("\t\t\t\t3. 종료");
			System.out.println("─────────────────────────────");
			System.out.println("입력> ");
			int menu = scan.nextInt();

			switch (menu) {

			case 1:

				System.out.println(" 년 월 입력하세요:  YYYY sp MM");
				int year = scan.nextInt();
				int month = scan.nextInt();

				try {
					cal = new CalendarConsole(year, month);
					cal.printCal(year, month,1,false);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			case 2:

				System.out.println(" 년 월 일 입력하세요: YYYY sp MM sp DD");
				int year1 = scan.nextInt();
				int month1 = scan.nextInt();
				int day1 = scan.nextInt();
				
				try {
					cal = new CalendarConsole(year1, month1);
					cal.printCal(year1, month1,day1,true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 3:

				System.out.println("프로그램을 종료합니다");
				break out;

			}

		}

	}


}
