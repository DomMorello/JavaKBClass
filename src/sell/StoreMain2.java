package sell;
import cups.IceCream;
import cups.IcecreamCup;
import cups.IcecreamCup2;
public class StoreMain2 {
	public static void main(String[] args) {
		final String[] icecreams = {
				"���� �ҷ���",
				"�ƺ��� ���ٺ�",
				"������ �ܰ���",
				"�Ҷ�����",
				"�˶�����",
				"�ɽ��� ���ϳ�",
				"���� ���� ���̿÷�",
				"�������� �ҷ���",
				"�ʴ� �� �ް�",
				"��� ġ�� Ʈ��",
				"�ٶ��� �Բ� �������",
				"�̻��� ������ �ػ���",
				"��������",
				"��Ű �� ũ��",
				"���ڳ��� ��",
				"������ �� ũ��",
				"31���Ʈ",
				"������ ����",
				"�ǽ�Ÿġ�� �Ƹ��",
				"�ϱذ� ���󺣾�"	
		};
		
		//�ֹ� 1
		IcecreamCup2 cup2 
			= new IcecreamCup2(600, 
				"(Ŭ��������) �̱��� - ����", 
				IcecreamCup2.SINGLE_CON);
		IceCream ic1 
			= new IceCream("����", 
					"������ ȣ��, �̱�����...", 1);
		IceCream ic2 
		= new IceCream("ü�������", 
				"������ ü��, �̱�����...", 2);
		cup2.putIcecreamToCup(ic1);
		cup2.putIcecreamToCup(ic2); 
		
	//	cup2.putIcecreamToCup("dfdffd"); // error
		cup2.printCup();
	}
}
