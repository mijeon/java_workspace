/*자바에서는 모든 코드는 반드시 class 안에 두어야 하므로, 
현실의 객체를 표현하지 않는 클래스라 할지라도, main() 메서드를
두려면 클래스 안에 적성해야 함*/
//main()을 두기 위한 클래스
class UseArrow {
	//main()은 개발자가 명시적으로 직접 그 이름을 호출할 수 없음
	//java.exe에 의해, 즉 실행 시 무조건 main()을 찾음
	public static void main(String[] args) {
		//화살 1개 인스턴스 생성
	new Arrow();  //가능
	System.out.println("인스턴스 생성 성공");
	
	//int(자료형) b=3;
	//Arrow - 사용자 정의 자료형
	Arrow a=new Arrow();
	a.fly();
	System.out.println("화살의 색상은 "+a.color);
	}
}
