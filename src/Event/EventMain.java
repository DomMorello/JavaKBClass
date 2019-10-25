package Event;
import java.text.SimpleDateFormat;
import java.util.*;
public class EventMain {
	
	public static Human[] humans = {null,null,null,null,null,null,null,null,null,null};

	public static void addHuman(Human human) {
		for(int i=0; i < humans.length; i++) {
			if(humans[i] == null) {
				humans[i] = human;
				System.out.printf("[%02d]%s %s %d세\n",i+1, human.name, human.nation, human.age);
				break;
			}
		}
		if(humans[humans.length-1] != null) {
			System.out.println(human.name+"님은 이벤트에 담첨되지 못했습니다.");
		}
	}
	
	public static void main(String[] args) {
		
		
		Human h1 = new Human("이동현",27,Human.MALE,"혜화","한국");
		Human h2 = new Human("박진홍",45,Human.FEMALE,"상하이","중국");
		Human h3 = new Human("최유진",27,Human.FEMALE,"이문동","한국");
		Human h4 = new Human("김보민",13,Human.MALE,"왕십리","한국");
		Human h5 = new Human("레스피",27,Human.FEMALE,"도쿄","일본");
		Human h6 = new Human("노윈스",25,Human.MALE,"시부야","일본");
		Human h7 = new Human("버도에",73,Human.MALE,"북경","중국");
		Human h8 = new Human("에우이",45,Human.FEMALE,"샌프란시스코","미국");
		Human h9 = new Human("이노제",26,Human.MALE,"삿포로","일본");
		Human h10 = new Human("수드샾",45,Human.FEMALE,"존호세","미국");
		Human h11 = new Human("스제씨",18,Human.MALE,"칭따오","중국");
		Human h12 = new Human("리이쁠",64,Human.FEMALE,"종로","한국");
		Human h13 = new Human("눅에쁠",54,Human.FEMALE,"강남","한국");
		Human h14 = new Human("스스씨",32,Human.MALE,"상하이","중국");
		Human h15 = new Human("유알썬",34,Human.MALE,"오사카","일본");
		Human h16 = new Human("닉파이",35,Human.FEMALE,"뉴욕","미국");
		
		System.out.println("*** 던킨 도너츠 무료 더즌증정 이벤트 당첨자 ***");
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
