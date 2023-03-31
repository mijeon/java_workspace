/*이 클래스는 실행부로 쓰기 위한 클래스*/
class UseCar {
	public static void main(String[] args) {
		//자동차 1대를 메모리에 올려보자
		Car c=new Car();
		//System.out.println("이 차의 엔진은 "+c.engine);
		System.out.println("이 차의 엔진은 "+c.engine.type);
		System.out.println("이 차의 최대 속력은 "+c.engine.maxSpeed);
		System.out.println("타이어의 색상은 "+c.wheel.color);
	}
}
