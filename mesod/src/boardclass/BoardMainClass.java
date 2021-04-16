package boardclass;

public class BoardMainClass {

	public static void main(String[] args) {
		
		
		BoardClass board = new BoardClass();
		board.bNumber =10;
		board.bTitle = "제목";
		board.bWriter = "작성자";
		board.bContents = "내용";
		board.boardview();
		
		board.boardWrite(20, "제목2", "작성자2", "내용2");
		board.boardview();
		
		board.boardUpdate("제목3", "내용3");
		board.boardview(); 
		
	}
	

}
