package doughnutsKit;
import java.util.*;
public class Box {

	//클래스 (정적)상수필드 정의
	public static final String DOZEN = "더즌";
	public static final String HALF_DOZEN = "하프더즌";
	public static final int DOZEN_SIZE = 12;	//12개 고를 수 있음
	public static final int HALF_DOZEN_SIZE = 6;	//6개 고를 수 있음

	//(객체, 인스턴스)변수필드 선언
	int size;	//봉다리에 몇  개 담아갈 것인지(free size)
	public String boxName;	//박스 이름
	public int full;	//0부터 size까지 채워지는 용량의 상태 게이지.
	ArrayList doughnuts;
			//도넛 이름 문자열 데이터(객체)를 한 개 이상 담을 공간을 가리키는 변수
	
	public Box() {}
	
	//박스 안 정하면 프리사이즈로 정함.
	public Box(int size) {
		this.boxName = "프리 사이즈";
		int full = 0;
		this.size = size;
		doughnuts = new ArrayList();
	}
	
	//박스 이름에 다라 다르게 초기화 
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
		System.out.println("구매 내역");
		System.out.println("박스: "+this.boxName);
		Iterator it = doughnuts.iterator();
		int i = 1;
		while(it.hasNext()) {
			System.out.println(i+"번째: "+it.next());
			i++;
		}
		System.out.println("---------------");
	}
	
	//한 가지 맛의 아이스크림 한 개를 컵/콘 담는다.
	public void putDoughnutsToBox(String doughnut) {
		
		if(full < size) {
			doughnuts.add(doughnut);
			full++;
		}else {
			System.out.println("현재 컵/콘 용량: "+size);
			System.out.println("용량 초과로 "+doughnut+"을/를 못담아요!");
		}
	}
	
	
	
}
