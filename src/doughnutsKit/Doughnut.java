package doughnutsKit;

public class Doughnut {
	public String name; //���� �̸�
	public String flavor;	//��
	
	public void printIceCream() {
		System.out.println("���� �̸�: "+name);
		System.out.println("�� : "+flavor);
		System.out.println("--------------------");
	}
	
	public Doughnut() {}
	
	public Doughnut(String name, String flavor) {
		this.name = name;
		this.flavor = flavor;
	}
	
	public String printDoughnut() {
		return this.name + "(" + this.flavor + ")";
	}

}
