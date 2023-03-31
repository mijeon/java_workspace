class Computer {
	Cpu cpu;
	Memory memory;
	Hard hard;

	public Computer(){
		cpu= new Cpu("i7");
		memory=new Memory(8, 240);
		hard=new Hard();
	}
}
