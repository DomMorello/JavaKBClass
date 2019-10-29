package vehicle;

public class Wheel {

	public static final int RED = 0;
	public static final int BLUE = 1;
	public static final int BLACK = 2;
	public static final int WHITE = 3;
	
	String name; //�̸�
	int size; //ũ��
	
	public Wheel(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	
	public Wheel() {}
	
	public String toString() {
		return name+", size: "+size;
	}
	
	
}
