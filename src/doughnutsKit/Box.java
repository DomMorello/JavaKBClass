package doughnutsKit;
import java.util.*;
public class Box {

	//Ŭ���� (����)����ʵ� ����
	public static final String DOZEN = "����";
	public static final String HALF_DOZEN = "��������";
	public static final int DOZEN_SIZE = 12;	//12�� �� �� ����
	public static final int HALF_DOZEN_SIZE = 6;	//6�� �� �� ����

	//(��ü, �ν��Ͻ�)�����ʵ� ����
	int size;	//���ٸ��� ��  �� ��ư� ������(free size)
	public String boxName;	//�ڽ� �̸�
	public int full;	//0���� size���� ä������ �뷮�� ���� ������.
	ArrayList doughnuts;
			//���� �̸� ���ڿ� ������(��ü)�� �� �� �̻� ���� ������ ����Ű�� ����
	
	public Box() {}
	
	//�ڽ� �� ���ϸ� ����������� ����.
	public Box(int size) {
		this.boxName = "���� ������";
		int full = 0;
		this.size = size;
		doughnuts = new ArrayList();
	}
	
	//�ڽ� �̸��� �ٶ� �ٸ��� �ʱ�ȭ 
	public Box(String boxName) {
		if(boxName.equals(DOZEN)) {
			this.boxName = DOZEN;
			int full = 0;
			this.size = DOZEN_SIZE;
			doughnuts = new ArrayList();
		}else {
			this.boxName = boxName;
			int full = 0;
			this.size = HALF_DOZEN_SIZE;
			doughnuts = new ArrayList();
		}
	}
	
	public void printBox() {
		System.out.println("���� ����");
		System.out.println("�ڽ�: "+this.boxName);
		Iterator it = doughnuts.iterator();
		int i = 1;
		while(it.hasNext()) {
			System.out.println(i+"��°: "+it.next());
			i++;
		}
		System.out.println("---------------");
	}
	
	//�� ���� ���� ���̽�ũ�� �� ���� ��/�� ��´�.
	public void putDoughnutsToBox(String doughnut) {
		
		if(full < size) {
			doughnuts.add(doughnut);
			full++;
		}else {
			System.out.println("���� ��/�� �뷮: "+size);
			System.out.println("�뷮 �ʰ��� "+doughnut+"��/�� ����ƿ�!");
		}
	}
	
	
	
}
