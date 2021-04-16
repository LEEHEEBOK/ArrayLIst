package student2;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
//		private으로 지정했긴 때문에 접근불가.
//		stu1.name ="학생1";
		stu1.setName("학생1");
//		stu1.phone ="0001";
		stu1.setPhone("0001");
//		stu1.address ="주소1";
		stu1.setAddress("주소1");
		Student stu2 = new Student("학생2", "0002", "주소2");
		
		//Student 객체를 ArratList 에 저장하기
		//Student 객체를 담을 수 있는 ArrayList 필요
		List<Student> stuList = new ArrayList<Student>();
		
		stuList.add(stu1);
		stuList.add(stu2);
		
		//stuList의 0번 인덱스에 저장한 stu1의 name값 출력해보기
//		System.out.println(stuList.get(0).name);
		System.out.println(stuList.get(0).getName());
//		System.out.println(stuList.get(1).name);
		System.out.println(stuList.get(1).getName());
		
		String var1 = stuList.get(0).getName();
		System.out.println(var1);
		
//		stuListget(1).name = "학생2이름변경"
		stuList.get(0).setName("학생2이름변경");
//		System.out.println(stuList.get(1).name);
		System.out.println(stuList.get(1).getName());
		
		
		
		
		
		
		
		
	}

}
