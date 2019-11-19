package greet;

import java.util.Arrays;
import java.util.Scanner;

class MessageEnglish extends Message{
	
	public MessageEnglish() {}
	
	public MessageEnglish(String[] english){
		this.message = english;
	}
}

class MessageJapanese extends Message{
	
	public MessageJapanese() {}
	
	public MessageJapanese(String[] japanese) {
		this.message = japanese;
	}
}

class MessageGerman extends Message{
	
	public MessageGerman() {}
	
	public MessageGerman(String[] german) {
		this.message = german;
	}
}

class MessageFranch extends Message{
	
	public MessageFranch() {}

	public MessageFranch(String[] french) {
		this.message = french;
	}
}

class MessageChinese extends Message{
	
	public MessageChinese() {}
	
	public MessageChinese(String[] chinese) {
		this.message = chinese;
	}
}

public class Message {
	
	MessageEnglish me;
	MessageJapanese mj;
	MessageGerman mg;
	MessageFranch mf;
	MessageChinese mc;
	String[] message;
	
	public Message() {}

	public Message(MessageEnglish me, MessageJapanese mj, MessageGerman mg, MessageFranch mf, MessageChinese mc) {
		super();
		this.me = me;
		this.mj = mj;
		this.mg = mg;
		this.mf = mf;
		this.mc = mc;
	}
	
	public void printAllMessage(String[] message) {
		for(String str : message) {
			System.out.println(str);
		}
	}

	public void getMessage(String input) {
		input = input.toLowerCase();
		if (input.length() > 2) {
			if (input.substring(0, 2).equals("en")) {
				System.out.println(me.message[Integer.parseInt(input.substring(2))]);
			} else if (input.substring(0, 2).equals("jp")) {
				System.out.println(mj.message[Integer.parseInt(input.substring(2))]);
			} else if (input.substring(0, 2).equals("gm")) {
				System.out.println(mg.message[Integer.parseInt(input.substring(2))]);
			} else if (input.substring(0, 2).equals("fr")) {
				System.out.println(mf.message[Integer.parseInt(input.substring(2))]);
			} else if (input.substring(0, 2).equals("ch")) {
				System.out.println(mc.message[Integer.parseInt(input.substring(2))]);
			} else {
				System.out.println("ÀÔ·Â¿À·ù!");
			}
		} else {
			if (input.substring(0, 2).equals("en")) {
				me.printAllMessage(me.message);
			} else if (input.substring(0, 2).equals("jp")) {
				mj.printAllMessage(mj.message);
			} else if (input.substring(0, 2).equals("gm")) {
				mg.printAllMessage(mg.message);
			} else if (input.substring(0, 2).equals("fr")) {
				mf.printAllMessage(mf.message);
			} else if (input.substring(0, 2).equals("ch")) {
				mc.printAllMessage(mc.message);
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
//		MessageEnglish me = new MessageEnglish(new String[]{"0.Hello", "1.good morning", "2.good night", 
//				"3.ate?", "4.how have u been?","5.long time no see", "6.nice to meet you", "7.see you later"
//				,"8.Hi", "9.good job", "10.glad to see you", "11.happy new year","12.Merry christmas"});
//		MessageJapanese mj = new MessageJapanese(new String[] {"0.°õ¹æ¿Í", "1.¿ÀÇÏÀÌ¿ä", "2.Àğ³×", 
//				"3.½Ä»çÇÏ¼Ìµ¥½º±î?", "4.°Û³¢´åÅ¸±î?", "5.È÷»ç½ÃºÎ¸®", "6.µµÁÒ¿À·Î½Ã²ô¿À³×°¡ÀÌ½Ã¸¶½º", "7.¶ÇºÁµ¥½º"
//				,"8.µµ¸ğ","9.°íÄ¡·Î»ç¸¶","10.¿ì·¹½ÃÀÌ","11.»õÇØº¹ÀÌºüÀÌµ¥½º","12.¸Ş¸®Å©¸®½º¸¶½ºµ¥½º"});
//		MessageGerman mg = new MessageGerman(new String[] {"0.±¸ÅÙÅ¹", "1.ÁÁÀº¾ÆÄ§ÀÔ´ÏÅ¹!", "2.ÀßÀÚ¿äÅ¹", 
//				"3.¹ä¸Ô¾úÅ¹?", "4.ÀßÁö³ÂÅ¹?", "5.¿À·£¸¸ÀÔ´ÏÅ¹!", "6.Ã³À½ºÁÅ¹!", "7.¶ÇºÁÅ¹!"
//				,"8.¾È³çÅ¹!","9.°í»ıÇßÅ¹!","10.¹İ°©Å¹!","11.»õÇØº¹¸¹ÀÌ¹ŞÀ¸Å¹!","12.¸Ş¸®Å©¸®½º¸¶½ºÅ¹!"});
//		MessageFranch mf = new MessageFranch(new String[] {"0.ºÀÁê¸£", "1.ÁÁÀº¾ÆÄ§Áê¸£", "2.ÀßÀÚÁê¸£", 
//				"3.¹ä¸Ô¾úÁÖ¸£", "4.ÀßÁö³»¼ÌÁÖ¸£", "5.¿À·£¸¸ÀÔÁê¸£", "6.Ã³À½ºË°Ú½ÀÁê¸£", "7.¶ÇºÁÁê¸£"
//				,"8.¾È³çÁÖ¸£","9.°í»ıÇŞÁê¸£","10.¹İ°©Áê¸£","11.»õÇØº¹Áê¸£","12.¸Ş¸®Å©¸®½º¸¶Áê¸£"});
//		MessageChinese mc = new MessageChinese(new String[] {"0.´ÏÇÏ¿À", "1.Á¾Àº¾ÆÄ§ÇÏ¿À", "2.Ã°ÀÚÈ¿¿Ë", 
//				"3.½Ì¼§ÇÏ¼Í½¿´Ï±ø", "4.ÀåÂ¡³Ã¼Í½Â´×±ø", "5.¿Ë·©¸ÁÀ×¿¨¿ë", "6.¸Á³¶¼º¹æ°­¿ı¿ë", "7.¶Ë¸Á³¶¿ë"
//				,"8.¾Ó³ç","9.°ø»ıÇ×¼Í½Â´×´ç","10.¹æ°­½Â´×´ç","11.»ıÇàºÀ","12.¸æ¸µÅ¯¸µ½Â¸Á½Â"});
		Message mm = new Message(me,mj,mg,mf,mc);

		Scanner sc = new Scanner(System.in);

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
