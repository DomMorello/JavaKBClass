package greet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
	
	public String mySubstring(String input, int start) {
		String result = "";
		for(int i=start; i < input.length(); i++) {
			String tmp = input.charAt(i)+"";
			result += tmp;
		}
		return result;
	}
	
	public String mySubstring(String input, int start, int end) {
		String result = "";
		for(int i=start; i < end; i++) {
			String tmp = input.charAt(i) + "";
			result += tmp;
		}
		return result;
	}
	
	//String¹è¿­À» ÀÌ¿ëÇÑ mySplit¸Ş¼­µå
	public String[] mySplit(String input, char delimiter) {
		//delimiterÀÇ °³¼ö¸¦ ÆÄ¾ÇÇÑ ÈÄ ÀÌ °³¼öº¸´Ù 1Å« Å©±â·Î String¹è¿­À» »ı¼º
		int strSize = 0;
		for(int i=0; i < input.length(); i++) {
			if(input.charAt(i) == delimiter) {
				strSize++;
			}
		}
		strSize += 1;
		String[] result = new String[strSize];
		
		String tmp = "";
		int strIdx = 0;
		int arrIdx = 0;
		for(int i=0; i < input.length(); i++) {
			strIdx = i;
			if(input.charAt(i) == delimiter) {
				result[arrIdx++] = tmp.trim();
				tmp = "";
				continue;
			}
			tmp += input.charAt(i);
			
			if(strIdx == input.length()-1) {
				result[arrIdx] = tmp.trim();
			}
		}
		return result;
	}
	//ArrayList¸¦ ÀÌ¿ëÇÑ mySplit¸Ş¼­µå
	public ArrayList<String> mySplit(String input, String delimiter) {
//		String[] result = new String[10];	//String¹è¿­·Î ÇÏ¸é Á¤È®ÇÏ°Ô ¾î´À Á¤µµ Å©±â¸¦ ÀÔ·Â¹ŞÀ»Áö ¸ğ¸£±â ¶§¹®¿¡
											//ÃæºĞÇÑ Å©±â·Î ¼³Á¤ÇØ³öµµ nullpointerexceptionÀÌ ¹ß»ıÇÔ.
		ArrayList<String> result = new ArrayList<>();	//±×·¡¼­ ArrayList·Î Çß´Ù.
		String tmp = "";
		int strIdx = 0;	//½°Ç¥ ¸¶Áö¸·¿¡ ³ª¿À´Â StringÀ» arraylist¿¡ ³Ö±â À§ÇØ ¼±¾ğ
		for(int i=0; i < input.length(); i++) {
			strIdx = i;
			if((input.charAt(i)+"").equals(delimiter)) {
				result.add(tmp.trim());	//delimiter°¡ ³ª¿À±â Àü±îÁöÀÇ stringÀ» list¿¡ Ãß°¡
				tmp = "";	//Ãß°¡ ÇÑ ÈÄ¿¡´Â ºó ¹®ÀÚ¿­·Î ÃÊ±âÈ­
				continue;
			}
			tmp += input.charAt(i);	//delimiterÀü±îÁö´Â charAtÀ» ¹®ÀÚ¿­·Î ¸¸µê
			
			if(strIdx == input.length()-1) {	//½°Ç¥ ÀÌÈÄ¿¡ ³ª¿À´Â ¸¶Áö¸· stringÀ» list¿¡ Ãß°¡
				result.add(tmp.trim());
			}
		}
		return result;
	}

	public void getMessage(String input) {
		input = input.toLowerCase();
		if (input.length() > 2) {
			if (mySubstring(input, 0, 2).equals("en")) {
				System.out.println(me.message[Integer.parseInt(mySubstring(input,2))]);
			} else if (mySubstring(input, 0, 2).equals("jp")) {
				System.out.println(mj.message[Integer.parseInt(mySubstring(input,2))]);
			} else if (mySubstring(input, 0, 2).equals("gm")) {
				System.out.println(mg.message[Integer.parseInt(mySubstring(input,2))]);
			} else if (mySubstring(input, 0, 2).equals("fr")) {
				System.out.println(mf.message[Integer.parseInt(mySubstring(input,2))]);
			} else if (mySubstring(input, 0, 2).equals("ch")) {
				System.out.println(mc.message[Integer.parseInt(mySubstring(input,2))]);
			}
		} else {
			if (mySubstring(input, 0).equals("en")) {
				me.printAllMessage(me.message);
			} else if (mySubstring(input, 0).equals("jp")) {
				mj.printAllMessage(mj.message);
			} else if (mySubstring(input, 0).equals("gm")) {
				mg.printAllMessage(mg.message);
			} else if (mySubstring(input, 0).equals("fr")) {
				mf.printAllMessage(mf.message);
			} else if (mySubstring(input, 0).equals("ch")) {
				mc.printAllMessage(mc.message);
			}

		}
	}
	
	public static void main(String[] args) {
//		MessageEnglish me = new MessageEnglish(new String[]{"0.Hello", "1.good morning", "2.good night", 
//				"3.ate?", "4.how have u been?","5.long time no see", "6.nice to meet you", "7.see you later"});
//		MessageJapanese mj = new MessageJapanese(new String[] {"0.°õ¹æ¿Í", "1.¿ÀÇÏÀÌ¿ä", "2.Àğ³×", 
//				"3.½Ä»çÇÏ¼Ìµ¥½º±î?", "4.°Û³¢´åÅ¸±î?", "5.È÷»ç½ÃºÎ¸®", "6.µµÁÒ¿À·Î½Ã²ô¿À³×°¡ÀÌ½Ã¸¶½º", "7.¶ÇºÁµ¥½º"});
//		MessageGerman mg = new MessageGerman(new String[] {"0.±¸ÅÙÅ¹", "1.ÁÁÀº¾ÆÄ§ÀÔ´ÏÅ¹!", "2.ÀßÀÚ¿äÅ¹", 
//				"3.¹ä¸Ô¾úÅ¹?", "4.ÀßÁö³ÂÅ¹?", "5.¿À·£¸¸ÀÔ´ÏÅ¹!", "6.Ã³À½ºÁÅ¹!", "7.¶ÇºÁÅ¹!"});
//		MessageFranch mf = new MessageFranch(new String[] {"0.ºÀÁê¸£", "1.ÁÁÀº¾ÆÄ§Áê¸£", "2.ÀßÀÚÁê¸£", 
//				"3.¹ä¸Ô¾úÁÖ¸£", "4.ÀßÁö³»¼ÌÁÖ¸£", "5.¿À·£¸¸ÀÔÁê¸£", "6.Ã³À½ºË°Ú½ÀÁê¸£", "7.¶ÇºÁÁê¸£"});
//		MessageChinese mc = new MessageChinese(new String[] {"0.´ÏÇÏ¿À", "1.Á¾Àº¾ÆÄ§ÇÏ¿À", "2.Ã°ÀÚÈ¿¿Ë", 
//				"3.½Ì¼§ÇÏ¼Í½¿´Ï±ø", "4.ÀåÂ¡³Ã¼Í½Â´×±ø", "5.¿Ë·©¸ÁÀ×¿¨¿ë", "6.¸Á³¶¼º¹æ°­¿ı¿ë", "7.¶Ë¸Á³¶¿ë"});
		MessageEnglish me = new MessageEnglish(new String[]{"0.Hello", "1.good morning", "2.good night", 
				"3.ate?", "4.how have u been?","5.long time no see", "6.nice to meet you", "7.see you later"
				,"8.Hi", "9.good job", "10.glad to see you", "11.happy new year","12.Merry christmas"});
		MessageJapanese mj = new MessageJapanese(new String[] {"0.°õ¹æ¿Í", "1.¿ÀÇÏÀÌ¿ä", "2.Àğ³×", 
				"3.½Ä»çÇÏ¼Ìµ¥½º±î?", "4.°Û³¢´åÅ¸±î?", "5.È÷»ç½ÃºÎ¸®", "6.µµÁÒ¿À·Î½Ã²ô¿À³×°¡ÀÌ½Ã¸¶½º", "7.¶ÇºÁµ¥½º"
				,"8.µµ¸ğ","9.°íÄ¡·Î»ç¸¶","10.¿ì·¹½ÃÀÌ","11.»õÇØº¹ÀÌºüÀÌµ¥½º","12.¸Ş¸®Å©¸®½º¸¶½ºµ¥½º"});
		MessageGerman mg = new MessageGerman(new String[] {"0.±¸ÅÙÅ¹", "1.ÁÁÀº¾ÆÄ§ÀÔ´ÏÅ¹!", "2.ÀßÀÚ¿äÅ¹", 
				"3.¹ä¸Ô¾úÅ¹?", "4.ÀßÁö³ÂÅ¹?", "5.¿À·£¸¸ÀÔ´ÏÅ¹!", "6.Ã³À½ºÁÅ¹!", "7.¶ÇºÁÅ¹!"
				,"8.¾È³çÅ¹!","9.°í»ıÇßÅ¹!","10.¹İ°©Å¹!","11.»õÇØº¹¸¹ÀÌ¹ŞÀ¸Å¹!","12.¸Ş¸®Å©¸®½º¸¶½ºÅ¹!"});
		MessageFranch mf = new MessageFranch(new String[] {"0.ºÀÁê¸£", "1.ÁÁÀº¾ÆÄ§Áê¸£", "2.ÀßÀÚÁê¸£", 
				"3.¹ä¸Ô¾úÁÖ¸£", "4.ÀßÁö³»¼ÌÁÖ¸£", "5.¿À·£¸¸ÀÔÁê¸£", "6.Ã³À½ºË°Ú½ÀÁê¸£", "7.¶ÇºÁÁê¸£"
				,"8.¾È³çÁÖ¸£","9.°í»ıÇŞÁê¸£","10.¹İ°©Áê¸£","11.»õÇØº¹Áê¸£","12.¸Ş¸®Å©¸®½º¸¶Áê¸£"});
		MessageChinese mc = new MessageChinese(new String[] {"0.´ÏÇÏ¿À", "1.Á¾Àº¾ÆÄ§ÇÏ¿À", "2.Ã°ÀÚÈ¿¿Ë", 
				"3.½Ì¼§ÇÏ¼Í½¿´Ï±ø", "4.ÀåÂ¡³Ã¼Í½Â´×±ø", "5.¿Ë·©¸ÁÀ×¿¨¿ë", "6.¸Á³¶¼º¹æ°­¿ı¿ë", "7.¶Ë¸Á³¶¿ë"
				,"8.¾Ó³ç","9.°ø»ıÇ×¼Í½Â´×´ç","10.¹æ°­½Â´×´ç","11.»ıÇàºÀ","12.¸æ¸µÅ¯¸µ½Â¸Á½Â"});
		Message mm = new Message(me,mj,mg,mf,mc);
		Scanner sc = new Scanner(System.in);

			while (true) {
				System.out.print("* ÀÎ»ç¸» ¼±ÅÃ ÀÔ·Â: ");
				try {
//					ArrayList<String> listInput = new ArrayList<>();
//					listInput = mm.mySplit(sc.next(),",");	//mySplitÀ¸·Î returnÇÑ list¸¦ ÂüÁ¶
//					String[] input = listInput.toArray(new String[listInput.size()]);//String¹è¿­·Î ÀüÈ¯
					String[] input = mm.mySplit(sc.nextLine().trim(), ',');
//					System.out.println(Arrays.toString(input));
					if (input[0].equals("exit")) {
						System.out.println("<Á¾·á>");
						break;
					}
					for (int i = 0; i < input.length; i++) {
						mm.getMessage(input[i]);
					}
				}catch(Exception e) {
					System.out.println("ÀÔ·Â ¿À·ù!");
				}
			}

	}
}
