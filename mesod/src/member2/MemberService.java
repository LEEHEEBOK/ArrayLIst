package member2;

import java.util.List;
import java.util.Scanner;

public class MemberService {
	Scanner sc = new Scanner(System.in);

	// 변경이 필요한 정보들은 return을 이용 함. 그 이외에 것들은 void를
	// 쓰면 됩니다. return 을 쓸경우 main으로 돌아면 return의 매개변수 꼭 앞에 쓸것
	// get.set은 set은 정보를 입력 및 수정이고
	// get은 정보를 볼려고 쓰는것 입니다.
	// 별 다섯개 입니다.
	void info(List<MemberDTO> MemberList) {
		for (int i = 0; i < MemberList.size(); i++) {
			System.out.println(MemberList.get(i));

		}

	}

	void login(List<MemberDTO> MemberList) {
		System.out.print("아이디를 입력하세요>");
		String id = sc.next();
		System.out.print("비밀번호를 입력하세요>");
		String password = sc.next();
		for (int i = 0; i < MemberList.size(); i++)
			if (MemberList.get(i).getId().equals(id) && MemberList.get(i).getPassword().equals(password)) {
				System.out.println(MemberList.get(i).getName() + "님 환영합니다.");
			} else {
				// 보안성으로 인해서 두루뭉실하게 이야기 해주는것 입니다.
				System.out.println("아이디 또는 비밀번호가 틀립니다.");
			}
	}

	List<MemberDTO> UpdatePhone(List<MemberDTO> MemberList) {
		System.out.print("아이디를 입력하세요>");
		String id = sc.next();
		System.out.print("비밀번호를 입력하세요>");
		String password = sc.next();
		for (int i = 0; i < MemberList.size(); i++)
			if (MemberList.get(i).getId().equals(id) && MemberList.get(i).getPassword().equals(password)) {
				System.out.println("변경할 전화번호를 입력해주세요.");
				System.out.print("변경할 전화번호>");
				String phone = sc.next();
				MemberList.get(i).setPhone(phone);
			} else {
				System.out.println("아이디 또는 비밀번호가 틀립니다.");
			}
		return MemberList;
	}
}
