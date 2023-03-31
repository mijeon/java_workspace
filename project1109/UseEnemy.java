class UseEnemy {
	public static void main(String[] args) {
		//적군 3마리를 만들되, 서로 다른 개성을 갖고 태어나게
		//Enemy(String name, int x, int y, int widght, heigth)
		Enemy e1=new Enemy("곰돌이", 0,0,100,100);
		Enemy e2=new Enemy("e2", 10,0,100,100);
		Enemy e3=new Enemy("e3", 20,0,100,100);
		
		System.out.println("호출 전 적군이름 "+e1.name);
		ControlEnemy control=new ControlEnemy();
		//control.test("느아아ㅏㅏ 난 큰일났어 너무 속상해ㅐㅐㅐㅐㅐㅐ난 멍청이야 힝구느아아ㅏ아ㅏ아ㅏ아아아아ㅏ아아아아");  //호출
		control.changeEnemy(e1);  //call by reference
		System.out.println("호출 후 적군이름 "+e1.name);
	}

		//public void changeEnemy(Enemy e){// Enemy e = e1 ( 주소);
		//e.name="독수리";
		//함수를 호출할 때 전달인자
		//함수를 정의할 때는 매개변수
		//전달인자가 매개변수로 들어감
	//} 
}
