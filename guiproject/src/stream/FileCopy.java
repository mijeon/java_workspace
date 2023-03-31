/*�ؽ�Ʈ ������ �����غ���
1) Stream �̶�? ���ǿ��� ��Ʈ���̶� ���� �帧�� �ǹ��ϴµ� ���꿡���� �帧�� ����� ��������
2) ���⿡ ���� ����
    -�Է½�Ʈ��(InputStream) : �������� ���α׷����� �����Ͱ� ���� ���
	-��½�Ʈ��(OutputStream) : �������� ���α׷����� �����Ͱ� ������ ���
3) java�� io
   -�ڹپ� �ٸ� ���������׷� ���� ���������� IO�� �����ϴµ�, java.io ��Ű������ ����
   -------------------------------------------------------------------------------------
   
*/
package stream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileCopy {
	//����
	FileInputStream fis;  //������ ������� �� �Է½�Ʈ��
	FileOutputStream fos;  //������ ������� �� ��½�Ʈ��
	String name="C:/java_workspace/guiproject/res/memo/ori.txt";

	//����� ���ϸ� -> ���ϸ��� �޶�� ��
	String dest="C:/java_workspace/guiproject/res/memo/ori_copy.txt";
	
	//����
	//�Ϲ�Ŭ�����̹Ƿ� new ����
	public FileCopy(){
		//���������δ� ������ ������ �ڹ� �ܺο��� ������ ���� �� �����Ƿ� ����ó���� �ʿ���
		try{  //1-1
			//1
			fis=new FileInputStream(name);
			fos=new FileOutputStream(dest);
			//System.out.println("���Ͽ� ��Ʈ�� ���� ����");

			int data=-1;  //�ʱ⼱�� (���ʿ� ����Ʈ�� ���� �� ���� ����� �ϹǷ� ���Ͽ� �������� �ʴ� �������� ������ ��������)

			//2
			//int data=fis.read();
			//while ���� �� �� ���� �ݺ��� for() : ���� �� �� ���� �ݺ���
			while(true){
				//1����Ʈ �б�
				data=fis.read();  
				if(data==-1)break;  //�о�帰 ����Ʈ�� -1�� �ƴ� ���� ���
				System.out.print((char)data); 
				//�о�帰 ����Ʈ�� �� ���Ͽ� ���
				fos.write(data);
			}

		}catch(FileNotFoundException e){  //�ν��Ͻ��� �����Ͽ� ������ ���� ��ü�� �־���
			System.out.println("������ ã�� �� �����ϴ�");
			System.out.println(e);
			//try������ �����ߴ���� ������ �߻��� ��� ���α׷����� ������ ����Ǵ°��� �ƴ϶�,
			//catch������ �����ϰ� �� �̶� �����ڴ� ������ �������ο� ���� �α׳� �˸� ���� ó���ؾ� ��
			//���� �츮�� �ڵ��� ��� FileNotFoundException�� �ν��Ͻ��� �ý��ۿ� ���� �����ǰ�
			//������ �ν��Ͻ��� �����ڿ��� �������ֹǷ�, catch������ ������ �ڷ����� ����� ���ƾ� ��
		}catch(IOException e){ //2-1
			System.out.println("IOó���� ������ �߻�");
			e.printStackTrace();  //������ �߻��ٿ����� ã�Ƽ� �ܰ躰�� ������ ���
		}finally{  //try������ �ڵ尡 �����ǰ�, ������ ���� catch���� �����ϴ� finally ������ ����ϸ� ����δ� ������ �� ������ ������	
			try{
				// 3-1 �޸𸮿� �ö���� ����
				if(fis!=null){
					fis.close();  //3 ��Ʈ�� �ݱ�
				}
			}catch(IOException e){
				e.printStackTrace();
			}
			try{
				//�޸𸮿� �ö���� ����
				if(fos!=null){
					fis.close();  //��Ʈ�� �ݱ�
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}	
	}
	public static void main(String[] args) {
		new FileCopy();
	}
}
