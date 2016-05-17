package calendar;

import java.util.Calendar;

public class CalendarConsole {

	// Calendar 인스턴스생성
	Calendar cal = Calendar.getInstance();

	// 요일 표시 헤더
	private String[] day = { "일", "월", "화", "수", "목", "금", "토" };
	// 날짜 데이터 배열
	private String[][] date = new String[6][7];

	private int wid = day.length; // 배열 가로넓이
	private int startDay; // 월 시작
	private int lastDay; // 월 마지막
	private int inputDate = 1; // 입력날짜
	private int cnt =0;
	// 생성자
	public CalendarConsole(int year, int month) throws Exception {
		if (month < 1 || month > 12) {
			System.out.println("1과 12사이의 숫자를 입력하세요");
			throw new Exception();
		} else {
			cal.set(Calendar.YEAR, year);
			cal.set(Calendar.MONTH, month - 1); // 오ㅐ-1?
			cal.set(Calendar.DATE, 1);

			startDay = cal.get(Calendar.DAY_OF_WEEK); // 월시작요일?
			lastDay = cal.getActualMaximum(Calendar.DATE); // 월마지막

			// 2차배열에 날짜입력!
			int row = 0;
			for (int i = 1; inputDate <= lastDay; i++) {
				// 시작요일이 오기전에는 공백을 넣어라!!
				if (i < startDay){
					date[row][i - 1] = "";
					cnt++;}
				else {
					// 날짜를 배열에다가 입력한당
					date[row][(i - 1) % wid] = Integer.toString(inputDate);
					inputDate++;

					// 가로 마지막열에 도착하면 행을 바꿔준다
					if (i % wid == 0)
						row++;

				}

			}

		} // else닫히는곳

	}

	public void printCal(int year, int month, int dd, boolean chkToday) {

		// 달력 요일 출력
		System.out.printf("\n───────────%d년%d월───────────", year, month);
		System.out.println("\n─────────────────────────────");
		for (int i = 0; i < wid; i++)
			System.out.print(day[i] + "\t");

		System.out.println("\n─────────────────────────────");
//		System.out.println();
		// 날짜 배열 출력
		int row = 0;
		for (int j = 1; j < lastDay + startDay; j++) {
			if ((j-cnt) == dd && chkToday)
				System.out.print("[" + date[row][(j - 1) % wid] + "]\t");
			else
				System.out.print(date[row][(j - 1) % wid] + "\t");

			if(j%wid==0){	
			System.out.println();
				row++;
			}

		}
		System.out.println();
	}


}// 아예끝
