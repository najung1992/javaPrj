package collection;

public class ExamCollection {

	private Exam[] exams;
	private int current;
	// ĸ���� �������ʵ���! private����
	
	private int capacity; //��ü �뷮!
	private int amount; //�߰� ������
	
	public ExamCollection() {

		exams = new Exam[3];
		current = -1;
		capacity = 3;
		amount = 5;

	}

	public int size() {

		return current+1;
	}

	public Exam get(int i) {

		return this.exams[i];
	}

	public void add(Exam exam) {
		current++;
		//���� ������ ���ڶ�� �÷��ְԲ�!
		if(capacity <= current){
			//������ �÷��ش�! 
			//1. ���ο�ũ���� �迭�����!
			Exam[] temp = new Exam[capacity+amount];
			//2. exams�迭�� temp�� �Űܾ���!
			for(int i =0 ; i < capacity ; i++)
				temp[i]=exams[i]; 
			//3.�����迭�� ������, ���ο�迭�� ���� �����Ǵ� �迭�̵Ǿ����!
			exams = temp;
			//4. �þ ��ŭ �뷮�� ���ο� ������ �ٲ��߰��?
			capacity += amount;
						
		}
		exams[current]=exam ; 
	}



}
