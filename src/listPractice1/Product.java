package listPractice1;

/**
 * @author Dom_Morello
 * @Project KBclass
 * @Date 2019. 11. 28.
 */
public class Product {

	public static int SERIAL_NUM = 1; // 시리얼 넘버는 1부터 생산대수에 따라 증가
	public static final int TYPE_SCOOTER = 0;
	public static final int TYPE_CLASSIC = 1;
	public static final int TYPE_SPORTS = 2;
	public static final String[] TYPE = { "스쿠터", "클래식", "스포츠" };
	public static final int DEF_COUNT = 1; // 기본 개수는 1대

	private int number;
	private String name; // 모델명
	private int unitPrice; // 단가
	private int count; // 보유개수
	private String type;

	// dummy
	public Product() {

	}

	// 입력받을 때는 이 생성자로 할 것임
	public Product(String name, int unitPrice, String type) {
		this(name, unitPrice);
		this.count = (int) (Math.random() * 10) + 1;
		this.type = type;
	}

	public Product(String name, int unitPrice) {
		this(name, unitPrice, Product.DEF_COUNT, TYPE[TYPE_SCOOTER]);
	}

	public Product(String name, int unitPrice, int count, String type) {
		super();
		this.number = SERIAL_NUM++;
		this.name = name;
		this.unitPrice = unitPrice;
		this.count = count;
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		System.out.println("=== 제품 정보 ===");
		return "[ 시리얼번호 =" + number + ",\n모델명=" + name + ",\n판매가격=" + unitPrice + ",\n개수=" + count + ",\n종류=" + type
				+ " ]";
	}

}
