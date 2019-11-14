package greet;

import java.util.Scanner;

class MessageEnglish{
	String[] english = {
		"0.Hello","1.good morning","2.good night","3.ate?","4.how have u been?"
		,"5.long time no see","6.nice to meet you","7.see you later"
	};
	
	public void printEnglish() {
		for(String str : english) {
			System.out.println(str);
		}
	}
}
class MessageJapanese{
	String[] japanese = {
			"0.°õ¹æ¿Í","1.¿ÀÇÏÀÌ¿ä","2.Àğ³×","3.½Ä»çÇÏ¼Ìµ¥½º±î?","4.°Û³¢´åÅ¸±î?"
			,"5.È÷»ç½ÃºÎ¸®","6.µµÁÒ¿À·Î½Ã²ô¿À³×°¡ÀÌ½Ã¸¶½º","7.¶ÇºÁµ¥½º"
		};
	
	public void printJapanese() {
		for(String str : japanese) {
			System.out.println(str);
		}
	}
}
class MessageGerman{
	String[] german = {
			"0.±¸ÅÙÅ¹","1.ÁÁÀº¾ÆÄ§ÀÔ´ÏÅ¹!","2.ÀßÀÚ¿äÅ¹","3.¹ä¸Ô¾úÅ¹?","4.ÀßÁö³ÂÅ¹?"
			,"5.¿À·£¸¸ÀÔ´ÏÅ¹!","6.Ã³À½ºÁÅ¹!","7.¶ÇºÁÅ¹!"
		};
	
	public void printGerman() {
		for(String str : german) {
			System.out.println(str);
		}
	}
}
class MessageFranch{
	String[] franch = {
			"0.ºÀÁê¸£","1.ÁÁÀº¾ÆÄ§Áê¸£","2.ÀßÀÚÁê¸£","3.¹ä¸Ô¾úÁÖ¸£","4.ÀßÁö³»¼ÌÁÖ¸£"
			,"5.¿À·£¸¸ÀÔÁê¸£","6.Ã³À½ºË°Ú½ÀÁê¸£","7.¶ÇºÁÁê¸£"
		};
	
	public void printFranch() {
		for(String str : franch) {
			System.out.println(str);
		}
	}
}
class MessageChinese{
	String[] chinese = {
			"0.´ÏÇÏ¿À","1.Á¾Àº¾ÆÄ§ÇÏ¿À","2.Ã°ÀÚÈ¿¿Ë","3.½Ì¼§ÇÏ¼Í½¿´Ï±ø","4.ÀåÂ¡³Ã¼Í½Â´×±ø"
			,"5.¿Ë·©¸ÁÀ×¿¨¿ë","6.¸Á³¶¼º¹æ°­¿ı¿ë","7.¶Ë¸Á³¶¿ë"
		};
	
	public void printChinese() {
		for(String str : chinese) {
			System.out.println(str);
		}
	}
}

public class InheritMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
