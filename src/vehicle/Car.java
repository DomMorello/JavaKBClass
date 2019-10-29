package vehicle;

public class Car {

	String brand; //�ڵ��� ����ȸ��
	int tire = 4; 
	int capacity;
	String name;
	int color;
	Wheel[] wheels = new Wheel[tire];
	
	public Car(String brand, String name, int color) {
		super();
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.capacity = 0;
	}
	
	public Car() {}
	
	@Override
	public String toString() {
		return name+"brand: "+" color: "+color;
	}
	
	public void assembleWheel() {
		for(int i=0; i < wheels.length; i++) {
			if(wheels[0].size == wheels[i].size) {
				System.out.println("["+i+"]"+wheels[i].name+"�� �����߽��ϴ�.");
			}else {
				System.out.println(wheels[i].name+"�� ����� "+wheels[0].name+"�� ������� �ٸ��ϴ�. ���� ����� �����Ͻʽÿ�.");
			}
		}//for��
	}//�޼��峡
	
	public void addWheel(Wheel wheel) {
		if(capacity == wheels.length) {	//�迭�� �� �� ������ �߰� ����
			System.out.println("\t>>��������! "+wheel+"�� �߰����� ���߽��ϴ�.");
		}else {
			for(int i=0; i < wheels.length; i++) {	
				if(wheels[i] == null) {	//����ִ� ������ �߰�
					wheels[i] = wheel;
					System.out.println("["+i+"]"+wheel+"��(��) ��� �߰��߽��ϴ�.");
					capacity++;
					break;
				}//if��
			}//for��
		}//else��
	}//�޼��峡
	
	
}
