package cups;
import java.util.*;

public class IceCream {
	public String mat; //flavor
	public String elements;	//성분들
	public int number; //고유번호
	public Date openDay;	//출시일
	
	public void printIceCream() {
		System.out.println("icecream #"+number);
		System.out.println("맛: "+mat);
		System.out.println("성분들: "+elements);
		System.out.println("출시일: "+openDay);
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
