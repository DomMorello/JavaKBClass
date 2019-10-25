package Event;
import java.text.SimpleDateFormat;
import java.util.*;
public class Human {

	//클래스 (정적)상수 필드 constant
	public static final int MALE = 1;
	public static final int FEMALE = 2;
	
	//객체 데이터 멤버변수
	public String name;
	public int age;
	public int gender;
	public String address;
	public String nation;	//국적
	
	public Human() {}	//기본 생성자
	
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
		System.out.println(name+"씨 여권정보");
		System.out.printf("국적: %s, 주소: %s, 나이: %d, 성별: %c", nation, address, age, (gender == Human.FEMALE ? '여':'남'));
		System.out.println("----------------------");
	}
}
