package sell;

import cups.IcecreamCup;

public class StoreMain {

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
		
		//�ֹ�1
		IcecreamCup cup1 = new IcecreamCup(200,"�̱���-������",IcecreamCup.SINGLE_CUP);
		cup1.putIcecreamToCup("31���Ʈ");
		cup1.printCup();
		
		IcecreamCup con1 
		= new IcecreamCup(400, 
				"������-�缮�� ����Ƽ��", IcecreamCup.DOUBLE_CON);
		con1.putIcecreamToCup("��������");
		con1.putIcecreamToCup("���ڳ��� ��");
		con1.putIcecreamToCup("���ڳ��� �� �ѹ���!!");
		con1.printCup();
		
		IcecreamCup cup2 
		= new IcecreamCup(600, 
				"����Ʈ��-������", 
				IcecreamCup.PINT_CUP);
		cup2.putIcecreamToCup("�ٶ��� �Բ� �������");
		cup2.putIcecreamToCup("������ �ܰ���");
		cup2.putIcecreamToCup("�ǽ�Ÿġ�� �Ƹ��");
		cup2.putIcecreamToCup("31���Ʈ");//���ʽ� ���ֱ� �õ�..
		cup2.printCup();
	}
}
