package greet;

public class MessageKorean {

	public static void main(String[] args) {

		String[] korean = { "0.�ȳ��ϼ���?", "1.�ȳ��� �ֹ��̾��?", "2.�ȳ��� �ֹ�����.", "3.�Ļ� �ϼ̽��ϱ�?", "4.�� �����̽��ϱ�?", "5.�������Դϴ�.",
				"6.ó���˰ڽ��ϴ�.", "7.������ �� ���ô�." };
		if (args.length == 1) {
			if (args[0].equals("kr")) {
				for (int i = 0; i < korean.length; i++) {
					System.out.println(korean[i]);
				}
			} else {
				System.out.println("�Է� ����!");
			}
		} else if (args.length == 2) {
			if (args[0].equals("kr")) {
				System.out.println(korean[Integer.parseInt(args[1])]);
			} else {
				System.out.println("�Է� ����!");
			}
		} else {
			System.out.println("�Է� ����!");
		}

	}
}
