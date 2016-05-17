package collection.generic;

import java.util.Iterator;

public class GCollection<T> {

	private T[] data;
	private int current;
	// 캡슐이 깨지지않도록! private해쥼

	private int capacity; // 전체 용량!
	private int amount; // 추가 증가량

	public class Iterator {
		private int index;

		public Iterator() {
			index = -1;
		}

		public boolean hasNext() {
			// 다음이 있냐 없냐 확인해주는거!
			return index < current ;
		}

		public T next() {
			// 다음이 있으면 ! 그 값 갖다주는거
			return data[++index];
		}

		public void clear() {
			index = -1;

		}

	}

	public Iterator iterator() {
		// 함슈
		return new Iterator();
	}

	public GCollection() {

		current = -1;
		capacity = 3;
		amount = 5;
		data = (T[]) new Object[capacity];

	}

	public int size() {

		return current + 1;
	}

	public T get(int i) {

		return this.data[i];
	}

	public void add(T exam) {

		current++;
		// 만약 공간이 모자라면 늘려주게끔!
		if (capacity <= current) {
			// 공간을 늘려준다!
			// 1. 새로운크기의 배열만든다!
			T[] temp = (T[]) new Object[capacity + amount];
			// 2. exams배열을 temp로 옮겨야함!
			for (int i = 0; i < capacity; i++)
				temp[i] = data[i];
			// 3.기존배열은 버리고, 새로운배열이 현재 참조되는 배열이되어야함!
			data = temp;
			// 4. 늘어난 만큼 용량이 새로운 값으로 바뀌어야겠찌여?
			capacity += amount;

		}
		data[current] = exam;
	}


}
