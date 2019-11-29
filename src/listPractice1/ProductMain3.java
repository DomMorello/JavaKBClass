package listPractice1;

import java.io.*;
import java.util.*;

/**
 * @author Dom_Morello
 * @Project KBclass
 * @Date 2019. 11. 28.
 */
public class ProductMain3 {

	public static void main(String[] args) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		ArrayList<Product> prList = new ArrayList<>();
		System.out.println("����� ��ǰ ������ �Է��Ͻÿ�.");
		inputNewProductToList(prList);
		getAvgUnitPricePerTypeFromList(prList);
		Product highest = getHighPriceProductFromList(prList);
		System.out.println("�ְ� ��ǰ: "+highest.getName()+"\t"+highest.getType()+"\t"+highest.getUnitPrice());
		getLowPriceProductFromList(prList);
		Product lowest = getLowPriceProductFromList(prList);
		System.out.println("������ ��ǰ: "+lowest.getName()+"\t"+lowest.getType()+"\t"+lowest.getUnitPrice());
	}
	
	//�ְ� ��ǰ�� ��ȯ�ϴ� �޼���
	public static Product getHighPriceProductFromList(ArrayList<Product> list) {
		int index = 0;	//�ش� ��ġ�� ã�� ���� ����
		int max = list.get(0).getUnitPrice();
		//list ��Ҹ� ���� ���Ͽ� �� ��� ��ü�� ����
		for(int i=1; i < list.size(); i++) {
			if(max < list.get(i).getUnitPrice() ) {
				max = list.get(i).getUnitPrice();
				index = i;
			}
		}
		return list.get(index);
	}
	
	//������ ��ǰ�� ��ȯ�ϴ� �޼���
	public static Product getLowPriceProductFromList(ArrayList<Product> list) {
		int index = 0;	//�ش� ��ġ�� ã�� ���� ����
		int min = list.get(0).getUnitPrice();
		//list ��Ҹ� ���� ���Ͽ� �� �� ��ü�� ����
		for(int i=1; i < list.size(); i++) {
			if(min > list.get(i).getUnitPrice() ) {
				min = list.get(i).getUnitPrice();
				index = i;
			}
		}
		return list.get(index);
	}

	// List���� ������ �ǸŰ��� ����� ���ϴ� �޼���
	public static void getAvgUnitPricePerTypeFromList(ArrayList<Product> list) {
		int countScooter = 0;
		int countClassic = 0;
		int countSports = 0; // ������ ���� �հ�
		int sumScooter = 0;
		int sumClassic = 0;
		int sumSports = 0; // ������ ���� �հ�
		int numScoopter = 0;
		int numClassic = 0;
		int numSports = 0; // ����� ���ϱ� ���� ���� �������� Ÿ���� � �����ƴ��� üũ
		System.out.println("| ���� |  ���  |   ��մܰ�   |");
		for (Product pr : list) {
			if (pr.getType().equals(Product.TYPE[Product.TYPE_SCOOTER])) { // ������
				sumScooter += pr.getUnitPrice(); // �ܰ��� ���� ���ϰ�
				numScoopter += pr.getCount(); // ������ ���� ���ϰ�
				countScooter++; // ������ ���� ���ؼ� �ϳ� ���� ������ ������Ŵ
			} else if (pr.getType().equals(Product.TYPE[Product.TYPE_CLASSIC])) { // Ŭ����
				sumClassic += pr.getUnitPrice();
				numClassic += pr.getCount();
				countClassic++;
			} else { // ������
				sumSports += pr.getUnitPrice();
				numSports += pr.getCount();
				countSports++;
			}
		}
		// 0���� �������� ���� �����ϱ� ���� 0�̸� 1�� �ٲ۴�.
		if (countScooter == 0) {
			countScooter++;
		}
		if (countClassic == 0) {
			countClassic++;
		}
		if (countSports == 0) {
			countSports++;
		}
		// ���񺰷� ���
		System.out.println("������\t" + numScoopter + "\t" + sumScooter / countScooter + "��");
		System.out.println("Ŭ����\t" + numClassic + "\t" + sumClassic / countClassic + "��");
		System.out.println("������\t" + numSports + "\t" + sumSports / countSports + "��");
		System.out.println("��\t" + (int)(numScoopter + numClassic + numSports) + "\t"
				+ ((sumScooter / countScooter) + (sumClassic / countClassic) + (sumSports / countSports)) / 3);
		System.out.println("----------------------------------------------");
	}

	// List�� Product ������ �Է¹޾� �߰��ϴ� �޼���
	public static void inputNewProductToList(ArrayList<Product> list) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println("=== ������� ���� ===(����: exit)");
			System.out.println("�𵨸�, �ǸŰ���, ������ �Է��Ͻÿ�.(����: ������, Ŭ���Ĺ���ũ, ����������ũ �� 1)");
			System.out.print("�𵨸�: ");
			String inputName = sc.next(); // �𵨸� ����
			if (inputName.equals("exit")) {
				break;
			}
			System.out.print("����: ");
			int inputPrice = sc.nextInt(); // �Ǹ� ���� ����
			System.out.print("����: ");
			String inputType = sc.next(); // ���� ����

			// �Է� ���� ó��
			if (inputPrice > 3000 || inputPrice < 1000) {
				System.out.println("���� ����!");
				continue;
			}
			if (inputName.isEmpty() || inputName.length() > 10) {
				System.out.println("�Է¿���!");
				continue;
			}
			if (inputType.isEmpty() || inputType.length() > 10) {
				System.out.println("�Է¿���!");
				continue;
			}
			// ��ǰ ���
			Product product = new Product(inputName, inputPrice, inputType);
			boolean result = list.add(product);
			if (result) {
				System.out.println(inputName + " �Ǹ� �غ� �Ϸ�!");
			} else {
				System.out.println("�Ǹ� �غ� ����! : " + inputName);
			}
			System.out.println(product);
		}
	}

}
