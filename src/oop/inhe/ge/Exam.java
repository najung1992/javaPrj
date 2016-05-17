package oop.inhe.ge;

//이 클래스는 공통분모이므로 직접 생성해서 사용해서는 안된댱
//이거 확장해서 고쳐서 사용하3
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
		// 생성자임듕~
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
		//참조되는 값이 뭔지모르기때문에 맘대로 연산할수 없음!
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
