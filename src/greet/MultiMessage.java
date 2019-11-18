package greet;

import java.util.Arrays;
import java.util.Scanner;

class MessageEnglish extends MultiMessage{
	String[] english;
	
	public MessageEnglish() {}
	
	public MessageEnglish(String[] english){
		this.english = english;
	}
}

class MessageJapanese extends MultiMessage{
	String[] japanese;
	
	public MessageJapanese() {}
	
	public MessageJapanese(String[] japanese) {
		this.japanese = japanese;
	}
}

class MessageGerman extends MultiMessage{
	String[] german;
	
	public MessageGerman() {}
	
	public MessageGerman(String[] german) {
		this.german = german;
	}
}

class MessageFranch extends MultiMessage{
	String[] franch;
	
	public MessageFranch() {}

	public MessageFranch(String[] french) {
		this.franch = french;
	}
}

class MessageChinese extends MultiMessage{
	String[] chinese;
	
	public MessageChinese() {}
	
	public MessageChinese(String[] chinese) {
		this.chinese = chinese;
	}
}

public class MultiMessage {
	
	MessageEnglish me;
	MessageJapanese mj;
	MessageGerman mg;
	MessageFranch mf;
	MessageChinese mc;
	
	public MultiMessage() {}

	public MultiMessage(MessageEnglish me, MessageJapanese mj, MessageGerman mg, MessageFranch mf, MessageChinese mc) {
		super();
		this.me = me;
		this.mj = mj;
		this.mg = mg;
		this.mf = mf;
		this.mc = mc;
	}
	
	public void printAllMessage(String[] arr) {
		for(String str : arr) {
			System.out.println(str);
		}
	}

	public void getMessage(String input) {
		input = input.toLowerCase();
		if (input.length() == 3) {
			if (input.substring(0, 2).equals("en")) {
				System.out.println(me.english[input.charAt(2) - '0']);
			} else if (input.substring(0, 2).equals("jp")) {
				System.out.println(mj.japanese[input.charAt(2) - '0']);
			} else if (input.substring(0, 2).equals("gm")) {
				System.out.println(mg.german[input.charAt(2) - '0']);
			} else if (input.substring(0, 2).equals("fr")) {
				System.out.println(mf.franch[input.charAt(2) - '0']);
			} else if (input.substring(0, 2).equals("ch")) {
				System.out.println(mc.chinese[input.charAt(2) - '0']);
			} else {
				System.out.println("�Է¿���!");
			}
		} else {
			if (input.substring(0, 2).equals("en")) {
				me.printAllMessage(me.english);
			} else if (input.substring(0, 2).equals("jp")) {
				mj.printAllMessage(mj.japanese);
			} else if (input.substring(0, 2).equals("gm")) {
				mg.printAllMessage(mg.german);
			} else if (input.substring(0, 2).equals("fr")) {
				mf.printAllMessage(mf.franch);
			} else if (input.substring(0, 2).equals("ch")) {
				mc.printAllMessage(mc.chinese);
			} else {
				System.out.println("�Է¿���!");
			}

		}
	}
	
	public static void main(String[] args) {
		MessageEnglish me = new MessageEnglish(new String[]{"0.Hello", "1.good morning", "2.good night", 
				"3.ate?", "4.how have u been?","5.long time no see", "6.nice to meet you", "7.see you later"});
		MessageJapanese mj = new MessageJapanese(new String[] {"0.�����", "1.�����̿�", "2.���", 
				"3.�Ļ��ϼ̵�����?", "4.�۳���Ÿ��?", "5.����úθ�", "6.���ҿ��νò����װ��̽ø���", "7.�Ǻ�����"});
		MessageGerman mg = new MessageGerman(new String[] {"0.����Ź", "1.������ħ�Դ�Ź!", "2.���ڿ�Ź", 
				"3.��Ծ�Ź?", "4.������Ź?", "5.�������Դ�Ź!", "6.ó����Ź!", "7.�Ǻ�Ź!"});
		MessageFranch mf = new MessageFranch(new String[] {"0.���긣", "1.������ħ�긣", "2.�����긣", 
				"3.��Ծ��ָ�", "4.���������ָ�", "5.���������긣", "6.ó���˰ڽ��긣", "7.�Ǻ��긣"});
		MessageChinese mc = new MessageChinese(new String[] {"0.���Ͽ�", "1.������ħ�Ͽ�", "2.ð��ȿ��", 
				"3.�̼��ϼͽ��ϱ�", "4.��¡�üͽ´ױ�", "5.�˷����׿���", "6.�������氭����", "7.�˸�����"});
		MultiMessage mm = new MultiMessage(me,mj,mg,mf,mc);

		Scanner sc = new Scanner(System.in);
		// 2-a
//		while(true) {
//			System.out.println("* �λ縻 ���� �Է�: ");
//			String input = sc.next();
//			if(input.equals("exit")) {
//				System.out.println("<����>");
//				break;
//			}else {
//				mm.getMessage(input);
//			}
//		}

		// 2-b
		try {
			while (true) {
				System.out.println("* �λ縻 ���� �Է�: ");
				String[] input = sc.next().split(",");
				if (input[0].equals("exit")) {
					System.out.println("<����>");
					break;
				}
				for (int i = 0; i < input.length; i++) {
					mm.getMessage(input[i]);
				}
			}
		} catch (Exception e) {
			System.out.println("�Է¿���!");
		}
	}
}
