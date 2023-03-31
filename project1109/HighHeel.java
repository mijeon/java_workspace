class  HighHeel{
   String color="none color";

   public HighHeel(String color){
       //color=”red”;  //this. 생략되어 있음
       this.color=color;
	}    

	public static void main(String[] args){
		HighHeel h=new HighHeel("red");

		//하이힐의 색상 출력
		System.out.println(h.color);
	}
}
