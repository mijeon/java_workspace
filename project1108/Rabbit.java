/*토끼를 정의함*/
public class  Rabbit{
	String color="white";
	int age=10;
	public static final int LEGS=4;  //변수가 아님을 강조하기 위해 대문자 사용

	/**
	내가 만든 토끼의 생성자
	*/
	public Rabbit(){
		
	}

	/**
	토끼가 참 열심히 뛰는 메서드
	*/
	public void jump(){
		System.out.println("깡총깡총");
	}

	public static void main(String[] args){
		int age=7;  //main() 안에 있는 속성으로 클래스의 속성과 상관없음
		Rabbit r=new Rabbit();
		Rabbit r2=new Rabbit();
		//System.out.println(age);
	}
}
