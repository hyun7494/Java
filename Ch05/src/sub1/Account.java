package sub1;

public class Account {

	//속성
	private String bank;
	private String id;
	private String name;
	private int balance;
	
	
	//기능
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void show() {
		System.out.println("--------------");
		System.out.println("은행명 : "+bank);
		System.out.println("계좌번호 : "+id);
		System.out.println("입금주 : "+name);
		System.out.println("현재잔액 : "+balance);
		System.out.println("--------------");
	
		// Account 객체 생성
		Account kb = new Account();
		
		kb.bank = "국민은행";
		kb.id = "101-11-1001";
		kb.name = "김유신";
		kb.balance = 0;
		
		// 기능
		kb.deposit(100000);
		kb.withdraw(35000);
		kb.show();
		
		// Account 객체 생성, 초기화, 기능
		Account wr = new Account();
		wr.bank = "우리은행";
		wr.id = "101-12-1111";
		wr.name = "김춘추";
		wr.balance = 10000;
		
		wr.deposit(50000);
		wr.withdraw(30000);
		wr.show();
		
	}
}
