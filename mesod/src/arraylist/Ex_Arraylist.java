package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_Arraylist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		String word = "";

		// 단어 입력하기
		for (int i = 0; i < 5; i++) {
			System.out.print("단어를 설정 : ");
//			word =sc.nextLine();
//			list.add(i, word);
			list.add(sc.next());
		}
		// 단어 출력하기
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 가장 긴 단어 찿기
		int longWord = 0; // 단어 길이가 가장 긴 데이터를 저장된 인덱스를 가져오기 위한 변수
		for (int i = 0; i < list.size(); i++) {
			if (list.get(longWord).length() < list.get(i).length()) {
				longWord = i;
				// list에서 0번 인덱스에 있는 값의 길이
			}
		}
		System.out.println("가장 긴 단어는 : " + list.get(longWord));

	}

}
