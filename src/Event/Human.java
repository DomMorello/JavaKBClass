package Event;
import java.text.SimpleDateFormat;
import java.util.*;
public class Human {

	//Ŭ���� (����)��� �ʵ� constant
	public static final int MALE = 1;
	public static final int FEMALE = 2;
	
	//��ü ������ �������
	public String name;
	public int age;
	public int gender;
	public String address;
	public String nation;	//����
	
	public Human() {}	//�⺻ ������
	
	public Human(String n) {
		name = n;
	}
	
	public Human(String n, int a) {
		name = n;
		age = a;
	}
	
	public Human(String n, int a, int gender) {
		name = n;
		age = a;
		this.gender = gender;
	}
	
	public Human(String name, int age, int gender, String address, String nation) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.nation = nation;
		
	}
	
	public void printSchoolInfo() {
		System.out.println(name+"�� ��������");
		System.out.printf("����: %s, �ּ�: %s, ����: %d, ����: %c", nation, address, age, (gender == Human.FEMALE ? '��':'��'));
		System.out.println("----------------------");
	}
}
