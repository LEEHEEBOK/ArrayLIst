package bank;

import java.util.List;
import java.util.Scanner;

public class Bankservice {
	Scanner sc = new Scanner(System.in);

	// service 클래스 : 처리를 담당하는 클래스
//입금처리를 위한 메소드
	/*
	 * 메소드이름 : deposit 매개변수 : clientList 리턴 : clientList (Main Class가 가장 최신의 데이터를
	 * 가져야 하기 때문에)
	 */
	List<BankDTO> deposit(List<BankDTO> clientList) {
		System.out.print("계좌 : ");
		String accountNumber = sc.next();
		System.out.print("입금액 : ");
		int deposit = sc.nextInt();
		for (int i = 0; i < clientList.size(); i++) {
			if (clientList.get(i).getAccountNumber().equals(accountNumber)) {
				System.out.println(clientList.get(i).getBalance() + deposit);
				int balance = clientList.get(i).getBalance() + deposit;
				clientList.get(i).setBalance(balance);
			} else {
				System.out.println("계좌번호를 다시 입력해주시길 바랍니다.");
			}
		}
		return clientList;
	}

	List<BankDTO> withdraw(List<BankDTO> clientList) {
		System.out.print("계좌 : ");
		String accountNumber = sc.next();
		System.out.print("출금액 : ");
		int withdraw = sc.nextInt();
		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber()))
				if (withdraw <= clientList.get(i).getBalance()) {
					System.out.println(clientList.get(i).getBalance() - withdraw);
					int balance = clientList.get(i).getBalance() - withdraw;
					clientList.get(i).setBalance(balance);
				} else {
					System.out.println("잔고가 부족합니다.");
				}
			else {
				System.out.println("없는계좌번호입니다.");
			}
		}
		return clientList;
	}

}
