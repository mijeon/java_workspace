package use;
import plant.Tree;  //�ڹٰ� c����̺긦 �ν����� ���ϹǷ�, ���� ��δ� classpath�� ȯ�溯���� �������
							//������ ���� �� �־ ������ �� ������ ���Ƿ� ���� ������ ���� ��� ����  //���丮�� �ƴϱ� ������ / -> .���� ����
import plant.AppleTree;  //�ٸ� ���丮�� �ִ� ���� ��������

class UseTree {
	public static void main(String[] args) {  //main()�� ���� ���°Ŷ� public ���� X
		Tree t=new Tree();
		AppleTree at=new AppleTree();
		System.out.println(at.getName());
	}
}
