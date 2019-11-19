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
				System.out.println("�Է¿���!");
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
//		MessageEnglish me = new MessageEnglish(new String[]{"0.Hello", "1.good morning", "2.good night", 
//				"3.ate?", "4.how have u been?","5.long time no see", "6.nice to meet you", "7.see you later"
//				,"8.Hi", "9.good job", "10.glad to see you", "11.happy new year","12.Merry christmas"});
//		MessageJapanese mj = new MessageJapanese(new String[] {"0.�����", "1.�����̿�", "2.���", 
//				"3.�Ļ��ϼ̵�����?", "4.�۳���Ÿ��?", "5.����úθ�", "6.���ҿ��νò����װ��̽ø���", "7.�Ǻ�����"
//				,"8.����","9.��ġ�λ縶","10.�췹����","11.���غ��̺��̵���","12.�޸�ũ������������"});
//		MessageGerman mg = new MessageGerman(new String[] {"0.����Ź", "1.������ħ�Դ�Ź!", "2.���ڿ�Ź", 
//				"3.��Ծ�Ź?", "4.������Ź?", "5.�������Դ�Ź!", "6.ó����Ź!", "7.�Ǻ�Ź!"
//				,"8.�ȳ�Ź!","9.�����Ź!","10.�ݰ�Ź!","11.���غ����̹���Ź!","12.�޸�ũ��������Ź!"});
//		MessageFranch mf = new MessageFranch(new String[] {"0.���긣", "1.������ħ�긣", "2.�����긣", 
//				"3.��Ծ��ָ�", "4.���������ָ�", "5.���������긣", "6.ó���˰ڽ��긣", "7.�Ǻ��긣"
//				,"8.�ȳ��ָ�","9.������긣","10.�ݰ��긣","11.���غ��긣","12.�޸�ũ�������긣"});
//		MessageChinese mc = new MessageChinese(new String[] {"0.���Ͽ�", "1.������ħ�Ͽ�", "2.ð��ȿ��", 
//				"3.�̼��ϼͽ��ϱ�", "4.��¡�üͽ´ױ�", "5.�˷����׿���", "6.�������氭����", "7.�˸�����"
//				,"8.�ӳ�","9.�����׼ͽ´״�","10.�氭�´״�","11.�����","12.�渵ů���¸���"});
		Message mm = new Message(me,mj,mg,mf,mc);

		Scanner sc = new Scanner(System.in);

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
