package people;

public class People {

	private String name;
	private int rNumber;
	private String address;
	private int age;
	
	People () {
		
	}
	
	public People (String name, int rNumber, String address, int age){
		//부모클래스가 가지고 있는 생성자를 호출
		super();
		this.name =name;
		this.rNumber =rNumber;
		this.address =address;
		this.age =age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getrNumber() {
		return rNumber;
	}

	public void setrNumber(int rNumber) {
		this.rNumber = rNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
// toString 메소드를 선언하면 객체이름만으로 출력이 가능
	@Override
	public String toString() {
		return "People [name=" + name 
				+ ", rNumber=" + rNumber 
				+ ", address=" + address 
				+ ", age=" + age + "]";
	}

	
	
}
