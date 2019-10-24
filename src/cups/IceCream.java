package cups;
import java.util.*;

public class IceCream {
	public String mat; //flavor
	public String elements;	//���е�
	public int number; //������ȣ
	public Date openDay;	//�����
	
	public void printIceCream() {
		System.out.println("icecream #"+number);
		System.out.println("��: "+mat);
		System.out.println("���е�: "+elements);
		System.out.println("�����: "+openDay);
		System.out.println("--------------------");
	}
	
	public IceCream() {}
	
	public IceCream(String mat, String elements, int number) {
		this.mat = mat;
		this.elements = elements;
		this.number = number;
		this.openDay = new Date();
	}
	
	public IceCream(String mat, String elements, int number, Date openDay) {
		this.mat = mat;
		this.elements = elements;
		this.number = number;
		this.openDay = openDay;
	}
}
