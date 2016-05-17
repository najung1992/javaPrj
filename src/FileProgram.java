import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileProgram {

	public static void main(String[] args) throws IOException {
		// 파일 입출력

//		char[] str = new char[] { 'H', 'e', 'l', 'l', 'o', 0, 'o', 'k', 0 };
//		// 0으로 구분하는뎅 문자로하면 '\0' null문자
//
//		System.out.println("Hello");
//
//		// 문자열 합치기
//		// + , concat(str)
//		System.out.println("Good" + " bye~"); // bye앞에 한칸띄우기
//		System.out.println("Good".concat(" night~"));
//
//		// 문자열 나누기
//		// split() -> lotto : 12 23 54 Line으로받았을때 구분해야함. 구분자 필요
//		String[] strs = "lotto : 12 23 54".split("5");
//		System.out.println(strs[0]);
//		System.out.println(strs[1]);
//
//		// 문자열 자르기 ( 2,4 ) -> 2<=x<4
//		"Hello".substring(2); // llo 나옴ㅋ 01234임
//
//		// 문자열 비교하기
//		String name1 = "김나정";
//		String name2 = new String("김나정");
//		System.out.println(name1 == name2); // 객체가 같은지 비교 F
//		System.out.println(name1.equals(name2)); // 문자열이 같은지 비교 T
//		System.out.println(name1 == "김나정"); // ? 뭥ㅁ 미 왜T임
//
//		// 문자열 찾기
//		System.out.println("Hello".indexOf("e")); // 1나옴 H하면 0나옴 없는거하면 -1 나옴
//		// el 찾으면 앞에꺼로 1나옴 l 찾으면 앞에꺼 2ㄴㅏ옴!!
//		int idx = "Hello how are you".indexOf("o"); // 4나옴
//		System.out.println(idx);
//		idx = "Hello how are you".indexOf("o", idx + 1); // 처음찾은거부터 다음으로~
//		System.out.println(idx);
//		idx = "Hello how are you".indexOf("o", idx + 1);
//		System.out.println(idx);
//
//		System.out.println("fil.e1.txt".lastIndexOf(".")); // 마지막.을 찾음 => 6나옴
//
//		String filename = "file1.txt";
//		idx = filename.lastIndexOf(".");
//		System.out.println(filename.substring(idx + 1)); // idx+1 로짜르면 확장자만
//															// 얻을수있음
//
//		String path = "C:\\Users\\KNJ\\nj\\lotto.txt";
//		idx = path.lastIndexOf("\\");
//		System.out.println(path.substring(idx + 1)); // 파일명뜨게해라!!
//
//		// 문자열변환 : 숫자->문자열
//		// "23"을 23 으로!!!!
//		int kor = Integer.parseInt("23"); // "23"을 숫자 23으로바꿔듐
//		System.out.println(kor + 2); // 25나옴
//
//		// String s = String.valueOf(kor);
//		String s = "" + kor;
//		System.out.println(s + "2"); // "2"안써도 2 해도 2가문자열로바뀜
//
//		// "Hello". //-> new char[]{'H','e','l','l','o',0}

		FileOutputStream fos = new FileOutputStream("C:\\Users\\easy\\workspace\\hello.txt");
		PrintStream fout = new PrintStream(fos);

		fout.printf("lotto : %d  %d  %d", 1, 25, 33);

		fout.close();
		fos.close(); // <- 버퍼없애는 역할

		System.out.println("입력받는다!!"); // ======================================

		FileInputStream fis = new FileInputStream("C:\\Users\\easy\\workspace\\hello.txt");
		Scanner fscan = new Scanner(fis);

		fscan.next();
		fscan.next();

		int n1 = fscan.nextInt();
		int n2 = fscan.nextInt();
		int n3 = fscan.nextInt();
		System.out.printf("n1 : %d , n2 : %d , n3 : %d", n1, n2, n3);

		fscan.close();
		fis.close();
	}

}
