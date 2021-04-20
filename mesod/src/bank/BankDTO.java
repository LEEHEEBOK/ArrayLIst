package bank;
//DTO( Data Transfer Object ) 대이터 전달을 위한 객체(클래스)
//필드, 기본생성자, 매개변수있는 생성자, getter/setter, to string
//DTO 클래스 사용 용도
//게시판 :게시글 등록용, 회원 : 회원 등록용, 쇼핑몰 : 상품 등록용; 
public class BankDTO {
	private int clientNumber;
	private String name;
	private String accountNumber;
	private int balance;
	
	public BankDTO() {
	
	}

	public BankDTO(int clientNumber, String name, String accontNumber, int balance){
		this.clientNumber = clientNumber;
		this.name = name;
		this.accountNumber = accontNumber;
		this.balance = balance;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Bank [clientNumber=" + clientNumber 
				+ ", name=" + name 
				+ ", accountNumber=" + accountNumber
				+ ", balance=" + balance + "]";
	}
	
	
	
	
	
}
