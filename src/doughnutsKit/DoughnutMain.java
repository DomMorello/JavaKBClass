package doughnutsKit;
import doughnutsKit.Box;
import doughnutsKit.Doughnut;;
public class DoughnutMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box box1 = new Box("����");
		Box box2 = new Box("��������");
		Box box3 = new Box(7);
		Doughnut doughnut1 = new Doughnut("��ġŲ����","������");
		Doughnut doughnut2 = new Doughnut("ġŲ����","���ڸ�");
		Doughnut doughnut3 = new Doughnut("��ȫ����","�����");
		Doughnut doughnut4 = new Doughnut("�ñ״��ĵ���","�� �ȸ��¸�");
		
		box1.putDoughnutsToBox("���� ����");
		box1.putDoughnutsToBox("���� ����");
		box1.putDoughnutsToBox("��� ����");
		box1.putDoughnutsToBox("�ٳ��� ����");
		box1.putDoughnutsToBox(doughnut1.printDoughnut());
		box1.putDoughnutsToBox(doughnut2.printDoughnut());
		box1.printBox();
		
		box2.putDoughnutsToBox("���� ����");
		box2.putDoughnutsToBox("�ڳ��� ����");
		box2.putDoughnutsToBox("�ٺ� ����");
		box2.putDoughnutsToBox("���� ����");
		box2.putDoughnutsToBox(doughnut3.printDoughnut());
		box2.printBox();
		
		box3.putDoughnutsToBox("������ ����");
		box3.putDoughnutsToBox("������ ����");
		box3.putDoughnutsToBox("����� ����");
		box3.putDoughnutsToBox("���̼��� ����");
		box3.putDoughnutsToBox(doughnut4.printDoughnut());
		box3.putDoughnutsToBox("�Ｚ ����");
		box3.putDoughnutsToBox("���� ����");
		box3.putDoughnutsToBox("ȥ�� ����");
		box3.putDoughnutsToBox("���Ÿ ����");
		box3.printBox();
			
	}

}
