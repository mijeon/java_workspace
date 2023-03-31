/*클래스를 정의해보자*/
class  Arrow{
	/*자바에서는 클래스가 보유한 속성을 클래스 영역에 넣어야 함
	즉, 어떠한 메서드 안에라도 넣으면 안됨*/

	String color="yellow";  //color 속성(=property)
	int velX=5;  //velX 속성(=property)
	
	//메서드 정의
	//리턴값이 없는 메서드 = void()
	public void fly(){
		System.out.println("화살이 "+velX+" 속도로 날아감");
	}
}
