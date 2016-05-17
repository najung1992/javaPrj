package collection.object;

public class ObjectCollection {

	private Object[] data;
	private int current;
	// ĸ���� �������ʵ���! private����
	
	private int capacity; //��ü �뷮!
	private int amount; //�߰� ������
	
	public ObjectCollection() {

		current = -1;
		capacity = 3;
		amount = 5;
		data = new Object[capacity];

	}

	public int size() {

		return current+1;
	}

	public Object get(int i) {

		return this.data[i];
	}

	public void add(Object exam) {
		current++;
		//���� ������ ���ڶ�� �÷��ְԲ�!
		if(capacity <= current){
			//������ �÷��ش�! 
			//1. ���ο�ũ���� �迭�����!
			Object[] temp = new Object[capacity+amount];
			//2. exams�迭�� temp�� �Űܾ���!
			for(int i =0 ; i < capacity ; i++)
				temp[i]=data[i]; 
			//3.�����迭�� ������, ���ο�迭�� ���� �����Ǵ� �迭�̵Ǿ����!
			data= temp;
			//4. �þ ��ŭ �뷮�� ���ο� ������ �ٲ��߰��?
			capacity += amount;
						
		}
		data[current]=exam ; 
	}



}
