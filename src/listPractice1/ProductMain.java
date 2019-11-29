package listPractice1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Product[] products = { new Product("��������ũ", 1000, 3, Product.TYPE[Product.TYPE_CLASSIC]),
				new Product("���߹���ũ", 1500), new Product("�α�����ũ", 1300),
				new Product("��ȫ����ũ", 1100, 2, Product.TYPE[Product.TYPE_SPORTS]), new Product("���ƹ���ũ", 2100),
				new Product("��������ũ", 1400, 2, Product.TYPE[Product.TYPE_CLASSIC]),
				new Product("���ι���ũ", 1000, 5, Product.TYPE[Product.TYPE_SPORTS]), new Product("������ũ", 1400),
				new Product("��������ũ", 1200, 6, Product.TYPE[Product.TYPE_SPORTS]),
				new Product("��������ũ", 1300, 3, Product.TYPE[Product.TYPE_CLASSIC]) };

		ArrayList<Product> prList = new ArrayList<>();

		// list�� Products ��ü���� �߰�
		for (Product pr : products) {
			prList.add(pr);
		}

		bw.write("��ü ��ǰ ��� �ܰ�: " + getAveragePrice(prList) + "\n");
		bw.flush();

	}

	public static double getAveragePrice(ArrayList<Product> prList) {
		double average = 0.0;
		int sum = 0;
		if (prList != null) {
			for (int i = 0; i < prList.size(); i++) {
				int unitPrice = prList.get(i).getUnitPrice(); // �� ��ü�� ���� �ִ� �ܰ�(unitPrice)�� ������ ����
				sum += unitPrice;
			}
			average = sum / prList.size();
		}
		return average;
	}

}
