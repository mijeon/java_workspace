/*텍스트 파일을 복사해본다
1) Stream 이란? 현실에서 스트림이란 물의 흐름을 의미하는데 전산에서는 흐름의 대상이 데이터임
2) 방향에 따른 유형
    -입력스트림(InputStream) : 실행중인 프로그램으로 데이터가 들어가는 모습
	-출력스트림(OutputStream) : 실행중인 프로그램에서 데이터가 나가는 모습
3) java의 io
   -자바언어도 다른 응용프래그램 언어와 마찬가지로 IO를 지원하는데, java.io 패키지에서 지원
   -------------------------------------------------------------------------------------
   
*/
package stream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileCopy {
	//정의
	FileInputStream fis;  //파일을 대상으로 한 입력스트림
	FileOutputStream fos;  //파일을 대상으로 한 출력스트림
	String name="C:/java_workspace/guiproject/res/memo/ori.txt";

	//복사될 파일명 -> 파일명이 달라야 함
	String dest="C:/java_workspace/guiproject/res/memo/ori_copy.txt";
	
	//생성
	//일반클래스이므로 new 하자
	public FileCopy(){
		//문법적으로는 문제가 없지만 자바 외부에서 문제가 생길 수 있으므로 예외처리가 필요함
		try{  //1-1
			//1
			fis=new FileInputStream(name);
			fos=new FileOutputStream(dest);
			//System.out.println("파일에 스트림 생성 성공");

			int data=-1;  //초기선언 (최초에 바이트를 읽을 때 값이 없어야 하므로 파일에 존재하지 않는 데이터인 음수를 선언해줌)

			//2
			//int data=fis.read();
			//while 끝을 모를 때 쓰는 반복문 for() : 끝을 알 때 쓰는 반복문
			while(true){
				//1바이트 읽기
				data=fis.read();  
				if(data==-1)break;  //읽어드린 바이트가 -1이 아닐 때만 출력
				System.out.print((char)data); 
				//읽어드린 바이트를 빈 파일에 출력
				fos.write(data);
			}

		}catch(FileNotFoundException e){  //인스턴스를 생성하여 에러의 원인 객체를 넣어줌
			System.out.println("파일을 찾을 수 없습니다");
			System.out.println(e);
			//try문에서 예상했던대로 에러가 발생할 경우 프로그래밍이 비정상 종료되는것이 아니라,
			//catch문으로 진입하게 됨 이때 개발자는 적절한 에러원인에 대한 로그나 알림 등을 처리해야 함
			//현재 우리의 코드의 경우 FileNotFoundException의 인스턴스가 시스템에 의해 생성되고
			//생성된 인스턴스를 개발자에게 전달해주므로, catch문에서 적절한 자료형을 명시해 놓아야 함
		}catch(IOException e){ //2-1
			System.out.println("IO처리중 에러가 발생");
			e.printStackTrace();  //에러의 발생근원지를 찾아서 단계별로 에러를 출력
		}finally{  //try문으로 코드가 성공되건, 에러가 나서 catch문을 수행하던 finally 영역을 명시하면 실행부는 무조건 이 영역을 지나감	
			try{
				// 3-1 메모리에 올라왔을 때만
				if(fis!=null){
					fis.close();  //3 스트림 닫기
				}
			}catch(IOException e){
				e.printStackTrace();
			}
			try{
				//메모리에 올라왔을 때만
				if(fos!=null){
					fis.close();  //스트림 닫기
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
