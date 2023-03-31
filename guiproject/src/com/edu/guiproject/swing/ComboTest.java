/*Swing의 jComboBox 사용해보기*/
package com.edu.guiproject.swing;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class ComboTest extends JFrame implements ActionListener{
	JComboBox combo;
	JButton bt_choice, bt_create;
	JTextArea area;
	JScrollPane scroll;  //자바의 스크롤바
	FruitList fList;

	public ComboTest(){
		combo=new JComboBox();
		bt_choice=new JButton("선택");
		bt_create=new JButton("새창");
		area=new JTextArea(15, 20);
		scroll=new JScrollPane(area);  //area에 스크롤 적용 //scroll이 area를 잡아먹음

		//플로우 레이아웃 적용
		setLayout(new java.awt.FlowLayout());  //java.awt에 있다는걸 강조하기 위해 써줌 생략가능
		
		//콤보박스에 데이터 추가하기
		combo.addItem("바나나");  //String 객체는 결국 최상위 객체로 Object를 상속받음.  = is a관계가 성립
		combo.addItem("딸기");   //String -> Object  군집화된 영역안에 있는 인스턴스들 이기 때문에 업, 다운 캐스팅 가능
		combo.addItem("포도");
		combo.addItem("수박");

		//디자인 변경
		combo.setPreferredSize(new Dimension(250, 25));

		//조립(물리적으로만 상관관계를 맺은 상태)
		add(combo);
		add(bt_choice);
		add(bt_create);
		add(scroll);  //scroll이 area를 감싸고 있으므로 scroll만 부착

		setSize(300, 400);
		setVisible(true);

	//버튼과 리스너 연결
	bt_choice.addActionListener(this);
	bt_create.addActionListener(this);
	}

	//클릭이벤트메소드 정의
	public void actionPerformed(ActionEvent e){
		//ActionEvent에는 모든 이벤트정보가 들어있다(누가, 언제, 무엇을)
		Object obj=e.getSource();  //이벤트를 일으킨 요소를 가리켜 이벤트소스라 함

		//ActionEvent는 버튼뿐만 아니라 거의 모든 이벤트에 적용할 수 있음
		//따라서 getSource()로 반환되는 이벤트를 일으킨 요소를 예측할 수 없기 때문에
		//sun에서 아예
		JButton btn=(JButton)obj;  //업캐스팅
		if(btn==bt_choice){  //좌측버튼
				//System.out.println("과일추가예정");

				//콤보박스는 html select랑은 차원이 틀린 버튼, 이미지등도 넣을 수 있는 복합적 선택상자임
				//따라서 넣을 때 Object형으로 들어감 끄집어 내올 때도 Object형으로 반환되므로, 개발자가
				//적절한 자료형으로 형변황하여 사용하면 됨
				String item=(String)combo.getSelectedItem();  //다운캐스팅
				area.append(item+"\n");
			if(fList != null){
				fList.area.append(item+"\n");
			}
		}else if(btn==bt_create){ //우측버튼
		fList=new FruitList();
		//메서드 호출
		//생성하자마자, fList에서 기다리고 있는 
		//setCombo() 메서드를 호출하여 나의 주소값을 넘겨주자 -> call by reference
		fList.setCombo(this);  //2) 여기서 this는 밑에 공중에 뜬 인스턴스를 매개변수로 붙잡은 것.
		}  
	}

	public static void main(String[] args) {
		new ComboTest();  //1) 주인이 없는 인스턴스. 공중(Heap)에 떠있는 상태
	}
}
