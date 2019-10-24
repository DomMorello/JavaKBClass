package sell;
import cups.IceCream;
import cups.IcecreamCup;
import cups.IcecreamCup2;
public class StoreMain2 {
	public static void main(String[] args) {
		final String[] icecreams = {
				"몬스터 할로윈",
				"아빠는 딸바봉",
				"엄마는 외계인",
				"쌀떡궁합",
				"쫀떡궁합",
				"심슨에 반하나",
				"베리 스윗 바이올렛",
				"마법사의 할로윈",
				"너는 참 달고나",
				"허니 치즈 트랩",
				"바람과 함께 사라지다",
				"이상한 나라의 솜사탕",
				"아포가토",
				"쿠키 앤 크림",
				"초코나무 숲",
				"프랄린 앤 크림",
				"31요거트",
				"알폰소 망고",
				"피스타치오 아몬드",
				"북극곰 폴라베어"	
		};
		
		//주문 1
		IcecreamCup2 cup2 
			= new IcecreamCup2(600, 
				"(클래스버젼) 싱글콘 - 찬희씨", 
				IcecreamCup2.SINGLE_CON);
		IceCream ic1 
			= new IceCream("월넛", 
					"국내산 호두, 미국땅꽁...", 1);
		IceCream ic2 
		= new IceCream("체리딸기맛", 
				"국내산 체리, 미국딸기...", 2);
		cup2.putIcecreamToCup(ic1);
		cup2.putIcecreamToCup(ic2); 
		
	//	cup2.putIcecreamToCup("dfdffd"); // error
		cup2.printCup();
	}
}
