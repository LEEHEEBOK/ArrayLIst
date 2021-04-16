package people;

import java.util.List;

public class PeopleService {

		//
		
	void listPrint(List<People>list1) {
	System.out.println("listprint 호출 ");
	System.out.println(list1.get(0));
	
	list1.get(1).setName("ps에서 변경");
	System.out.println(list1.get(1));
	}
}
