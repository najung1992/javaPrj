package collection;

public class ExamCollection {

	private Exam[] exams;
	private int current;
	// 캡슐이 깨지지않도록! private해쥼
	
	private int capacity; //전체 용량!
	private int amount; //추가 증가량
	
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
		//만약 공간이 모자라면 늘려주게끔!
		if(capacity <= current){
			//공간을 늘려준다! 
			//1. 새로운크기의 배열만든다!
			Exam[] temp = new Exam[capacity+amount];
			//2. exams배열을 temp로 옮겨야함!
			for(int i =0 ; i < capacity ; i++)
				temp[i]=exams[i]; 
			//3.기존배열은 버리고, 새로운배열이 현재 참조되는 배열이되어야함!
			exams = temp;
			//4. 늘어난 만큼 용량이 새로운 값으로 바뀌어야겠찌여?
			capacity += amount;
						
		}
		exams[current]=exam ; 
	}



}
