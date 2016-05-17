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
		list.add("�𸣰ڴ�");
		list.add("�𸣰ڴ�");
		list.add("hello");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		for (String s : list)
			System.out.println(s); // ���� ����� ��

		System.out.println("----------------Set----------------");

		Set<String> sets = new HashSet<>();
		sets.add("hello");
		sets.add("�𸣰ڴ�");
		sets.add("hello");
		sets.add("�𸣰ڴ�");

		// for(String s : sets)
		// System.out.println(s);
		Set<String> tset = new TreeSet<>();
		// �������ε巯����
		tset.add("23");
		tset.add("3");
		tset.add("71");
		tset.add("59");

		System.out.println(tset);

		System.out.println("----------------Map----------------");

		Map<String, String> m = new HashMap<>();
		m.put("name", "���߱�");
		m.put("add", "��⵵ �����");
		m.put("name", "�質��"); // �ڿ��մ°ŷ� ������������ ���´�

		System.out.println(m.get("name"));

	}

	//
	// GCollection list = new GCollection();
	//
	// for (int i = 0; i < 10; i++)
	// list.add(i + 1);
	//
	// Thread th = new Thread(new Runnable() {
	// // �͸�Ŭ������
	//
	// @Override
	// public void run() {
	// print(2, list); // ����������
	//
	// }
	// });
	// // for(int i=0;i<100;i++)//������ ��ġ�� ����帧���� ����!
	// // list.get(i);
	// //
	// //
	// // while(list.hasNext()) // �ε����� �ڱ��ڽ��� �˾Ƽ� �����ϰ� �ؾ���!
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

		Map<String, String> m = new HashMap<>(); // Hash = �ĺ���

		Iterator it = list.iterator();
		it.clear();
		while (it.hasNext())
			System.out.printf("key : %d , value:%d \n", key, it.next());
	}

}
