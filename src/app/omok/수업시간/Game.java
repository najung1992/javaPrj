package app.omok.수업시간;

public class Game {

	public static void main(String[] args) {
		//5목
	
		Board board = new Board();
		

		while (true) {
			board.print();
			
			Stone stone = new Stone();
			
			
			
			
			stone.input();
			boolean check = board.check(stone);
			if(check)
				System.out.println("중복임댱");
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
