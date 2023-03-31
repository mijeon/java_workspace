/*파일복사 작업을 GUI기반으로 처리해보자*/
package stream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class GUICopy extends JFrame implements ActionListener{
	JTextField t_ori;  //원본의 경로
	JButton bt_ori;  //원본 경로 선택 파일탐색기
	JTextField t_dest;  //복사본의 경로
	JButton bt_dest;  //복사될 경로에 대한 탐색기 열기버튼
	JButton bt_do;  //복사실행
	JFileChooser chooser;  //파일탐색기

	public GUICopy(){
		t_ori=new JTextField();
		bt_ori=new JButton("원본탐색");
		t_dest=new JTextField();
		bt_dest=new JButton("복사경로");
		bt_do=new JButton("복사실행");
		chooser=new JFileChooser("C:/java_workspace/guiproject/res");

		//스타일 적용
		t_ori.setPreferredSize(new Dimension(500, 25));
		t_dest.setPreferredSize(new Dimension(500, 25));

		setLayout(new FlowLayout());
		add(t_ori);
		add(bt_ori);
		add(t_dest);
		add(bt_dest);
		add(bt_do);

		setSize(630, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//버튼들과 리스너 연결
		bt_ori.addActionListener(this);
		bt_dest.addActionListener(this);
		bt_do.addActionListener(this);
	}
	
	//탐색기를 띄우고, 복사를 희망하는 원본파일을 선택
	public void selectOriFile(){
		int result=chooser.showOpenDialog(this);
		System.out.println("당신의 선택은"+result);
		//result값을 직접 날것으로 사용하면 암기해야하므로 직관성을 부여한 상수를 이용하자
		if(result==JFileChooser.APPROVE_OPTION){
			System.out.println("선택한 파일을 얻을거야");
			//탐색기에서 선택한 파일의 인스턴스를 얻음
			//따라서 우리가 인스턴스를 직접 올릴 필요가 없음
			//이미 생성되어진거니까
			File file=chooser.getSelectedFile();
			//유저가 선택한 파일에 대한 모든 정보를 File 인스턴스가 알고 있으므로, 
			//하드의 풀경로 또한 이 객체로 조사해보자
			//파일의 절대경로
			String path=file.getAbsolutePath();
			System.out.println(path);
			t_ori.setText(path);
			t_dest.setText(path);
		}
	}

	//복사실행
	public void copy(){
		//실행중인 프로그램이 데이터를 읽고, 그 읽은 데이터를 다시 빈파일에 출력하는것=복사
		//지역변수는 초기화해줘야함 -> 컴파일러가 자동초기화 하지 않음
		FileInputStream fis=null;  //파일을 대상으로 한 입력스트림
		FileOutputStream fos=null; //파일을 대상으로 한 출력스트림

		//준비된 스트림을 이용하여 인스턴스 생성하기
		String ori_path=t_ori.getText();  //원본경로
		String dest_path=t_dest.getText();  //복사될 경로
		try{
			fis=new FileInputStream(ori_path);  //원본경로
			fos=new FileOutputStream(dest_path);

			//생성된 스트림을 통해, 데이터를 읽고 쓰자
			int data=-1;  //아직 데이터를 읽지 않은 상태이므로, 의미없는 초기값 선언
			while(true){
				data=fis.read();  //1byte 읽음
				if(data==-1)break;  //-1이 발견되면 쓰면 안되므로, write 하기전에 반복문을 빠져나오기
				fos.write(data);  //1byte 쓰기
			}
			JOptionPane.showMessageDialog(this, "복사완료");
		}catch(FileNotFoundException e){
			e.printStackTrace();			
		}catch(IOException e){  //read(), write() 때문에
			e.printStackTrace();
		}finally{
			if(fis!=null){
				try{
					fis.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			if(fos!=null){
				try{
					fis.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}	
		}
	}

	public void actionPerformed(ActionEvent e){
		Object obj=e.getSource();  //이벤트를 일으킨 컴포넌트 주소값 얻기  //JButton에 대한 주소값만 비교하므로 형변환 X
		
		if(obj==bt_ori){
			selectOriFile();
		}else if(obj==bt_dest){
			
		}else if(obj==bt_do){
			int result=JOptionPane.showConfirmDialog(this, "복사실행할까요?");  //부모 컴포넌트
			if(result==JOptionPane.OK_OPTION){  
				copy();
			}
		}
	}
	public static void main(String[] args) {
		new GUICopy();
	}
}
