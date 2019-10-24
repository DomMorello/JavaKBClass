package cups;

public class IcecreamCup {

	//클래스 (정적)상수필드 정의
	public static final int GRAMs_PER_SPOON = 200;
	public static final String TT_CON = "콘";
	public static final String TT_CUP = "컵";
	public static final int SINGLE_CON = 1;
	public static final int DOUBLE_CON = 2;
	public static final int SINGLE_CUP = 1;
	public static final int DOUBLE_CUP = 2;;
	public static final int PINT_CUP = 3;
	public static final int QUARTOR_CUP = 4;
	public static final int FAMILY_CUP = 5;
	public static final int HALFGALLON_CUP = 6;

	//(객체, 인스턴스)변수필드 선언
	public int gram;
	public int spoon;
	public String name;	//컵 이름
	public String textile;	//재질 -> 콘, 종이컵?
	public int flavor;	//맛 종류의 최댓값
	public int full;	//0부터 flavor까지 채워지는 용량의 상태 게이지.
	public String[] ices;
			//아이스크림 이름 문자열 데이터(객체)를 한 개 이상 담을 공간을 가리키는 변수 즉, 문자열 배열 변수 ices
	
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
		this.full = 0; // 생략 가능...
	}
	
	public void printCup() {
		System.out.println("아이스크립 컵/콘 내용");
		System.out.println("종류: "+this.name);
		for(int i=0; i < ices.length; i++) {
			System.out.printf("\t *%d번째 맛: %s \n", i+1, ices[i]);
		}
		System.out.println("---------------");
	}
	
	//한 가지 맛의 아이스크림 한 개를 컵/콘 담는다.
	public void putIcecreamToCup(String icecream) {
		//대상 아이스크림을 콘/컵 ices배열에 담는데, full게이지가 flavor를 넘지 않도록
		// 담기만 허용된다.
		if(full < flavor) {
			this.ices[full] = icecream;
			full++;
		}else {
			System.out.println("현재 컵/콘 용량: "+flavor);
			System.out.println("용량 초과로 "+icecream+"을/를 못담아요!");
		}
	}
	
	
	
}
