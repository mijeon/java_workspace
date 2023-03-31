/*적군을 정의함*/
class  Enemy{
	//객체자료형은 null로 초기화, 아무런 주소값도 가리키고 있지 않음을 뜻함
	String name;  
	int x;  //0
	int y;  //0
	int width;  //0
	int height;  //0

	public Enemy(String name, int x, int y, int width, int height){
		this.name=name;
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
}
