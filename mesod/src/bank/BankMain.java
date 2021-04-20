package bank;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<BankDTO> clientList = new ArrayList<BankDTO>();
		Bankservice bs = new Bankservice();
		boolean run = true;

		while (run) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.고객등록(get,set) | 2.고객등록(생성자) | 3.입금 | 4.출금 | 5.고객리스트 | 6.종료");
			System.out.println("--------------------------------------------------------------------");
			System.out.print("선택>");
			int select = sc.nextInt();

			switch (select) {

			case 1:
				BankDTO client = new BankDTO();
				int clientNumber = clientList.size() + 1;
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("계좌 : ");
				String accountNumber = sc.next();
				System.out.print("입금액 : ");
				int balance = sc.nextInt();
				client.setName(name);
				client.setAccountNumber(accountNumber);
				client.setBalance(balance);
				client.setClientNumber(clientNumber);
				clientList.add(client);
				break;

			case 2:
				clientNumber = clientList.size() + 1;
				System.out.print("이름 : ");
				name = sc.next();
				System.out.print("계좌 : ");
				accountNumber = sc.next();
				System.out.print("입금액 : ");
				balance = sc.nextInt();
				client = new BankDTO(clientNumber, name, accountNumber, balance);
				clientList.add(client);
				break;
			case 3:
//				System.out.print("계좌 : ");
//				accountNumber = sc.next();
//				System.out.print("입금액 : ");
//				int deposit = sc.nextInt();
//				for (int i = 0; i < clientList.size(); i++) {
//					if (clientList.get(i).getAccountNumber().equals(accountNumber)) {
//						System.out.println(clientList.get(i).getBalance() + deposit);
//						balance = clientList.get(i).getBalance() + deposit;
//						clientList.get(i).setBalance(balance);
//					} else {
//						System.out.println("계좌번호를 다시 입력해주시길 바랍니다.");
//					}
//				}
				clientList = bs.deposit(clientList);
				
				//리턴이 있는 메소드는 호출 방식 앞에 받을 객체가 필요함.
				break;
			case 4:
//				System.out.print("계좌 : ");
//				accountNumber = sc.next();
//				System.out.print("출금액 : ");
//				int withdraw = sc.nextInt();
//				for (int i = 0; i < clientList.size(); i++) {
//					if (accountNumber.equals(clientList.get(i).getAccountNumber()))
//						if (withdraw <= clientList.get(i).getBalance()) {
//							System.out.println(clientList.get(i).getBalance() - withdraw);
//							balance = clientList.get(i).getBalance() - withdraw;
//							clientList.get(i).setBalance(balance);
//						} else {
//							System.out.println("잔고가 부족합니다.");
//						}
//					else {
//						System.out.println("없는계좌번호입니다.");
//					}
//				}
				clientList = bs.withdraw(clientList);
				break;
			case 5:
				for (int i = 0; i < clientList.size(); i++) {
//					clientlist.get(i).setClientNumber(i+1);
					System.out.println(clientList.get(i));
				}
				break;
			case 6:
				System.out.println("종료하겠습니다.");
				break;
			}
		}
		sc.close();

	}
}
