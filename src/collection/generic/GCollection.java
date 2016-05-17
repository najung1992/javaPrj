package collection.generic;

import java.util.Iterator;

public class GCollection<T> {

	private T[] data;
	private int current;
	// ĸ���� �������ʵ���! private����

	private int capacity; // ��ü �뷮!
	private int amount; // �߰� ������

	public class Iterator {
		private int index;

		public Iterator() {
			index = -1;
		}

		public boolean hasNext() {
			// ������ �ֳ� ���� Ȯ�����ִ°�!
			return index < current ;
		}

		public T next() {
			// ������ ������ ! �� �� �����ִ°�
			return data[++index];
		}

		public void clear() {
			index = -1;

		}

	}

	public Iterator iterator() {
		// �Խ�
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
		// ���� ������ ���ڶ�� �÷��ְԲ�!
		if (capacity <= current) {
			// ������ �÷��ش�!
			// 1. ���ο�ũ���� �迭�����!
			T[] temp = (T[]) new Object[capacity + amount];
			// 2. exams�迭�� temp�� �Űܾ���!
			for (int i = 0; i < capacity; i++)
				temp[i] = data[i];
			// 3.�����迭�� ������, ���ο�迭�� ���� �����Ǵ� �迭�̵Ǿ����!
			data = temp;
			// 4. �þ ��ŭ �뷮�� ���ο� ������ �ٲ��߰��?
			capacity += amount;

		}
		data[current] = exam;
	}


}
