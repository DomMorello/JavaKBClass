package listPractice1;

/**
 * @author Dom_Morello
 * @Project KBclass
 * @Date 2019. 11. 28.
 */
public class Product {

	public static int SERIAL_NUM = 1; // �ø��� �ѹ��� 1���� �������� ���� ����
	public static final int TYPE_SCOOTER = 0;
	public static final int TYPE_CLASSIC = 1;
	public static final int TYPE_SPORTS = 2;
	public static final String[] TYPE = { "������", "Ŭ����", "������" };
	public static final int DEF_COUNT = 1; // �⺻ ������ 1��

	private int number;
	private String name; // �𵨸�
	private int unitPrice; // �ܰ�
	private int count; // ��������
	private String type;

	// dummy
	public Product() {

	}

	// �Է¹��� ���� �� �����ڷ� �� ����
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
		System.out.println("=== ��ǰ ���� ===");
		return "[ �ø����ȣ =" + number + ",\n�𵨸�=" + name + ",\n�ǸŰ���=" + unitPrice + ",\n����=" + count + ",\n����=" + type
				+ " ]";
	}

}
