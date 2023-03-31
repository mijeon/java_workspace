/*this 개념 알아보기
this : 레퍼런스 변수, 인스턴스 스스로를 가리키는 변수
	Cat c=new Cat();
*/
class  Cat{
	String name="나비";
	static String type="고양이과";
	
	public void String setname(String name){
		//this.name="야옹이";
		this.name=name;  //매개변수 있을 경우
	}

	public static String getType(){
		return type;
	}

	public static void main(String[] args){
		Cat c=new Cat();
		//this.name="야옹이";  //.앞은 레퍼런스 변수, 즉 this는 레퍼런스 변수임
										//이 시점에 생성된 인스턴스가 없기 때문에 this 사용 불가능
								
	}
}
