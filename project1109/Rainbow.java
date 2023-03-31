/*무지개 색상을 랜덤으로 출력하는 클래스를 정의*/
class Rainbow {
	//자바는 배열 선언 시 그 크기를 명시해야 함
	//js는 크기를 명시하지 않아도 고무줄처럼 늘어날 수 있지만, java의 배열은 불가능함
	String[] color=new String[7];

	public Rainbow(){
		//색상을 채우자
		color[0]="red";
		color[1]="orange";
		color[2]="yellow";
		color[3]="green";
		color[4]="blue";
		color[5]="navy";
		color[6]="purple";
		
		//UtilObj util=new UtilObj();  //인스턴스 생성
		//int n=util.getRandom();
		

		//유틸클래그의 랜덤함수값을 가져와서 아래의 배열 인덱스 자리에 넣기
		//getRandom() 메서드는 인스턴스 메서드이므로, UtilObj() 클래스의
		//인스턴스를 생성한 후에 사용 가능
		int n=UtilObj.getRandom();  //static 선언 시
		System.out.println(color[n]);  
		//System.out.println(color[new UtilObj().getRandom()]) 직접 대입도 가능
		//System.out.println(color[1]);  
	}

	public static void main(String[] args) {
		new Rainbow();  //Rainbow를 생성만 함
		
	}
}
