package collection.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import collection.generic.GCollection.Iterator;

public class ProgramTest {

	public static void main(String args[]) {

		List<String> list = new ArrayList<>(); // List, Iterable

		list.add("hello");
		list.add("모르겠다");
		list.add("모르겠다");
		list.add("hello");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		for (String s : list)
			System.out.println(s); // 쉽게 쓰라고 쥼

		System.out.println("----------------Set----------------");

		Set<String> sets = new HashSet<>();
		sets.add("hello");
		sets.add("모르겠다");
		sets.add("hello");
		sets.add("모르겠다");

		// for(String s : sets)
		// System.out.println(s);
		Set<String> tset = new TreeSet<>();
		// 랜덤으로드러간당
		tset.add("23");
		tset.add("3");
		tset.add("71");
		tset.add("59");

		System.out.println(tset);

		System.out.println("----------------Map----------------");

		Map<String, String> m = new HashMap<>();
		m.put("name", "송중기");
		m.put("add", "경기도 광명시");
		m.put("name", "김나정"); // 뒤에잇는거로 덮여씌워져서 나온다

		System.out.println(m.get("name"));

	}

	//
	// GCollection list = new GCollection();
	//
	// for (int i = 0; i < 10; i++)
	// list.add(i + 1);
	//
	// Thread th = new Thread(new Runnable() {
	// // 익명클래스씀
	//
	// @Override
	// public void run() {
	// print(2, list); // 보조스레드
	//
	// }
	// });
	// // for(int i=0;i<100;i++)//갯수나 위치를 사용흐름에서 결정!
	// // list.get(i);
	// //
	// //
	// // while(list.hasNext()) // 인덱스는 자기자신이 알아서 결정하게 해야지!
	// // list.next();
	// //
	// th.start();
	// print(1, list);
	// // print(2, list);
	// }

	private static void print(int key, GCollection list) {

		// for (int i = 0; i < 300; i++)
		// System.out.printf("key : %d , value:%d \n", key, list.get(i));
		// list.clear();
		// while(list.hasNext())
		// System.out.printf("key : %d , value:%d \n", key, list.next());
		//
		ArrayList a = new ArrayList<>();

		Map<String, String> m = new HashMap<>(); // Hash = 식별자

		Iterator it = list.iterator();
		it.clear();
		while (it.hasNext())
			System.out.printf("key : %d , value:%d \n", key, it.next());
	}

}
