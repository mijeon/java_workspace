class UtilObj {

	//�������ϱ�
	public static int getRandom(){
	//public static void main(String[] args){
		double r=Math.random();  //0.0~~0.99xx
		System.out.println("r is "+r);

		double n=r*7;
		System.out.println("7���ϱ� n is "+n);

		int result=(int)n;
		System.out.println("���� result is "+result);

		return result;
	}
}
