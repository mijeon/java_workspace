class  HighHeel{
   String color="none color";

   public HighHeel(String color){
       //color=��red��;  //this. �����Ǿ� ����
       this.color=color;
	}    

	public static void main(String[] args){
		HighHeel h=new HighHeel("red");

		//�������� ���� ���
		System.out.println(h.color);
	}
}
