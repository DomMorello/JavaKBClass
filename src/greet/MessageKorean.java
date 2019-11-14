package greet;

public class MessageKorean {

	public static void main(String[] args) {

		String[] korean = { "0.안녕하세요?", "1.안녕히 주무셨어요?", "2.안녕히 주무세요.", "3.식사 하셨습니까?", "4.잘 지내셨습니까?", "5.오랜만입니다.",
				"6.처음뵙겠습니다.", "7.다음에 또 봅시다." };
		if (args.length == 1) {
			if (args[0].equals("kr")) {
				for (int i = 0; i < korean.length; i++) {
					System.out.println(korean[i]);
				}
			} else {
				System.out.println("입력 오류!");
			}
		} else if (args.length == 2) {
			if (args[0].equals("kr")) {
				System.out.println(korean[Integer.parseInt(args[1])]);
			} else {
				System.out.println("입력 오류!");
			}
		} else {
			System.out.println("입력 오류!");
		}

	}
}
