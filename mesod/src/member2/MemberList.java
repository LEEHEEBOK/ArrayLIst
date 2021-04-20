package member2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberList {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		List<MemberDTO> MemberList = new ArrayList<MemberDTO>();
		MemberService ms = new MemberService();
		boolean run = true;

		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.회원가입 | 2.전체회원조회 | 3.로그인 | 4.전화번호변경 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택> ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				MemberDTO member = new MemberDTO();
				System.out.print("아이디: ");
				String id = sc.next();
				System.out.print("패스워드: ");
				String password = sc.next();
				System.out.print("이름: ");
				String name = sc.next();
				System.out.print("전화번호: ");
				String phone = sc.next();
				member = new MemberDTO(id, password, name, phone);
				MemberList.add(member);
				break;
			case 2:
//				for (int i = 0; i < MemberList.size(); i++) {
//					System.out.println(MemberList.get(i));
//				}
				ms.info(MemberList);
				break;
			case 3:
//				System.out.print("아이디를 입력하세요>");
//				id = sc.next();
//				System.out.print("비밀번호를 입력하세요>");
//				password = sc.next();
//				for (int i = 0; i < MemberList.size(); i++)
//					if (MemberList.get(i).getId().equals(id)) {
//						if (MemberList.get(i).getPassword().equals(password)) {
//							System.out.println(MemberList.get(i).getName() + "님 환영합니다.");
//						} else {
//							System.out.println("비밀번호가 맞지 않습니다.");
//						}
//					} else {
//						System.out.println("아이디가 맞지 않습니다.");
//					}
				ms.login(MemberList);
				break;
			case 4:
//				System.out.print("아이디를 입력하세요>");
//				id = sc.next();
//				System.out.print("비밀번호를 입력하세요>");
//				password = sc.next();
//				for (int i = 0; i < MemberList.size(); i++)
//					if (MemberList.get(i).getId().equals(id)) {
//						if (MemberList.get(i).getPassword().equals(password)) {
//							System.out.println("변경할 전화번호를 입력해주세요.");
//							System.out.print("변경할 전화번호>");
//							phone = sc.next();
//							MemberList.get(i).setPhone(phone);
//						} else {
//							System.out.println("비밀번호가 맞지 않습니다.");
//						}
//					} else {
//						System.out.println("아이디가 맞지 않습니다.");
//					}
				MemberList = ms.UpdatePhone(MemberList);
				break;
			case 5:
				System.out.println("종료하겠습니다.");
				break;
			}sc.close();
		}
	}
}
