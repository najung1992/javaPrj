package oop.inhe.ya;

//�� Ŭ������ ����и��̹Ƿ� ���� �����ؼ� ����ؼ��� �ȵȈ�
//�̰� Ȯ���ؼ� ���ļ� �����3
public abstract class Exam {

	private int kor;
	private int eng;
	private int math;
	private AvgListener avgListener;	
	
	public void setAvgListener(AvgListener avgListener) {
		this.avgListener = avgListener;
	}

	public float avg() {
		return avgListener.avg();
	}
	
	public Exam() {
		// �������ӵ�~
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
