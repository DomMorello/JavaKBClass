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
				System.out.println("ÀÔ·Â¿À·ù!");
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
				System.out.println("ÀÔ·Â¿À·ù!");
			}

		}
	}
	
	public static void main(String[] args) {
		MessageEnglish me = new MessageEnglish(new String[]{"0.Hello", "1.good morning", "2.good night", 
				"3.ate?", "4.how have u been?","5.long time no see", "6.nice to meet you", "7.see you later"});
		MessageJapanese mj = new MessageJapanese(new String[] {"0.°õ¹æ¿Í", "1.¿ÀÇÏÀÌ¿ä", "2.Àğ³×", 
				"3.½Ä»çÇÏ¼Ìµ¥½º±î?", "4.°Û³¢´åÅ¸±î?", "5.È÷»ç½ÃºÎ¸®", "6.µµÁÒ¿À·Î½Ã²ô¿À³×°¡ÀÌ½Ã¸¶½º", "7.¶ÇºÁµ¥½º"});
		MessageGerman mg = new MessageGerman(new String[] {"0.±¸ÅÙÅ¹", "1.ÁÁÀº¾ÆÄ§ÀÔ´ÏÅ¹!", "2.ÀßÀÚ¿äÅ¹", 
				"3.¹ä¸Ô¾úÅ¹?", "4.ÀßÁö³ÂÅ¹?", "5.¿À·£¸¸ÀÔ´ÏÅ¹!", "6.Ã³À½ºÁÅ¹!", "7.¶ÇºÁÅ¹!"});
		MessageFranch mf = new MessageFranch(new String[] {"0.ºÀÁê¸£", "1.ÁÁÀº¾ÆÄ§Áê¸£", "2.ÀßÀÚÁê¸£", 
				"3.¹ä¸Ô¾úÁÖ¸£", "4.ÀßÁö³»¼ÌÁÖ¸£", "5.¿À·£¸¸ÀÔÁê¸£", "6.Ã³À½ºË°Ú½ÀÁê¸£", "7.¶ÇºÁÁê¸£"});
		MessageChinese mc = new MessageChinese(new String[] {"0.´ÏÇÏ¿À", "1.Á¾Àº¾ÆÄ§ÇÏ¿À", "2.Ã°ÀÚÈ¿¿Ë", 
				"3.½Ì¼§ÇÏ¼Í½¿´Ï±ø", "4.ÀåÂ¡³Ã¼Í½Â´×±ø", "5.¿Ë·©¸ÁÀ×¿¨¿ë", "6.¸Á³¶¼º¹æ°­¿ı¿ë", "7.¶Ë¸Á³¶¿ë"});
		MultiMessage mm = new MultiMessage(me,mj,mg,mf,mc);

		Scanner sc = new Scanner(System.in);
		// 2-a
//		while(true) {
//			System.out.println("* ÀÎ»ç¸» ¼±ÅÃ ÀÔ·Â: ");
//			String input = sc.next();
//			if(input.equals("exit")) {
//				System.out.println("<Á¾·á>");
//				break;
//			}else {
//				mm.getMessage(input);
//			}
//		}

		// 2-b
		try {
			while (true) {
				System.out.println("* ÀÎ»ç¸» ¼±ÅÃ ÀÔ·Â: ");
				String[] input = sc.next().split(",");
				if (input[0].equals("exit")) {
					System.out.println("<Á¾·á>");
					break;
				}
				for (int i = 0; i < input.length; i++) {
					mm.getMessage(input[i]);
				}
			}
		} catch (Exception e) {
			System.out.println("ÀÔ·Â¿À·ù!");
		}
	}
}
