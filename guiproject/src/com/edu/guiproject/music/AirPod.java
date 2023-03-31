/*
에어팟 플레이어를 정의
단, 반드시 볼륨조절, mp3 파일 실행이 지원되어야 함
*/
package com.edu.guiproject.music;
import com.edu.guiproject.machine.JetWing;  //JetWing이 다른 패키지에 있기 때문에 import

public class AirPod extends MusicPlayer implements JetWing{  //패키지화된 클래스는 사용을 위해 public 선언
							/*is a*/						/*is a*/
	String color="pink";
	
	public void wifi(){
		
	}

	//부모의 추상메서드를 자식이 오버라이딩하도록 구현이 강제됨
	public void playMp3(){
		
	}
	public void setVolume(){
		
	}
	public void fly(){
		
	}
}
