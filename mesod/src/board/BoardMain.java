package board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<BoardDTO> BoardList = new ArrayList<BoardDTO>();
		BoardService bs = new BoardService();
		boolean run = true;

		while (run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.글쓰기 | 2.전체글목록 | 3.글조회 | 4.글수정 | 5.글삭제 | 6.종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택> ");
			int select = scan.nextInt();
			switch (select) {
			case 1:
				BoardDTO Book = new BoardDTO();
				int Number = BoardList.size() + 1;
				System.out.print("글제목> ");
				String Title = scan.next();
				System.out.print("비밀번호> ");
				String Password = scan.next();
				System.out.print("작성자> ");
				String Writer = scan.next();
				Book = new BoardDTO(Number, Title, Password, Writer);
				BoardList.add(Book);

				break;
			case 2:
//			for(int i=0; i < BoardList.size(); i++) {
//				System.out.println(BoardList.get(i));
//			} 
				bs.BoardList(BoardList);
				break;
			case 3:
//			for(int i=0; i < BoardList.size(); i++) {
//				System.out.print("글번호>");
//				Number =scan.nextInt();
//				if(Number == BoardList.get(i).getNumber()) {
//					System.out.println(BoardList.get(i));
//				}
//			}
				bs.Search(BoardList);
				break;
			case 4:
//			for(int i=0; i < BoardList.size(); i++) {
//				System.out.print("글번호>");
//				Number =scan.nextInt();
//				System.out.print("비밀번호>");
//				Password =scan.next();
//				if(Number == BoardList.get(i).getNumber() && Password.equals(BoardList.get(i).getPassword())) {
//					System.out.print("수정하실 제목입력>");
//					Title = scan.next();
//					System.out.print("수정하실 내용입력>");
//					Writer =scan.next();
//					BoardList.get(i).setTitle(Title);
//					BoardList.get(i).setTitle(Writer);
//				}else {
//					System.out.println("아이디 또는 비밀번호가 맞지 않습니다.");
//				}
//			}
				BoardList = bs.rewind(BoardList);
				break;
			case 5:
//				for (int i = 0; i < BoardList.size(); i++) {
//					System.out.print("글번호>");
//					Number = scan.nextInt();
//					System.out.print("비밀번호>");
//					Password = scan.next();
//					if (Number == BoardList.get(i).getNumber() && Password.equals(BoardList.get(i).getPassword())) {
//						BoardList.remove(i);
//					}
//				}
				bs.remove(BoardList);
				break;
			case 6:
				System.out.println("종료하겠습니다.");
				break;
			}
		}

	}

}
