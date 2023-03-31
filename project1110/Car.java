/*
자동차를 정의하되, 최대한 현실을 반영한 수준으로 정의해보기
이 세상의 모든 사물은 단독으로 존재할 수 없음, 즉 객체와 객체간
반드시 관련성이 맺어져 있음 sun에서는 특히 특정 객체가 다른 객체를
보유한 상태를 가리켜 has a 관계라고 함
*/
class Car {
	int price=1000;
	Engine engine;  //Car has a Engine
	Wheel wheel;  //Car has a Wheel

	//자동차가 태어나는 찰나에, 그 차가 가진 부품들도 함께 
	//생성되어야 하기 때문에 생성자의 기회를 놓치지 말자
	public Car(){
		engine=new Engine();
		wheel=new Wheel();
	}
}
