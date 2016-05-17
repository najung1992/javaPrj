package oop.inhe.c;

//이 클래스는 공통분모이므로 직접 생성해서 사용해서는 안된댱
//이거 확장해서 고쳐서 사용하3
public abstract class Exam {

	private int kor;
	private int eng;
	private int math;

	public Exam() {
		// 생성자임듕~
		this(0, 0, 0);
	}

	public Exam(int kor, int eng, int math) {

		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int total() {
		// TODO Auto-generated method stub
		return total(this.kor, this.eng, this.math);
	}

	public int total(int kor, int eng, int math) {
		// TODO Auto-generated method stub
		return math + eng + kor;
	}

	public float avg() {
		return total() / 3.0f;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getKor() {
		return kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getEng() {
		return eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getMath() {
		return math;
	}

}
