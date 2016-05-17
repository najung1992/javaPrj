package collection.object;

public class ProgramTest {

	public static void main(String args[]){
		
		ObjectCollection list = new ObjectCollection();
		list.add(3);
		list.add("25");
		list.add(new Exam());
		//이렇게 암거나 집어넣을수 있다!! 
		// 데이터 한꺼번에집어넣었다뺄수있다.
	}
}
