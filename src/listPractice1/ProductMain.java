package listPractice1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Product[] products = { new Product("동현바이크", 1000, 3, Product.TYPE[Product.TYPE_CLASSIC]),
				new Product("유중바이크", 1500), new Product("민구바이크", 1300),
				new Product("진홍바이크", 1100, 2, Product.TYPE[Product.TYPE_SPORTS]), new Product("선아바이크", 2100),
				new Product("유진바이크", 1400, 2, Product.TYPE[Product.TYPE_CLASSIC]),
				new Product("보민바이크", 1000, 5, Product.TYPE[Product.TYPE_SPORTS]), new Product("용경바이크", 1400),
				new Product("형관바이크", 1200, 6, Product.TYPE[Product.TYPE_SPORTS]),
				new Product("세연바이크", 1300, 3, Product.TYPE[Product.TYPE_CLASSIC]) };

		ArrayList<Product> prList = new ArrayList<>();

		// list에 Products 객체들을 추가
		for (Product pr : products) {
			prList.add(pr);
		}

		bw.write("전체 상품 평균 단가: " + getAveragePrice(prList) + "\n");
		bw.flush();

	}

	public static double getAveragePrice(ArrayList<Product> prList) {
		double average = 0.0;
		int sum = 0;
		if (prList != null) {
			for (int i = 0; i < prList.size(); i++) {
				int unitPrice = prList.get(i).getUnitPrice(); // 각 객체가 갖고 있는 단가(unitPrice)를 가져와 저장
				sum += unitPrice;
			}
			average = sum / prList.size();
		}
		return average;
	}

}
