/*이 클래스는, 하위의 모든 음향기기 클래스들이 반드시 따라야 하는 
공통적인 메서드 구현을 강요, 강제하기 위한 클래스임(PL 입장임)*/
package com.edu.guiproject.music;

//특정 개발시점에, 그 내용을 확정지어서는 안되거나, 계획만을 세우고 싶을 때는
//클래스의 내용을 작성할 수 없음 이때는 클래스를 불완전한 상태로 두고,
//자식 클래스로 하여금 미완성된 클래스를 완성되게끔 구현을 강제할 수 있는데,
//이떄 사용되는 클래스 정의 기법을 추상 클래스라 함
abstract public class MusicPlayer{  //new 연산자를 통해 객체를 만들지 못하고 상속을 통해 자식 클래스만 만들 수 있음

	//볼륨을 조절한다
	abstract public void setVolume();  

	//mp3 파일을 실행할 수 있다
	abstract public void playMp3();
}
