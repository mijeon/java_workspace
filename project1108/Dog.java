/*강아지를 정의함*/
class  Dog{
	int age=3;

	public static void main(String[] args) {
		//강아지의 나이를 5세로 변경 후 출력
		Dog d=new Dog();
		d.age=5;
		System.out.println(d.age);

		Dog d2=new Dog();
		d2.age=10;
		System.out.println(d2.age);
	}
}
