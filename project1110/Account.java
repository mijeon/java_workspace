/*
은행계좌 정의
접근제한자 : 자바의 클래스, 메서드, 변수에 대해 접근할 수 있는지 여부를 결정짓는 방법
public < protected < default < private 
public : 보안처리 X
protected : 상속관계의 객체만 접근 가능
default : 같은 디렉토리(패키지) 내의 클래스만 접근 가능, 디폴트는 명시하지 않음
private : 나 자신만 접근 가능 (외부 접근 불허)

Envapsulation(캡슐화) = 은닉화
은닉화란? 맴버변수를 private 선언하여 직접적인 외부의 접근을 막고, 이변수들에 대한
사용은 getter/setter 메스드를 통해 허용해주는 클래스 정의 기법
*/

//default로 project1110만 접근 가능
class  Account{  //클래스 구성 요소 : 변수+함수
	private int balance;  //잔고
	private String owner;  //예금주
	private String bankName;  //은행명
	
	//getter
	public int getBalance(){
		return balance;
	}

	public String getOwner(){
		return owner;
	}
	public String getBankName(){
		return bankName;
	}
	
	//setter
	public void setBalance(int balance){
		this.balance=balance;
	}
	public void setOwner(String owner){
		this.owner=owner;
	}
	public void setBankName(String bankname){
		this.bankName=bankName;
	}
}
