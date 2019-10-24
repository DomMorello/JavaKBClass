package cups;

public class IcecreamCup2 {
	// Ŭ���� (����) ����ʵ� ����
	public static final int GRAMs_PER_SPOON = 200; 
	public static final String TT_CON = "��";
	public static final String TT_CUP = "��";
	public static final int SINGLE_CON = 1;
	public static final int DOUBLE_CON = 2;
	public static final int SINGLE_CUP = 1;
	public static final int DOUBLE_CUP = 2;
	public static final int PINT_CUP = 3;
	public static final int QUARTOR_CUP = 4;
	public static final int FAMILY_CUP = 5;
	public static final int HALFGALLON_CUP = 6;
	
	// (��ü, �ν��Ͻ�) �����ʵ� ����
	public int gram; // 100g?
	public int spoon; // 1 spoon == 200?
	public String name; // ���� �̸�
	public String textile; // ���� => ��, ������?
	public int flavor; // ���� ������ �ִ밪
	public int full; 
		// 0���� flavor���� ä������ �뷮�� ���� ������.
	public IceCream[] ices;
	//public String[] ices; 
		// ���̽�ũ�� �̸� ���ڿ� ������(��ü)��
		// �Ѱ� �̻� ���� ������ ����Ű�� ����
		// ��, ���ڿ� �迭 ���� ices
	
	public IcecreamCup2() {} // �ʼ�!!
	
	public IcecreamCup2(int gram, String name) {
		//super();
		this.gram = gram;
		this.spoon = (gram/GRAMs_PER_SPOON)+1;
		this.name = name;
		this.textile = TT_CUP;
		this.flavor = SINGLE_CUP;	
		this.full = 0; // ���� ����...
		// ������/�� �����... => �迭 ���� 
		//this.ices = new String[flavor];
		this.ices = new IceCream[flavor];
	}
	
	public IcecreamCup2(int gram, String name, int flavor) {
		//super();
		this.gram = gram;
		this.spoon = (gram/GRAMs_PER_SPOON)+1;
		this.name = name;
		this.textile = TT_CUP;
		this.flavor = flavor;	
		this.full = 0; // ���� ����...
		// ������/�� �����... => �迭 ���� 
//		this.ices = new String[flavor];
		this.ices = new IceCream[flavor];
	}
	
	public IcecreamCup2(int gram, int spoon, String name, String textile, int flavor) {
		//super();
		this.gram = gram;
		this.spoon = spoon;
		this.name = name;
		this.textile = textile;
		this.flavor = flavor;	
		this.full = 0; // ���� ����...
		// ������/�� �����... => �迭 ���� 
//		this.ices = new String[flavor];
		this.ices = new IceCream[flavor];
	}
	
	public IcecreamCup2(int gram, int spoon, 
			String name, String textile, 
			int flavor, IceCream[] ices) {
		//super();
		this.gram = gram;
		this.spoon = spoon;
		this.name = name;
		this.textile = textile;
		this.flavor = flavor;
		this.ices = ices;
		this.full = 0; // ���� ����...
	}
	
	public void printCup() {
		System.out.println("���̽�ũ�� ��/�� ����");
		System.out.println("����: "  + this.name);
		for (int i = 0; i < ices.length; i++) {
			IceCream ice = ices[i];			
			System.out.printf(
				"\t *%d��° ��: %s \n", i+1,
				ice.mat );
			System.out.printf(
				"\t\t>> ����: %s", ice.elements);
				//ices[i] );			
		}
		System.out.println("-----------------");
	}
	
	// �Ѱ��� ���� ���̽�ũ�� �� ���� ��/�� ��´�.
	public void putIcecreamToCup( //int num,
					IceCream icecream) {
					//String icecream) {
		// ��� ���̽�ũ���� ��/�� ices �迭�� 
		// ��µ�, full �������� flavor�� ���� 
		// �ʵ��� ��⸸ �ϸ�ȴ�.
		if( full < flavor ) { // ���� �� �ִ°�?
			this.ices[full] = icecream;
			full++; // ���������� ���̽�ũ�� �Ѱ� ��Ҿ��.
		} else {
			System.out.println("���� ��/�� �뷮:" + flavor);
			System.out.println("�뷮 �ʰ��� "+icecream.mat+"��/�� ����ƿ�!!");
		}
	}
	
}
