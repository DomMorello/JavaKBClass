package sell;

import cups.IcecreamCup;

public class StoreMain {

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
		
		//주문1
		IcecreamCup cup1 = new IcecreamCup(200,"싱글컵-영웅씨",IcecreamCup.SINGLE_CUP);
		cup1.putIcecreamToCup("31요거트");
		cup1.printCup();
		
		IcecreamCup con1 
		= new IcecreamCup(400, 
				"더블콘-재석씨 기프티콘", IcecreamCup.DOUBLE_CON);
		con1.putIcecreamToCup("아포가토");
		con1.putIcecreamToCup("초코나무 숲");
		con1.putIcecreamToCup("초코나무 숲 한번더!!");
		con1.printCup();
		
		IcecreamCup cup2 
		= new IcecreamCup(600, 
				"파인트컵-은지씨", 
				IcecreamCup.PINT_CUP);
		cup2.putIcecreamToCup("바람과 함께 사라지다");
		cup2.putIcecreamToCup("엄마는 외계인");
		cup2.putIcecreamToCup("피스타치오 아몬드");
		cup2.putIcecreamToCup("31요거트");//보너스 퍼주기 시도..
		cup2.printCup();
	}
}
