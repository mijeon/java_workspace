class UseEnemy {
	public static void main(String[] args) {
		//旋浦 3原軒研 幻級鞠, 辞稽 陥献 鯵失聖 握壱 殿嬢蟹惟
		//Enemy(String name, int x, int y, int widght, heigth)
		Enemy e1=new Enemy("印宜戚", 0,0,100,100);
		Enemy e2=new Enemy("e2", 10,0,100,100);
		Enemy e3=new Enemy("e3", 20,0,100,100);
		
		System.out.println("硲窒 穿 旋浦戚硯 "+e1.name);
		ControlEnemy control=new ControlEnemy();
		//control.test("汗焼焼たた 貝 笛析概嬢 格巷 紗雌背だだだだだだ貝 雇短戚醤 美姥汗焼焼た焼た焼た焼焼焼焼た焼焼焼焼");  //硲窒
		control.changeEnemy(e1);  //call by reference
		System.out.println("硲窒 板 旋浦戚硯 "+e1.name);
	}

		//public void changeEnemy(Enemy e){// Enemy e = e1 ( 爽社);
		//e.name="偽呪軒";
		//敗呪研 硲窒拝 凶 穿含昔切
		//敗呪研 舛税拝 凶澗 古鯵痕呪
		//穿含昔切亜 古鯵痕呪稽 級嬢姶
	//} 
}
