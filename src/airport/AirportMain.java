package airport;

import java.util.*;

/**
 * @author Dom_Morello
 * @Project KBclass
 * @Date 2019. 11. 6.
 */

class RestrictedItem {
	String[] liquid = { "Ŀ��", "��", "��������", "��������Ʈ", "��Ǫ", "�ݶ�", "���̴�", "������", "��", "������", "��ġ" };
	String[] tool = { "â", "��Į", "���", "�ö�ƽĮ", "����Į", "�鵵��", "��â", "��ũ", "��ù�", "��ġ", "��ġ" };
	String[] danger = { "��Ƭ�̿¹��͸�", "����������", "����", "��ź", "ȭ������", "����ź", "���", "�ö��䴽" };

	public boolean isRestricted(String item, String[] category) {
		for (int i = 0; i < category.length; i++) {
			if (item.equals(category[i])) {
				return true;
			}
		}
		return false;
	}
}

public class AirportMain {

	public static void main(String[] args) {
		RestrictedItem ri = new RestrictedItem();

		Scanner sc = new Scanner(System.in);
		int count = 0;
		int restrictedCount = 0;
		System.out.println("==== ���տ������ �⳻ ���� �˻� ====");
		while (true) {
			String item = sc.next();
			count++;
			System.out.println(count + "ȸ ���� ��ǰ �̸�: " + item);
			if (item.equals("exit")) {
				System.out.println("----------------------");
				System.out.println("�˻�����");
				System.out.printf("�� �˻� ȸ�� %dȸ, ���� ���� �߰�: %dȸ", count-1, restrictedCount);
				break;
			} else {
				if (ri.isRestricted(item, ri.liquid)) {
					System.out.println(">>�˻���.. ==> '" + item + "'�� \"������ü��\"�� ���Ͽ� ���� ������!!!");
					restrictedCount++;
					System.out.println("\t���� ���� ��� ����:" + restrictedCount);
				} else if (ri.isRestricted(item, ri.tool)) {
					System.out.println(">>�˻���.. ==> '" + item + "'�� \"����������\"�� ���Ͽ� ���� ������!!!");
					restrictedCount++;
					System.out.println("\t���� ���� ��� ����:" + restrictedCount);
				} else if (ri.isRestricted(item, ri.danger)) {
					System.out.println(">>�˻���.. ==> '" + item + "'�� \"�������蹰\"�� ���Ͽ� ���� ������!!!");
					restrictedCount++;
					System.out.println("\t���� ���� ��� ����:" + restrictedCount);
				} else {
					System.out.println(">>�˻���.. ==> '" + item + "' ��ǰ ���� ���!");
				}
			}
		}
	}

}
