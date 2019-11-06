package airport;

import java.util.*;

/**
 * @author Dom_Morello
 * @Project KBclass
 * @Date 2019. 11. 6.
 */

class RestrictedItem {
	String[] liquid = { "커피", "젤", "스프레이", "데오도란트", "샴푸", "콜라", "사이다", "세정제", "물", "고추장", "김치" };
	String[] tool = { "창", "식칼", "대검", "플라스틱칼", "버터칼", "면도기", "죽창", "포크", "사시미", "망치", "렌치" };
	String[] danger = { "리튬이온배터리", "가스충전기", "석유", "석탄", "화염방사기", "핵폭탄", "우라늄", "플라토늄" };

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
		System.out.println("==== 융합에어라인 기내 반입 검사 ====");
		while (true) {
			String item = sc.next();
			count++;
			System.out.println(count + "회 반입 물품 이름: " + item);
			if (item.equals("exit")) {
				System.out.println("----------------------");
				System.out.println("검사종료");
				System.out.printf("총 검사 회수 %d회, 반입 금지 발견: %d회", count-1, restrictedCount);
				break;
			} else {
				if (ri.isRestricted(item, ri.liquid)) {
					System.out.println(">>검사중.. ==> '" + item + "'은 \"금지액체류\"에 속하여 반입 금지됨!!!");
					restrictedCount++;
					System.out.println("\t반입 금지 목록 개수:" + restrictedCount);
				} else if (ri.isRestricted(item, ri.tool)) {
					System.out.println(">>검사중.. ==> '" + item + "'은 \"금지도구류\"에 속하여 반입 금지됨!!!");
					restrictedCount++;
					System.out.println("\t반입 금지 목록 개수:" + restrictedCount);
				} else if (ri.isRestricted(item, ri.danger)) {
					System.out.println(">>검사중.. ==> '" + item + "'은 \"금지위험물\"에 속하여 반입 금지됨!!!");
					restrictedCount++;
					System.out.println("\t반입 금지 목록 개수:" + restrictedCount);
				} else {
					System.out.println(">>검사중.. ==> '" + item + "' 물품 반입 통과!");
				}
			}
		}
	}

}
