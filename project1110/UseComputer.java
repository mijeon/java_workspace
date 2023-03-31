class UseComputer {
	public static void main(String[] args) {
		Computer com=new Computer();
		System.out.println("cpu는 "+com.cpu.model);
		System.out.println("그래픽메모리는 "+com.memory.graphic+"\nssd용량은 "+com.memory.ssd);
	}
}
