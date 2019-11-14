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
			"0.�����","1.�����̿�","2.���","3.�Ļ��ϼ̵�����?","4.�۳���Ÿ��?"
			,"5.����úθ�","6.���ҿ��νò����װ��̽ø���","7.�Ǻ�����"
		};
	
	public void printJapanese() {
		for(String str : japanese) {
			System.out.println(str);
		}
	}
}
class MessageGerman{
	String[] german = {
			"0.����Ź","1.������ħ�Դ�Ź!","2.���ڿ�Ź","3.��Ծ�Ź?","4.������Ź?"
			,"5.�������Դ�Ź!","6.ó����Ź!","7.�Ǻ�Ź!"
		};
	
	public void printGerman() {
		for(String str : german) {
			System.out.println(str);
		}
	}
}
class MessageFranch{
	String[] franch = {
			"0.���긣","1.������ħ�긣","2.�����긣","3.��Ծ��ָ�","4.���������ָ�"
			,"5.���������긣","6.ó���˰ڽ��긣","7.�Ǻ��긣"
		};
	
	public void printFranch() {
		for(String str : franch) {
			System.out.println(str);
		}
	}
}
class MessageChinese{
	String[] chinese = {
			"0.���Ͽ�","1.������ħ�Ͽ�","2.ð��ȿ��","3.�̼��ϼͽ��ϱ�","4.��¡�üͽ´ױ�"
			,"5.�˷����׿���","6.�������氭����","7.�˸�����"
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
