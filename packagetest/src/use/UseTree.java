package use;
import plant.Tree;  //자바가 c드라이브를 인식하지 못하므로, 앞의 경로는 classpath로 환경변수를 만들어줌
							//파일이 따로 들어가 있어서 컴파일 시 에러가 나므로 에러 방지를 위해 경로 지정  //디렉토리가 아니기 때문에 / -> .으로 변경
import plant.AppleTree;  //다른 디렉토리에 있는 파일 가져오기

class UseTree {
	public static void main(String[] args) {  //main()은 남을 쓰는거라서 public 선언 X
		Tree t=new Tree();
		AppleTree at=new AppleTree();
		System.out.println(at.getName());
	}
}
