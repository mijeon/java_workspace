/*String 클래스에 대해 알아보자*/
class  StringTest{
	public static void main(String[] args){		
		//String 객체를  new 연산자를 사용하여 인스턴스를 생성할 경우
		//heap 영역에 그대로 올라감 (원칙대로)
		String s1=new String("korea");
		String s2=new String("korea");
		System.out.println(s1==s2);  //false; 레퍼런스 변수로 주소값 비교하므로 서로 다른 주소값을 가르킴
		

		//그러나, 암시적(묵시적) 생성법으로 String을 생성할 경우
		//상수풀(Constant Pool) 영역에 중복 생성되지 않음
		//즉 암시적 생성법은 사용빈도가 너무 높아서, 메모리 관리의 대상이 됨
		String s3="peru";
		String s4="peru";
		System.out.println(s3==s4);  //true; 상수풀로 비교를 하기 때문에 같은 주소값을 가르킴
	}
}
