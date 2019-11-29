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
		System.out.println("등록할 제품 정보를 입력하시오.");
		inputNewProductToList(prList);
		getAvgUnitPricePerTypeFromList(prList);
		Product highest = getHighPriceProductFromList(prList);
		System.out.println("최고가 상품: "+highest.getName()+"\t"+highest.getType()+"\t"+highest.getUnitPrice());
		getLowPriceProductFromList(prList);
		Product lowest = getLowPriceProductFromList(prList);
		System.out.println("최저가 상품: "+lowest.getName()+"\t"+lowest.getType()+"\t"+lowest.getUnitPrice());
	}
	
	//최고가 상품을 반환하는 메서드
	public static Product getHighPriceProductFromList(ArrayList<Product> list) {
		int index = 0;	//해당 위치를 찾기 위한 변수
		int max = list.get(0).getUnitPrice();
		//list 요소를 전부 비교하여 젤 비싼 객체를 선정
		for(int i=1; i < list.size(); i++) {
			if(max < list.get(i).getUnitPrice() ) {
				max = list.get(i).getUnitPrice();
				index = i;
			}
		}
		return list.get(index);
	}
	
	//최저가 상품을 반환하는 메서드
	public static Product getLowPriceProductFromList(ArrayList<Product> list) {
		int index = 0;	//해당 위치를 찾기 위한 변수
		int min = list.get(0).getUnitPrice();
		//list 요소를 전부 비교하여 젤 싼 객체를 선정
		for(int i=1; i < list.size(); i++) {
			if(min > list.get(i).getUnitPrice() ) {
				min = list.get(i).getUnitPrice();
				index = i;
			}
		}
		return list.get(index);
	}

	// List에서 종류별 판매가격 평균을 구하는 메서드
	public static void getAvgUnitPricePerTypeFromList(ArrayList<Product> list) {
		int countScooter = 0;
		int countClassic = 0;
		int countSports = 0; // 종류별 개수 합계
		int sumScooter = 0;
		int sumClassic = 0;
		int sumSports = 0; // 종류별 가격 합계
		int numScoopter = 0;
		int numClassic = 0;
		int numSports = 0; // 평균을 구하기 위해 각차 종류별로 타입이 몇개 생성됐는지 체크
		System.out.println("| 종류 |  재고  |   평균단가   |");
		for (Product pr : list) {
			if (pr.getType().equals(Product.TYPE[Product.TYPE_SCOOTER])) { // 스쿠터
				sumScooter += pr.getUnitPrice(); // 단가를 전부 더하고
				numScoopter += pr.getCount(); // 개수를 전부 더하고
				countScooter++; // 개수를 세기 위해서 하나 있을 때마다 증가시킴
			} else if (pr.getType().equals(Product.TYPE[Product.TYPE_CLASSIC])) { // 클래식
				sumClassic += pr.getUnitPrice();
				numClassic += pr.getCount();
				countClassic++;
			} else { // 스포츠
				sumSports += pr.getUnitPrice();
				numSports += pr.getCount();
				countSports++;
			}
		}
		// 0으로 나눠지는 것을 방지하기 위해 0이면 1로 바꾼다.
		if (countScooter == 0) {
			countScooter++;
		}
		if (countClassic == 0) {
			countClassic++;
		}
		if (countSports == 0) {
			countSports++;
		}
		// 종목별로 출력
		System.out.println("스쿠터\t" + numScoopter + "\t" + sumScooter / countScooter + "원");
		System.out.println("클래식\t" + numClassic + "\t" + sumClassic / countClassic + "원");
		System.out.println("스포츠\t" + numSports + "\t" + sumSports / countSports + "원");
		System.out.println("총\t" + (int)(numScoopter + numClassic + numSports) + "\t"
				+ ((sumScooter / countScooter) + (sumClassic / countClassic) + (sumSports / countSports)) / 3);
		System.out.println("----------------------------------------------");
	}

	// List에 Product 정보를 입력받아 추가하는 메서드
	public static void inputNewProductToList(ArrayList<Product> list) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println("=== 오토바이 생성 ===(종료: exit)");
			System.out.println("모델명, 판매가격, 종류를 입력하시오.(종류: 스쿠터, 클래식바이크, 스포츠바이크 택 1)");
			System.out.print("모델명: ");
			String inputName = sc.next(); // 모델명 지정
			if (inputName.equals("exit")) {
				break;
			}
			System.out.print("가격: ");
			int inputPrice = sc.nextInt(); // 판매 가격 지정
			System.out.print("종류: ");
			String inputType = sc.next(); // 종류 기입

			// 입력 오류 처리
			if (inputPrice > 3000 || inputPrice < 1000) {
				System.out.println("가격 오류!");
				continue;
			}
			if (inputName.isEmpty() || inputName.length() > 10) {
				System.out.println("입력오류!");
				continue;
			}
			if (inputType.isEmpty() || inputType.length() > 10) {
				System.out.println("입력오류!");
				continue;
			}
			// 제품 등록
			Product product = new Product(inputName, inputPrice, inputType);
			boolean result = list.add(product);
			if (result) {
				System.out.println(inputName + " 판매 준비 완료!");
			} else {
				System.out.println("판매 준비 실패! : " + inputName);
			}
			System.out.println(product);
		}
	}

}
