package oop.inhe.ge;

//�� Ŭ������ ����и��̹Ƿ� ���� �����ؼ� ����ؼ��� �ȵȈ�
//�̰� Ȯ���ؼ� ���ļ� �����3
public abstract class Exam<T> {

	private T kor;
	private T eng;
	private T math;
	private AvgListener avgListener;	
	
	public void setAvgListener(AvgListener avgListener) {
		this.avgListener = avgListener;
	}

	public float avg() {
		return avgListener.avg();
	}
	
	public Exam() {
		// �������ӵ�~
		this((T)new Integer(0),(T)new Integer(0),(T)new Integer(0));
		
	}
	public Exam(T kor, T eng, T math) {

		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public T total() {
	
		return total(this.kor, this.eng, this.math);
	}

	public  T total( T kor,  T eng,  T math) {
		
		return math + eng + kor;
		//�����Ǵ� ���� �����𸣱⶧���� ����� �����Ҽ� ����!
	}



	public void setKor(T kor) {
		this.kor = kor;
	}

	public T getKor() {
		return kor;
	}

	public void setEng(T eng) {
		this.eng = eng;
	}

	public T getEng() {
		return eng;
	}

	public void setMath(T math) {
		this.math = math;
	}

	public T getMath() {
		return math;
	}

}
