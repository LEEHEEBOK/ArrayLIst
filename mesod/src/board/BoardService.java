package board;

import java.util.List;
import java.util.Scanner;

public class BoardService {
	Scanner scan = new Scanner(System.in);

	void BoardList(List<BoardDTO> BoardList) {
		for (int i = 0; i < BoardList.size(); i++) {
			System.out.println(BoardList.get(i));
		}
	}

	void Search(List<BoardDTO> BoardList) {
		System.out.print("글번호>");
		int Number = scan.nextInt();
		for (int i = 0; i < BoardList.size(); i++) {
			if (Number == BoardList.get(i).getNumber()) {
				System.out.println(BoardList.get(i));
			} else if(i>=BoardList.size()){
				System.out.println("번호를 다시 입력해주세요.");
			}
		} 
	}

	List<BoardDTO> rewind(List<BoardDTO> BoardList) {
		System.out.print("글번호>");
		int Number = scan.nextInt();
		System.out.print("비밀번호>");
		String Password = scan.next();
		for (int i = 0; i < BoardList.size(); i++) {
			if (Number == BoardList.get(i).getNumber() && Password.equals(BoardList.get(i).getPassword())) {
				System.out.print("수정하실 제목입력>");
				String Title = scan.next();
				System.out.print("수정하실 내용입력>");
				String Writer = scan.next();
				BoardList.get(i).setTitle(Title);
				BoardList.get(i).setTitle(Writer);
			} else {
				System.out.println("아이디 또는 비밀번호가 맞지 않습니다.");
			}
		}
		
		return BoardList;
	}

	void remove(List<BoardDTO> BoardList) {
		System.out.print("글번호>");
		int Number = scan.nextInt();
		System.out.print("비밀번호>");
		String Password = scan.next();

		for (int i = 0; i < BoardList.size(); i++) {
			if (Number == BoardList.get(i).getNumber() && Password.equals(BoardList.get(i).getPassword())) {
				BoardList.remove(i);
			}
		}
	}

}
