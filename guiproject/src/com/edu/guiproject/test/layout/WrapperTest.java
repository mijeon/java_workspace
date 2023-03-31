package test.layout;
class WrapperTest {
	public static void main(String[] args) {
		int x=3;
		String str=Integer.toString(x);
		System.out.println(str+str);
		int result=Integer.parseInt(str);
		System.out.println(result+result);
	}
}
