/*우리가 정의한 Account 클래스가 정말로 은닉화되어 있는지 테스트해봄*/
class UseAccount {
	public static void main(String[] args) {
		Account acc=new Account();
		//acc.balance=700;  //접근제한 때문에 불가능

		//데이터 넣기 (wirte==setter)
		acc.setBalance(100000);
	

		//조회해보자 (read==getter)
		int balance=acc.getBalance();
		System.out.println("현재 잔고는 "+balance);
	}
}
