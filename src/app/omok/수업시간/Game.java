package app.omok.�����ð�;

public class Game {

	public static void main(String[] args) {
		//5��
	
		Board board = new Board();
		

		while (true) {
			board.print();
			
			Stone stone = new Stone();
			
			
			
			
			stone.input();
			boolean check = board.check(stone);
			if(check)
				System.out.println("�ߺ��ӈ�");
			else 
				board.add(stone);
			
//			Stone stone = new Stone();
//			stone.input();
//	
//			board.putStone(stone);
			
			
//			stone.put(board.getBuf());

		}
	}

}
