package app.omok.연습;

public class Game {

	public static void main(String[] args) {
		//5목
	
		Board board = new Board();
		

		while (true) {
			board.print();
			
			Stone stone = new Stone();
			
			//여기다가 승패검사
	
			boolean win = board.win();
			if(win)
				System.out.println("승리하셨따");
			
			else{	
			
			
			stone.input();
			boolean check = board.check(stone);
			if(check)
				System.out.println("중복임댱");
			else 
				board.add(stone);
			}
//			Stone stone = new Stone();
//			stone.input();
//	
//			board.putStone(stone);
			
			
//			stone.put(board.getBuf());

		}
	}

}
