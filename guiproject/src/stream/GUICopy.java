/*���Ϻ��� �۾��� GUI������� ó���غ���*/
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
	JTextField t_ori;  //������ ���
	JButton bt_ori;  //���� ��� ���� ����Ž����
	JTextField t_dest;  //���纻�� ���
	JButton bt_dest;  //����� ��ο� ���� Ž���� �����ư
	JButton bt_do;  //�������
	JFileChooser chooser;  //����Ž����

	public GUICopy(){
		t_ori=new JTextField();
		bt_ori=new JButton("����Ž��");
		t_dest=new JTextField();
		bt_dest=new JButton("������");
		bt_do=new JButton("�������");
		chooser=new JFileChooser("C:/java_workspace/guiproject/res");

		//��Ÿ�� ����
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

		//��ư��� ������ ����
		bt_ori.addActionListener(this);
		bt_dest.addActionListener(this);
		bt_do.addActionListener(this);
	}
	
	//Ž���⸦ ����, ���縦 ����ϴ� ���������� ����
	public void selectOriFile(){
		int result=chooser.showOpenDialog(this);
		System.out.println("����� ������"+result);
		//result���� ���� �������� ����ϸ� �ϱ��ؾ��ϹǷ� �������� �ο��� ����� �̿�����
		if(result==JFileChooser.APPROVE_OPTION){
			System.out.println("������ ������ �����ž�");
			//Ž���⿡�� ������ ������ �ν��Ͻ��� ����
			//���� �츮�� �ν��Ͻ��� ���� �ø� �ʿ䰡 ����
			//�̹� �����Ǿ����Ŵϱ�
			File file=chooser.getSelectedFile();
			//������ ������ ���Ͽ� ���� ��� ������ File �ν��Ͻ��� �˰� �����Ƿ�, 
			//�ϵ��� Ǯ��� ���� �� ��ü�� �����غ���
			//������ ������
			String path=file.getAbsolutePath();
			System.out.println(path);
			t_ori.setText(path);
			t_dest.setText(path);
		}
	}

	//�������
	public void copy(){
		//�������� ���α׷��� �����͸� �а�, �� ���� �����͸� �ٽ� �����Ͽ� ����ϴ°�=����
		//���������� �ʱ�ȭ������� -> �����Ϸ��� �ڵ��ʱ�ȭ ���� ����
		FileInputStream fis=null;  //������ ������� �� �Է½�Ʈ��
		FileOutputStream fos=null; //������ ������� �� ��½�Ʈ��

		//�غ�� ��Ʈ���� �̿��Ͽ� �ν��Ͻ� �����ϱ�
		String ori_path=t_ori.getText();  //�������
		String dest_path=t_dest.getText();  //����� ���
		try{
			fis=new FileInputStream(ori_path);  //�������
			fos=new FileOutputStream(dest_path);

			//������ ��Ʈ���� ����, �����͸� �а� ����
			int data=-1;  //���� �����͸� ���� ���� �����̹Ƿ�, �ǹ̾��� �ʱⰪ ����
			while(true){
				data=fis.read();  //1byte ����
				if(data==-1)break;  //-1�� �߰ߵǸ� ���� �ȵǹǷ�, write �ϱ����� �ݺ����� ����������
				fos.write(data);  //1byte ����
			}
			JOptionPane.showMessageDialog(this, "����Ϸ�");
		}catch(FileNotFoundException e){
			e.printStackTrace();			
		}catch(IOException e){  //read(), write() ������
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
		Object obj=e.getSource();  //�̺�Ʈ�� ����Ų ������Ʈ �ּҰ� ���  //JButton�� ���� �ּҰ��� ���ϹǷ� ����ȯ X
		
		if(obj==bt_ori){
			selectOriFile();
		}else if(obj==bt_dest){
			
		}else if(obj==bt_do){
			int result=JOptionPane.showConfirmDialog(this, "��������ұ��?");  //�θ� ������Ʈ
			if(result==JOptionPane.OK_OPTION){  
				copy();
			}
		}
	}
	public static void main(String[] args) {
		new GUICopy();
	}
}
