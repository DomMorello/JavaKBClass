package Event;
import java.text.SimpleDateFormat;
import java.util.*;
public class EventMain {
	
	public static Human[] humans = {null,null,null,null,null,null,null,null,null,null};

	public static void addHuman(Human human) {
		for(int i=0; i < humans.length; i++) {
			if(humans[i] == null) {
				humans[i] = human;
				System.out.printf("[%02d]%s %s %d��\n",i+1, human.name, human.nation, human.age);
				break;
			}
		}
		if(humans[humans.length-1] != null) {
			System.out.println(human.name+"���� �̺�Ʈ�� ��÷���� ���߽��ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		
		
		Human h1 = new Human("�̵���",27,Human.MALE,"��ȭ","�ѱ�");
		Human h2 = new Human("����ȫ",45,Human.FEMALE,"������","�߱�");
		Human h3 = new Human("������",27,Human.FEMALE,"�̹���","�ѱ�");
		Human h4 = new Human("�躸��",13,Human.MALE,"�սʸ�","�ѱ�");
		Human h5 = new Human("������",27,Human.FEMALE,"����","�Ϻ�");
		Human h6 = new Human("������",25,Human.MALE,"�úξ�","�Ϻ�");
		Human h7 = new Human("������",73,Human.MALE,"�ϰ�","�߱�");
		Human h8 = new Human("������",45,Human.FEMALE,"�������ý���","�̱�");
		Human h9 = new Human("�̳���",26,Human.MALE,"������","�Ϻ�");
		Human h10 = new Human("�����",45,Human.FEMALE,"��ȣ��","�̱�");
		Human h11 = new Human("������",18,Human.MALE,"Ī����","�߱�");
		Human h12 = new Human("���̻�",64,Human.FEMALE,"����","�ѱ�");
		Human h13 = new Human("������",54,Human.FEMALE,"����","�ѱ�");
		Human h14 = new Human("������",32,Human.MALE,"������","�߱�");
		Human h15 = new Human("���˽�",34,Human.MALE,"����ī","�Ϻ�");
		Human h16 = new Human("������",35,Human.FEMALE,"����","�̱�");
		
		System.out.println("*** ��Ų ������ ���� �������� �̺�Ʈ ��÷�� ***");
		addHuman(h1);
		addHuman(h2);
		addHuman(h3);
		addHuman(h4);
		addHuman(h5);
		addHuman(h6);
		addHuman(h7);
		addHuman(h8);
		addHuman(h9);
		addHuman(h10);
		addHuman(h11);
		addHuman(h12);
		addHuman(h13);
		addHuman(h14);
		addHuman(h15);
		addHuman(h16);
	} 

}
