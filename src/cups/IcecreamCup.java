package cups;

public class IcecreamCup {

	//Ŭ���� (����)����ʵ� ����
	public static final int GRAMs_PER_SPOON = 200;
	public static final String TT_CON = "��";
	public static final String TT_CUP = "��";
	public static final int SINGLE_CON = 1;
	public static final int DOUBLE_CON = 2;
	public static final int SINGLE_CUP = 1;
	public static final int DOUBLE_CUP = 2;;
	public static final int PINT_CUP = 3;
	public static final int QUARTOR_CUP = 4;
	public static final int FAMILY_CUP = 5;
	public static final int HALFGALLON_CUP = 6;

	//(��ü, �ν��Ͻ�)�����ʵ� ����
	public int gram;
	public int spoon;
	public String name;	//�� �̸�
	public String textile;	//���� -> ��, ������?
	public int flavor;	//�� ������ �ִ�
	public int full;	//0���� flavor���� ä������ �뷮�� ���� ������.
	public String[] ices;
			//���̽�ũ�� �̸� ���ڿ� ������(��ü)�� �� �� �̻� ���� ������ ����Ű�� ���� ��, ���ڿ� �迭 ���� ices
	
	public IcecreamCup() {}
	public IcecreamCup(int gram, String name) {
		this.gram = gram;
		this.spoon = (gram/GRAMs_PER_SPOON)+1;
		this.name = name;
		this.textile = TT_CUP;
		this.flavor = SINGLE_CUP;
		this.full = 0;
		this.ices = new String[flavor];
	}
	
	public IcecreamCup(int gram, String name, int flavor) {
		this.gram = gram;
		this.spoon = (gram/GRAMs_PER_SPOON)+1;
		this.name = name;
		this.textile = TT_CUP;
		this.flavor = flavor;
		this.full = 0;
		this.ices = new String[flavor];
	}
	
	public IcecreamCup(int gram, int spoon, String name, String textile, int flavor) {
		this.gram = gram;
		this.spoon = spoon;
		this.name = name;
		this.textile = textile;
		this.flavor = flavor;
		this.full = 0;
		this.ices = new String[flavor];
	}
	
	public IcecreamCup(int gram, int spoon, String name, String textile, int flavor, String[] ices) {
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
		System.out.println("����: "+this.name);
		for(int i=0; i < ices.length; i++) {
			System.out.printf("\t *%d��° ��: %s \n", i+1, ices[i]);
		}
		System.out.println("---------------");
	}
	
	//�� ���� ���� ���̽�ũ�� �� ���� ��/�� ��´�.
	public void putIcecreamToCup(String icecream) {
		//��� ���̽�ũ���� ��/�� ices�迭�� ��µ�, full�������� flavor�� ���� �ʵ���
		// ��⸸ ���ȴ�.
		if(full < flavor) {
			this.ices[full] = icecream;
			full++;
		}else {
			System.out.println("���� ��/�� �뷮: "+flavor);
			System.out.println("�뷮 �ʰ��� "+icecream+"��/�� ����ƿ�!");
		}
	}
	
	
	
}
