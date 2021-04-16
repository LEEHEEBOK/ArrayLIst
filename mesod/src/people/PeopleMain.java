package people;

import java.util.*;

public class PeopleMain {

	public static void main(String[] args) {

		People peo1 = new People();
		peo1.setName("이름1");
		peo1.setrNumber(1000);
		peo1.setAddress("주소1");
		peo1.setAge(10);
		People peo2 = new People();
		peo2.setName("이름2");
		peo2.setrNumber(2000);
		peo2.setAddress("주소2");
		peo2.setAge(20);
		People peo3 = new People();
		peo3.setName("이름3");
		peo3.setrNumber(3000);
		peo3.setAddress("주소3");
		peo3.setAge(30);

		List<People> peolist = new ArrayList<People>();

		peolist.add(peo1);
		peolist.add(peo2);
		peolist.add(peo3);

		for (int i = 0; i < peolist.size(); i++) {
			System.out.println("-------Construtor-------");
			System.out.println(peolist.get(i).getName());
			System.out.println(peolist.get(i).getrNumber());
			System.out.println(peolist.get(i).getAddress());
			System.out.println(peolist.get(i).getAge());
		}

		System.out.println(peolist.get(0));
		
		// PeopleService 클래스 객체 선언
		PeopleService ps = new PeopleService();
		//listPrint 메소드 호출 
		System.out.println("listPrint 호출 전");
		ps.listPrint(peolist);
		System.out.println("listPrint 호출 후");
		
		for(int i=0; i<peolist.size(); i++) {
			System.out.println(peolist.get(i));
			
		}
		
		
		
		
		
		
		
		
	}

}
