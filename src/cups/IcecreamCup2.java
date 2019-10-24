package cups;

public class IcecreamCup2 {
	// 클래스 (정적) 상수필드 정의
	public static final int GRAMs_PER_SPOON = 200; 
	public static final String TT_CON = "콘";
	public static final String TT_CUP = "컵";
	public static final int SINGLE_CON = 1;
	public static final int DOUBLE_CON = 2;
	public static final int SINGLE_CUP = 1;
	public static final int DOUBLE_CUP = 2;
	public static final int PINT_CUP = 3;
	public static final int QUARTOR_CUP = 4;
	public static final int FAMILY_CUP = 5;
	public static final int HALFGALLON_CUP = 6;
	
	// (객체, 인스턴스) 변수필드 선언
	public int gram; // 100g?
	public int spoon; // 1 spoon == 200?
	public String name; // 컵의 이름
	public String textile; // 재질 => 콘, 종이컵?
	public int flavor; // 맛의 종류의 최대값
	public int full; 
		// 0부터 flavor까지 채워지는 용량의 상태 게이지.
	public IceCream[] ices;
	//public String[] ices; 
		// 아이스크림 이름 문자열 데이터(객체)를
		// 한개 이상 담을 공간을 가리키는 변수
		// 즉, 문자열 배열 변수 ices
	
	public IcecreamCup2() {} // 필수!!
	
	public IcecreamCup2(int gram, String name) {
		//super();
		this.gram = gram;
		this.spoon = (gram/GRAMs_PER_SPOON)+1;
		this.name = name;
		this.textile = TT_CUP;
		this.flavor = SINGLE_CUP;	
		this.full = 0; // 생략 가능...
		// 저장컵/콘 만들기... => 배열 생성 
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
		this.full = 0; // 생략 가능...
		// 저장컵/콘 만들기... => 배열 생성 
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
		this.full = 0; // 생략 가능...
		// 저장컵/콘 만들기... => 배열 생성 
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
		this.full = 0; // 생략 가능...
	}
	
	public void printCup() {
		System.out.println("아이스크림 컵/콘 내용");
		System.out.println("종류: "  + this.name);
		for (int i = 0; i < ices.length; i++) {
			IceCream ice = ices[i];			
			System.out.printf(
				"\t *%d번째 맛: %s \n", i+1,
				ice.mat );
			System.out.printf(
				"\t\t>> 성분: %s", ice.elements);
				//ices[i] );			
		}
		System.out.println("-----------------");
	}
	
	// 한가지 맛의 아이스크림 한 개를 컵/콘 담는다.
	public void putIcecreamToCup( //int num,
					IceCream icecream) {
					//String icecream) {
		// 대상 아이스크림을 콘/컵 ices 배열에 
		// 담는데, full 게이지가 flavor를 넘지 
		// 않도록 담기만 하면된다.
		if( full < flavor ) { // 담을 수 있는가?
			this.ices[full] = icecream;
			full++; // 정상적으로 아이스크림 한개 담았어요.
		} else {
			System.out.println("현재 컵/콘 용량:" + flavor);
			System.out.println("용량 초과로 "+icecream.mat+"을/를 못담아요!!");
		}
	}
	
}
